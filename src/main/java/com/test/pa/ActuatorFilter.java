package com.test.pa;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RefreshScope
public class ActuatorFilter implements Filter {

    public static final String UNKNOWN = "unknown";

    @Value("${shutdown.whitelist}")
    private String[] shutdownIpWhitelist;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) srequest;

        String ip = this.getIpAddress(request);

        log.info("访问shutdown的机器的原始IP：{}", ip);

        if (!isMatchWhiteList(ip)) {
            sresponse.setContentType("application/json");
            sresponse.setCharacterEncoding("UTF-8");
            PrintWriter writer = sresponse.getWriter();
            writer.write("{\"code\":401,\"error\":\"IP access forbidden\"}");
            writer.flush();
            writer.close();
            log.warn("ip：{}禁止shutdown", ip);
            return;
        }

        filterChain.doFilter(srequest, sresponse);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        log.info("Actuator filter is init.....");
    }

    /**
     * 匹配是否是白名单
     */
    private boolean isMatchWhiteList(String ip) {
        List<String> list = Arrays.asList(shutdownIpWhitelist);
        return list.stream().anyMatch(item -> ip.startsWith(item));
    }

    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
     * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
     *
     * 如：X-Forwarded-For：192.168.1.110, 192.168.1.120, 192.168.1.130, 192.168.1.100
     *
     * 用户真实IP为： 192.168.1.110
     */
    private String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isBlank(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isBlank(ip) || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
