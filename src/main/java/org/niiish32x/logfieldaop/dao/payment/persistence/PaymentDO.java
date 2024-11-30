package org.niiish32x.logfieldaop.dao.payment.persistence;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@TableName("payment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDO {

    // 支付编号，对应数据库表中的id字段
    @TableId(type = IdType.AUTO)
    private Long id;

    // 支付金额，对应数据库表中的amount字段
    private BigDecimal amount;

    // 支付日期，对应数据库表中的payment_date字段
    private Date paymentDate;

    // 支付方式，对应数据库表中的payment_method字段
    private String paymentMethod;

    // 支付状态，对应数据库表中的payment_status字段
    private String paymentStatus;

    // 客户编号，对应数据库表中的customer_id字段，用于关联客户信息
    private Long customerId;

}