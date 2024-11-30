package org.niiish32x.logfieldaop.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerEO {

    // 客户编号，主键，唯一标识每个客户
    private Long id;

    // 客户姓名
    private String customerName;

    // 客户联系电话
    private String phoneNumber;

    // 客户电子邮箱
    private String email;

    // 客户地址
    private String address;

    // 客户注册日期
    private Date registrationDate;

    // 客户信用等级，可用于评估客户的信用状况
    private String creditLevel;


}