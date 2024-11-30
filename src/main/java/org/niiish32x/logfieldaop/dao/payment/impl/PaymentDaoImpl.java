package org.niiish32x.logfieldaop.dao.payment.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.niiish32x.logfieldaop.dao.payment.PaymentDAO;
import org.niiish32x.logfieldaop.dao.payment.persistence.PaymentDO;
import org.niiish32x.logfieldaop.dao.payment.persistence.mapper.PaymentMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentDaoImpl extends ServiceImpl<PaymentMapper, PaymentDO> implements PaymentDAO {
}
