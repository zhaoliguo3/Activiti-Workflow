package com.xzl.bat.domain.tk;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TKMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
