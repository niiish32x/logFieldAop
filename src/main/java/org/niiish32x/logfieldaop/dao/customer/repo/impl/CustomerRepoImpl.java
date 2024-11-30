package org.niiish32x.logfieldaop.dao.customer.repo.impl;

import org.niiish32x.logfieldaop.common.Result;
import org.niiish32x.logfieldaop.dao.customer.CustomerDAO;
import org.niiish32x.logfieldaop.dao.customer.converter.CustomerConverter;
import org.niiish32x.logfieldaop.dao.customer.persistence.CustomerDO;
import org.niiish32x.logfieldaop.dao.customer.repo.CustomerRepo;
import org.niiish32x.logfieldaop.domain.entity.CustomerEO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
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
