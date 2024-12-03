package org.niiish32x.logfieldaop.service.impl;


import org.niiish32x.logfieldaop.aspect.annotation.LogFieldAsp;
import org.niiish32x.logfieldaop.common.result.Result;
import org.niiish32x.logfieldaop.dao.account.persistence.repo.AccountRepo;
import org.niiish32x.logfieldaop.dao.customer.persistence.repo.CustomerRepo;
import org.niiish32x.logfieldaop.dao.payment.persistence.repo.PaymentRepo;
import org.niiish32x.logfieldaop.domain.entity.AccountEO;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;
import org.niiish32x.logfieldaop.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@Service
public class PayServiceImpl implements PayService {

    @Resource
    PaymentRepo paymentRepo;

    @Resource
    AccountRepo accountRepo;

    @Resource
    CustomerRepo customerRepo;


    @Override
    @LogFieldAsp
    public Result pay(PaymentEO paymentEO, AccountEO accountEO) {

        // 检查支付金额 是否有效
        if (paymentEO.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            return Result.error("金额不足 无法支付");
        }

        // 检查账户 余额是否 足够支付
        if (accountEO.getBalance().compareTo(paymentEO.getAmount()) < 0) {
            return Result.error("账户余额不足 无法完成支付");
        }

        // 设置支付日期为当前日期（如果在PaymentEO中未预先设置）
        if (paymentEO.getPaymentDate() == null) {
            paymentEO.setPaymentDate(new Date());
        }

        // 更新 账号 余额
        boolean updateRes = accountRepo.updateWithLock(paymentEO.getId(), paymentEO.getAmount());


        return updateRes ? Result.success() : Result.error("支付错误");
    }

    @Override
    public Result createPayment(PaymentEO paymentEO) {
        boolean res = paymentRepo.save(paymentEO);
        return res ? Result.success() : Result.error("保存失败");
    }
}
