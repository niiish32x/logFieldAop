package org.niiish32x.logfieldaop.dao.account.persistence.repo;


import org.niiish32x.logfieldaop.domain.entity.AccountEO;

import java.util.List;

public interface AccountRepo {

    List<AccountEO> findAll();
}
