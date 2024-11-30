package org.niiish32x.logfieldaop.dao.payment.repo;

import org.niiish32x.logfieldaop.domain.entity.PaymentEO;

import java.util.List;

public interface PaymentRepo {
    List<PaymentEO> findAll();
 }
