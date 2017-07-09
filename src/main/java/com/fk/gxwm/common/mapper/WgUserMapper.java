package com.fk.gxwm.common.mapper;

import com.fk.gxwm.common.pojo.WgUser;
import com.fk.gxwm.common.pojo.WgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WgUserMapper {
    int countByExample(WgUserExample example);

    int deleteByExample(WgUserExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(WgUser record);

    int insertSelective(WgUser record);

    List<WgUser> selectByExample(WgUserExample example);

    WgUser selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") WgUser record, @Param("example") WgUserExample example);

    int updateByExample(@Param("record") WgUser record, @Param("example") WgUserExample example);

    int updateByPrimaryKeySelective(WgUser record);

    int updateByPrimaryKey(WgUser record);
}