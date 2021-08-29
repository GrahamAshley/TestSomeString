package com.test.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 101217
 * @Date 2021/7/6
 * @Version 1.0
 */
@Data
@ApiModel(value="登录成功后返回的个人信息")
public class NameSpace {
    @ApiModelProperty(value="用户名")
    private String userName;//用户名
    @ApiModelProperty(value="密码")
    private String password;//用户名

}
