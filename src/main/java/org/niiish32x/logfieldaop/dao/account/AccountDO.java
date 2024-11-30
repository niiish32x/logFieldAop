package org.niiish32x.logfieldaop.dao.account;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class AccountDO {
    // 账户编号，对应数据库表中的id字段
    private Long id;

    // 关联的客户编号，对应数据库表中的customer_id字段
    private Long customerId;

    // 账户余额，对应数据库表中的balance字段
    private BigDecimal balance;

    // 账户类型，对应数据库表中的account_type字段
    private String accountType;

    // 账户状态，对应数据库表中的account_status字段
    private String accountStatus;
}
