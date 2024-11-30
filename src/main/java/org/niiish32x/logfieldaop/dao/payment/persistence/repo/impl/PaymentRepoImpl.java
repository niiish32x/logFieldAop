package org.niiish32x.logfieldaop.dao.payment.persistence.repo.impl;

import org.niiish32x.logfieldaop.dao.payment.persistence.dao.PaymentDAO;
import org.niiish32x.logfieldaop.dao.payment.persistence.converter.PaymentConverter;
import org.niiish32x.logfieldaop.dao.payment.PaymentDO;
import org.niiish32x.logfieldaop.dao.payment.persistence.repo.PaymentRepo;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class PaymentRepoImpl implements PaymentRepo {

    PaymentConverter converter = PaymentConverter.INSTANCE;

    @Resource
    PaymentDAO paymentDAO;


    @Override
    public List<PaymentEO> findAll() {
        List<PaymentDO> paymentDOS = paymentDAO.lambdaQuery().list();

        return paymentDOS.stream().map(converter::toEO).collect(Collectors.toList());
    }
}
