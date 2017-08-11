package com.fk.gxwm.system.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fk.gxwm.common.mapper.WgAnonymousCommentMapper;
import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	@Autowired
	private WgAnonymousCommentMapper wgAnonymousCommentMapper;
	@Override
	public List<WgAnonymousComment> getComentDetails(Long dynamicid,Page page)
			throws ServiceException {
		// 查询评论详细信息
		List<WgAnonymousComment> comments = null;
		try{
			comments = wgAnonymousCommentMapper.selectComments(dynamicid, (page.getCurrentPage() - 1) * page.getEveryPage(), page.getEveryPage());
		}catch(Exception e){
			e.printStackTrace();
			throw new ServiceException("查看评论详情发生错误");
		}
		return comments;
	}
	@Override
	public void addComment(WgAnonymousComment comment) throws ServiceException {
		try{
			comment.setCtime(new Date());
			wgAnonymousCommentMapper.insert(comment);
		}catch(Exception e){
			e.printStackTrace();
			throw new ServiceException("新增评论详情发生错误");
		}
	}

}
