package org.niiish32x.logfieldaop.dao.customer.persistence.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.niiish32x.logfieldaop.dao.customer.CustomerDO;
import org.niiish32x.logfieldaop.domain.entity.CustomerEO;

import java.util.List;

@Mapper(imports = {JSON.class, TypeReference.class, List.class})
public interface CustomerConverter {
    CustomerConverter INSTANCE = Mappers.getMapper(CustomerConverter.class);

    CustomerEO toEO (CustomerDO customerDO);

    CustomerDO toDO (CustomerEO customerEO);

}
