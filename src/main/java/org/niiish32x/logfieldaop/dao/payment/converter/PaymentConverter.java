package org.niiish32x.logfieldaop.dao.payment.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.niiish32x.logfieldaop.dao.payment.persistence.PaymentDO;
import org.niiish32x.logfieldaop.domain.entity.PaymentEO;

import java.util.List;

@Mapper(imports = {JSON.class, TypeReference.class, List.class})
public interface PaymentConverter {
    PaymentConverter INSTANCE = Mappers.getMapper(PaymentConverter.class);

    PaymentEO  toEO (PaymentDO paymentDO);

    PaymentDO toDO (PaymentEO paymentEO) ;
}
