package org.niiish32x.logfieldaop.dao.customer.repo;

import org.niiish32x.logfieldaop.common.Result;
import org.niiish32x.logfieldaop.domain.entity.CustomerEO;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CustomerRepo {
     List<CustomerEO> findAllCustomers();
}
