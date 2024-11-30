package org.niiish32x.logfieldaop.dao.customer.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.niiish32x.logfieldaop.dao.customer.CustomerDAO;
import org.niiish32x.logfieldaop.dao.customer.persistence.CustomerDO;
import org.niiish32x.logfieldaop.dao.customer.persistence.mapper.CustomerMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl extends ServiceImpl<CustomerMapper, CustomerDO> implements CustomerDAO{
}
