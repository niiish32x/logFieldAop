package org.niiish32x.logfieldaop.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountEO {

    // 账户编号，唯一标识每个账户
    private Long id;

    // 关联的客户编号，表明该账户所属的客户
    private Long customerId;

    // 账户余额
    private BigDecimal balance;

    // 账户类型，例如现金账户、信用卡账户、储蓄账户等
    private String accountType;

    // 账户状态，如正常、冻结、注销等
    private String accountStatus;
}