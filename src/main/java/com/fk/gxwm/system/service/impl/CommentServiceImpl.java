package com.fk.gxwm.system.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fk.gxwm.common.mapper.WgAnonymousCommentMapper;
import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private WgAnonymousCommentMapper wgAnonymousCommentMapper;
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<WgAnonymousComment> getComentDetails(Long dynamicid, Page page) throws ServiceException {
        // 查询评论详细信息
        List<WgAnonymousComment> comments = null;
        try {
            comments = wgAnonymousCommentMapper.selectComments(dynamicid, (page.getCurrentPage() - 1) * page.getEveryPage(), page.getEveryPage());
            page.setTotalCount(this.getComentCount(dynamicid));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("查看评论详情发生错误");
        }
        return comments;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void addComment(WgAnonymousComment comment) throws ServiceException {
        try {
            comment.setCtime(new Date());
            wgAnonymousCommentMapper.insert(comment);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("新增评论详情发生错误");
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int getComentCount(Long dynamicid) throws ServiceException {
        int count = 0;
        try{
            count = wgAnonymousCommentMapper.countComment(dynamicid);
        }catch(Exception e){
            e.printStackTrace();
            throw new ServiceException("查询评论数量发生错误");
        }
        return count;
    }

}
