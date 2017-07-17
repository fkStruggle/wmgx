package com.fk.gxwm.common.mapper;

import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.pojo.WgAnonymousDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WgAnonymousDynamicMapper {
    int countByExample(WgAnonymousDynamicExample example);

    int deleteByExample(WgAnonymousDynamicExample example);

    int deleteByPrimaryKey(Long dynamicid);

    int insert(WgAnonymousDynamic record);

    int insertSelective(WgAnonymousDynamic record);

    List<WgAnonymousDynamic> selectByExample(WgAnonymousDynamicExample example);

    WgAnonymousDynamic selectByPrimaryKey(Long dynamicid);

    int updateByExampleSelective(@Param("record") WgAnonymousDynamic record, @Param("example") WgAnonymousDynamicExample example);

    int updateByExample(@Param("record") WgAnonymousDynamic record, @Param("example") WgAnonymousDynamicExample example);

    int updateByPrimaryKeySelective(WgAnonymousDynamic record);

    int updateByPrimaryKey(WgAnonymousDynamic record);
    
    List<WgAnonymousDynamic> selectAnsDy(@Param("start") int start,@Param("everyPage") int everyPage);
}