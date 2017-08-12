package com.fk.gxwm.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.pojo.WgAnonymousCommentExample;

public interface WgAnonymousCommentMapper {
    int countByExample(WgAnonymousCommentExample example);

    int deleteByExample(WgAnonymousCommentExample example);

    int deleteByPrimaryKey(Long acommentid);

    int insert(WgAnonymousComment record);

    int insertSelective(WgAnonymousComment record);

    List<WgAnonymousComment> selectByExample(WgAnonymousCommentExample example);

    WgAnonymousComment selectByPrimaryKey(Long acommentid);

    int updateByExampleSelective(@Param("record") WgAnonymousComment record, @Param("example") WgAnonymousCommentExample example);

    int updateByExample(@Param("record") WgAnonymousComment record, @Param("example") WgAnonymousCommentExample example);

    int updateByPrimaryKeySelective(WgAnonymousComment record);

    int updateByPrimaryKey(WgAnonymousComment record);
    
    List<WgAnonymousComment> selectComments(@Param("dynamicid") Long dynamicid,@Param("start") int start,@Param("everyPage") int everyPage);
    int countComment(@Param("dynamicid") Long dynamicid);
}