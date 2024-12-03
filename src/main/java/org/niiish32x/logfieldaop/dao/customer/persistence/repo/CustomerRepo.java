package org.niiish32x.logfieldaop.dao.customer.persistence.repo;

import org.niiish32x.logfieldaop.domain.entity.CustomerEO;

import java.util.List;


public interface CustomerRepo {
     List<CustomerEO> findAllCustomers();
}
