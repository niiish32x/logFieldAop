package org.niiish32x.logfieldaop.dao.payment.persistence.repo;

import org.niiish32x.logfieldaop.common.Result;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentRepo {
    List<PaymentEO> find();

    PaymentEO find(long id);


    /**
     * 获取订单金额
     * @param id
     * @return
     */
    BigDecimal findAmount(long id);


    boolean save(PaymentEO paymentEO);
 }
