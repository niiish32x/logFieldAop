package org.niiish32x.logfieldaop.controller;


import org.niiish32x.logfieldaop.common.Result;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;
import org.niiish32x.logfieldaop.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    PayService payService;

    @RequestMapping("/cratePayment")
    public Result <PaymentEO> createPayment(@RequestBody PaymentEO paymentEO) {
        return payService.createPayment(paymentEO);
    }
}
