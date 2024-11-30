package org.niiish32x.logfieldaop.dao.customer.persistence.repo.impl;

import org.niiish32x.logfieldaop.dao.customer.persistence.dao.CustomerDAO;
import org.niiish32x.logfieldaop.dao.customer.persistence.converter.CustomerConverter;
import org.niiish32x.logfieldaop.dao.customer.persistence.CustomerDO;
import org.niiish32x.logfieldaop.dao.customer.persistence.repo.CustomerRepo;
import org.niiish32x.logfieldaop.domain.entity.CustomerEO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomerRepoImpl implements CustomerRepo {

    @Resource
    private CustomerDAO customerDAO;

    CustomerConverter converter = CustomerConverter.INSTANCE;

    @Override
    public  List<CustomerEO> findAllCustomers() {
        List<CustomerDO> customerDOS = customerDAO.lambdaQuery().list();
        return customerDOS.stream().map(converter::toEO).collect(Collectors.toList());
    }
}
