package com.test.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RespStatus implements Serializable {

    public static final long CODE_SUCCESSFUL = 0L;

    public static final String MSG_SUCCESSFUL = "ok";

    public static final long CODE_FAILED = 1L;

    public static final String MSG_FAILED = "failed";

    public static final long CODE_UNAUTHORIZED = 401L;

    public static final String MSG_UNAUTHORIZED = "unauthorized";

    public static final int CODE_VALIDATION_NOT_OK = 900;

    public static final String MSG_VALIDATION_NOT_OK = "validation not ok";

    public static final RespStatus SUCCESSFUL = new RespStatus(String.valueOf(CODE_SUCCESSFUL), MSG_SUCCESSFUL);

    public static final RespStatus FAILED = new RespStatus(String.valueOf(CODE_FAILED), MSG_FAILED);

    public static final RespStatus UNAUTHORIZED = new RespStatus(String.valueOf(CODE_UNAUTHORIZED), MSG_UNAUTHORIZED);

    @ApiModelProperty(notes = "状态码 0:成功 1:失败")
    private String code;

    @ApiModelProperty(notes = "请求返回信息")
    private String msg;

    public RespStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RespStatus(ErrorEnums enums) {
        this.code = enums.getCode();
        this.msg = enums.getDesc();
    }

    public RespStatus() {
    }
}
