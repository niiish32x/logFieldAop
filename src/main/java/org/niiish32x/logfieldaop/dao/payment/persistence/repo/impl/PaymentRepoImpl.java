package org.niiish32x.logfieldaop.dao.payment.persistence.repo.impl;

import org.niiish32x.logfieldaop.dao.payment.persistence.dao.PaymentDAO;
import org.niiish32x.logfieldaop.dao.payment.persistence.converter.PaymentConverter;
import org.niiish32x.logfieldaop.dao.payment.PaymentDO;
import org.niiish32x.logfieldaop.dao.payment.persistence.repo.PaymentRepo;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class PaymentRepoImpl implements PaymentRepo {

    PaymentConverter converter = PaymentConverter.INSTANCE;

    @Resource
    PaymentDAO paymentDAO;


    @Override
    public List<PaymentEO> find() {
        List<PaymentDO> paymentDOS = paymentDAO.lambdaQuery().list();

        return paymentDOS.stream().map(converter::toEO).collect(Collectors.toList());
    }

    @Override
    public PaymentEO find(long id) {
        PaymentDO paymentDO = paymentDAO.lambdaQuery().eq(PaymentDO::getId, id).one();
        return converter.toEO(paymentDO);
    }


    @Override
    public BigDecimal findAmount(long id) {
        PaymentDO paymentDO = paymentDAO.lambdaQuery().eq(PaymentDO::getId, id).one();
        return paymentDO.getAmount();
    }

    @Override
    public boolean save(PaymentEO paymentEO) {

        PaymentEO existPayment = find(paymentEO.getId());
        if(existPayment != null) {
            // 已存在 只更新
            paymentEO.setPaymentDate(paymentEO.getPaymentDate());
            paymentEO.setAmount(paymentEO.getAmount());
            paymentEO.setPaymentMethod(paymentEO.getPaymentMethod());
            paymentEO.setCustomerId(paymentEO.getCustomerId());
            paymentEO.setPaymentStatus(paymentEO.getPaymentStatus());
        }

        PaymentDO saveDO = converter.toDO(paymentEO);
        return paymentDAO.save(saveDO);
    }
}

































