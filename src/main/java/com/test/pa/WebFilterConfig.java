package com.test.pa;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebFilterConfig extends WebMvcConfigurationSupport {

    @Bean
    public ActuatorFilter getActuatorFilter() {
        return new ActuatorFilter();
    }

    @Bean
    public FilterRegistrationBean setShutdownFilter(ActuatorFilter actuatorFilter) {
        FilterRegistrationBean<ActuatorFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(actuatorFilter);
        registrationBean.setName("actuatorFilter");
        registrationBean.addUrlPatterns("/actuator/shutdown");
        return registrationBean;
    }

}