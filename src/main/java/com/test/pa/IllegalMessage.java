package com.test.pa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author renyongshu
 * @date 2021/6/19 11:02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IllegalMessage {
    //uuid
    private String messageId;
    private String className;
    private Date createTime;
    //延迟时间
    private Integer delay;
    //工号
    private String workNo;
    //管家手机号
    private String phone;
    //客户手机号
    private String customerPhone;
    //客户名
    private String customerName;
    //客户Id
    private String customerId;
    //判断时间标识  30/60
    private Integer time;
}
