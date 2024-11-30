package org.niiish32x.logfieldaop.dao.account.persistence.repo.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.mybatis.spring.SqlSessionTemplate;
import org.niiish32x.logfieldaop.dao.account.AccountDO;
import org.niiish32x.logfieldaop.dao.account.persistence.converter.AccountConverter;
import org.niiish32x.logfieldaop.dao.account.persistence.dao.AccountDAO;
import org.niiish32x.logfieldaop.dao.account.persistence.repo.AccountRepo;
import org.niiish32x.logfieldaop.domain.entity.AccountEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AccountRepoImpl implements AccountRepo {

    AccountConverter converter = AccountConverter.INSTANCE;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Resource
    AccountDAO accountDAO;

    @Override
    public List<AccountEO> find() {
        List<AccountDO> accountDOS = accountDAO.lambdaQuery().list();
        return accountDOS.stream().map(converter::toEO).collect(Collectors.toList());
    }

    @Override
    public AccountEO find(Long id) {
        AccountDO accountDO = accountDAO.lambdaQuery().eq(AccountDO::getId, id).one();
        return converter.toEO(accountDO);
    }

    @Override
    public AccountEO findWithLock(Long id) {
        AccountDO accountDO = accountDAO.lambdaQuery().eq(AccountDO::getId, id).last("FOR UPDATE").one();
        return converter.toEO(accountDO);
    }

    @Override
    public BigDecimal getBalance(int id) {
        AccountDO accountDO = accountDAO.lambdaQuery().eq(AccountDO::getId, id).one();
        return accountDO.getBalance();
    }


    @Override
    public boolean updateWithLock(long id, BigDecimal amount) {

        Wrapper wrapper = Wrappers.<AccountDO>lambdaUpdate()
                .setSql("balance - " + amount)
                .last("FOR UPDATE");

        AccountEO accountEO = findWithLock(id);
        AccountDO accountDO = converter.toDO(accountEO);
        boolean saveRes = accountDAO.saveOrUpdate(accountDO, wrapper);

        return saveRes;
    }

}









































