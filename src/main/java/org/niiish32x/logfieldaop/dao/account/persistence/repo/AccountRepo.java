package org.niiish32x.logfieldaop.dao.account.persistence.repo;


import org.niiish32x.logfieldaop.domain.entity.AccountEO;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepo {

    List<AccountEO> find();

    AccountEO find(Long id);

    AccountEO findWithLock(Long id);

    /**
     * 获取账户余额
     * @param id
     * @return
     */
    BigDecimal getBalance(int id);

    /**
     * 扣除 账户余额
     * @param id
     * @param amount
     * @return
     */
    boolean updateWithLock(long id, BigDecimal amount);
}
