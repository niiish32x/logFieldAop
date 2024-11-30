package org.niiish32x.logfieldaop.dao.account.persistence.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.niiish32x.logfieldaop.dao.account.AccountDO;
import org.niiish32x.logfieldaop.dao.account.persistence.dao.AccountDAO;
import org.niiish32x.logfieldaop.dao.account.persistence.mapper.AccountMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl extends ServiceImpl<AccountMapper, AccountDO> implements AccountDAO {

}
