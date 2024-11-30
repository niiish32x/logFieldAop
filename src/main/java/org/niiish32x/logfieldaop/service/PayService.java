package org.niiish32x.logfieldaop.service;

import org.niiish32x.logfieldaop.common.Result;
import org.niiish32x.logfieldaop.domain.entity.AccountEO;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;

public interface PayService {

    /**
     * 创建 支付记录 并更新账户余额
     * @param paymentEO
     * @param accountEO
     * @return
     */
    Result pay(PaymentEO paymentEO, AccountEO accountEO);
}
