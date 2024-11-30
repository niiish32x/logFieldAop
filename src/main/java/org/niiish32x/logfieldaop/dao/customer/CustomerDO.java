package org.niiish32x.logfieldaop.dao.customer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId(type = IdType.AUTO)
    private Long id;

    // 客户姓名
    @TableField("customer_name")
    private String customerName;


    // 客户联系电话
    @TableField("phone_number")
    private String phoneNumber;

    // 客户电子邮箱
    @TableField("email")
    private String email;

    // 客户地址
    @TableField("address")
    private String address;

    // 客户注册日期
    @TableField("registration_date")
    private Date registrationDate;

    // 客户信用等级，可用于评估客户的信用状况
    @TableField("credit_level")
    private String creditLevel;

}