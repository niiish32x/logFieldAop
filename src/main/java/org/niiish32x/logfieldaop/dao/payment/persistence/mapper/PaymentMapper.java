package org.niiish32x.logfieldaop.dao.payment.persistence.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.niiish32x.logfieldaop.dao.payment.PaymentDO;

@Mapper
public interface PaymentMapper extends BaseMapper<PaymentDO> {
}
