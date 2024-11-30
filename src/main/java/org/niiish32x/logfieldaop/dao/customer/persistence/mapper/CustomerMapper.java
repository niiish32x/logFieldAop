package org.niiish32x.logfieldaop.dao.customer.persistence.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.niiish32x.logfieldaop.dao.customer.CustomerDO;
import org.niiish32x.logfieldaop.domain.entity.CustomerEO;

import java.util.List;

@Mapper
public interface CustomerMapper extends BaseMapper <CustomerDO> {

}
