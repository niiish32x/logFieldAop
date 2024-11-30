package org.niiish32x.logfieldaop.dao.customer.persistence;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("customer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDO {

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