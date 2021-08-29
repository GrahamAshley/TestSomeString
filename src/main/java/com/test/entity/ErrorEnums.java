package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常返回信息枚举
 *
 * @author 赵海涛
 * @version $ID:ErrorEnums, v0.1 2018/3/30 赵海涛 Exp $
 */
@Getter
@AllArgsConstructor
public enum ErrorEnums {

    //权限异常
    SYSTEM_NOT_AUTHENTICATION_ERROR("401", "用户暂未认证"),
    SYSTEM_UNAUTHORIZED_ERROR("403", "用户无权限"),
    SYSTEM_TOKEN_VALIDATOR_ERROR("998", "TOKEN验证错误"),
    SYSTEM_SQL_INJECT_ERROR("999", "参数存在sql注入风险"),
    SYSTEM_ALREADY_LOGIN("error_login","您的账号已在其他终端登录，如不是您本人操作，请及时联系后台"),

    //==================通用错误码定义====================
    SUCCESS("000000", "交易成功"),
    SYSTEM_BEAN_COPY_ERROR("000001", "对象拷贝异常"),
    SYSTEM_STRING_TO_DATE_ERROR("000002", "字符串转日期失败"),
    SYSTEM_PARAM_VALIDATOR_ERROR("000003", "参数校验失败"),

    DB_ERROR("000010", "数据库查询异常"),
    DB_INSERT_ERROR("000011", "数据库插入异常"),
    DB_UPDATE_ERROR("000012", "数据库更新异常"),
    DB_SELECT_ERROR("000013", "数据库查询异常"),

    LOGIN_ERROR("000020", "登录失败"),
    LOGIN_USER_NOT_EXIST_ERROR("000021", "用户不存在"),
    LOGIN_AUTHENTICATION_FAILURE("000022", "身份验证失败"),
    LOGIN_AD_CONNECT_ERROR("000023", "AD域连接失败"),
    LOGIN_TOKEN_CREATE_ERROR("000024", "token生成失败"),
    LOGIN_USER_DISABLED("000025", "用户状态为无效状态"),
    LOGIN_NO_PERMISSION("000026", "用户没有权限登陆"),

	REQUEST_PARAMS_DECRYPT_ERROR("000030", "请求参数解密失败"),
    RESPONSE_BODY_ENCRYPT_ERROR("000031","响应报文体加密异常"),

	RONG_CLOUD_REST_ERROR("000408", "融云服务端请求失败"),
	
	FILE_NOT_EXIST_ERROR("000501", "文件不存在"),
	FILE_CONTENT_ERROR("000502", "获取文件内容失败"),
	FILE_INIT_ERROR("000502", "文件内容初始化失败"),

    WX_TOKEN_ERROR("400001","获取微信token失败"),
    WX_JSAPI_TICKET_ERROR("400002","获取微信JsapiTicket失败"),
    WX_MINI_ERROR("400003","微信小程序异常"),

    EMAIL_ACCOUNT_ERROR("000600","邮箱账号不能为空"),
    EMAIL_PASSWORD_ERROR("000601","邮箱密码不能为空"),
    EMAIL_HOSTURL_ERROR("000603","邮箱服务器地址不能为空"),

    BAIDU_ERROR("800000","百度接口异常"),

    SERVER_ERR("500","服务异常")
    ;
	
	
    private final String code;
    private final String desc;

}
