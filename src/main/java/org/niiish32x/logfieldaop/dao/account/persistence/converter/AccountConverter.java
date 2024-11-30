package org.niiish32x.logfieldaop.dao.account.persistence.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.niiish32x.logfieldaop.dao.account.AccountDO;
import org.niiish32x.logfieldaop.domain.entity.AccountEO;

@Mapper
public interface AccountConverter {

    AccountConverter INSTANCE = Mappers.getMapper(AccountConverter.class);

    AccountDO toDO (AccountEO accountEO);


    AccountEO toEO (AccountDO accountDO);
}
