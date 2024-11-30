package org.niiish32x.logfieldaop.dao.payment.repo.impl;

import org.niiish32x.logfieldaop.dao.payment.PaymentDAO;
import org.niiish32x.logfieldaop.dao.payment.converter.PaymentConverter;
import org.niiish32x.logfieldaop.dao.payment.persistence.PaymentDO;
import org.niiish32x.logfieldaop.dao.payment.repo.PaymentRepo;
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
