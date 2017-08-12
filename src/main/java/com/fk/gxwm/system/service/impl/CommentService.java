package com.fk.gxwm.system.service.impl;

import java.util.List;

import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;

/**
 * 
* <p>Title:CommentService </p>
* <p>Description: 评论信息</p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年8月10日
 */
public interface CommentService {
     public List<WgAnonymousComment> getComentDetails(Long dynamicid,Page page) throws ServiceException;
     
     public void addComment(WgAnonymousComment comment) throws ServiceException;
     /**
      * 
     * @Title: getComentCount 
     * @Description: 查询评论数量
     * @param  dynamicid 动态id
     * @throws ServiceException    mybatis异常
     * @return int    返回类型 
      */
     public int getComentCount(Long dynamicid) throws ServiceException;
}
