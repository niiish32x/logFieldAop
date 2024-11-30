package org.niiish32x.logfieldaop.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PaymentEO {

    // 支付编号，唯一标识一笔支付记录
    private Long id;

    // 支付金额
    private BigDecimal amount;

    // 支付日期
    private Date paymentDate;

    // 支付方式，比如信用卡、银行转账、现金等
    private String paymentMethod;

    // 支付状态，例如已支付、未支付、部分支付等
    private String paymentStatus;

    // 客户编号，用于关联到具体的客户信息
    private Long customerId;
}
