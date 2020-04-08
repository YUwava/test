package com.csdj.erpdao;

import com.csdj.erpcommon.pojo.qh;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from qh")
    public List<qh> getAllUser();
}
