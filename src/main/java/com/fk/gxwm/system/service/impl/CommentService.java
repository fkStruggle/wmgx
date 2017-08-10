package com.fk.gxwm.system.service.impl;

import java.util.List;

import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;
import com.fk.gxwm.common.vo.ComentDetailVo;

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
}
