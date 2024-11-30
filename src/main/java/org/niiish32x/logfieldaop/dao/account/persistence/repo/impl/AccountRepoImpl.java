package org.niiish32x.logfieldaop.dao.account.persistence.repo.impl;

import org.niiish32x.logfieldaop.dao.account.AccountDO;
import org.niiish32x.logfieldaop.dao.account.persistence.converter.AccountConverter;
import org.niiish32x.logfieldaop.dao.account.persistence.dao.AccountDAO;
import org.niiish32x.logfieldaop.dao.account.persistence.repo.AccountRepo;
import org.niiish32x.logfieldaop.domain.entity.AccountEO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AccountRepoImpl implements AccountRepo {

    AccountConverter converter = AccountConverter.INSTANCE;


    @Resource
    AccountDAO accountDAO;

    @Override
    public List<AccountEO> findAll() {
        List<AccountDO> accountDOS = accountDAO.lambdaQuery().list();
        return accountDOS.stream().map(converter::toEO).collect(Collectors.toList());
    }
}
