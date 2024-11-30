package org.niiish32x.logfieldaop.dao.customer.persistence.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.niiish32x.logfieldaop.dao.customer.CustomerDO;
import org.niiish32x.logfieldaop.dao.customer.persistence.dao.CustomerDAO;

import org.niiish32x.logfieldaop.dao.customer.persistence.mapper.CustomerMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl extends ServiceImpl<CustomerMapper, CustomerDO> implements CustomerDAO {
}
