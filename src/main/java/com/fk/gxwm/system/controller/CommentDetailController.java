package com.fk.gxwm.system.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Constant;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.ResponseMsg;
import com.fk.gxwm.common.util.exception.ServiceException;
import com.fk.gxwm.system.service.impl.CommentService;

@Controller
@RequestMapping("/commentDetail")
public class CommentDetailController {
	@Autowired
	CommentService  commentService;
    @RequestMapping("/findComments")
    public ModelAndView findComentDetails(Long dynamicid,Page page,HttpServletRequest request,
            HttpServletResponse response) throws IOException{
    	if(page == null|| page.getCurrentPage()==0){
            page = new Page();
            page.setCurrentPage(1);
        }
    	page.setEveryPage(20);
    	List<WgAnonymousComment> comments = null;
    	ModelAndView model = new ModelAndView();
    	String dynamicidTemp = request.getParameter("dynamicIdTemp");
    	//用户直接在浏览器中输入，直接跳回首页
    	if(StringUtils.isEmpty(dynamicidTemp)){
    		response.sendRedirect("/wmgx");
    		return null;
    	}
    	dynamicid = Long.valueOf(dynamicidTemp);
    	String dynamicinfoTemp = request.getParameter("dynamicinfoTemp");
    	String dynamicImageTemp = request.getParameter("dynamicImageTemp");
    	String commentCount = request.getParameter("commentCount");
    	List<String> dynamicImages = new ArrayList<String>();
    	if(!StringUtils.isEmpty(dynamicImageTemp)){
    		dynamicImageTemp = dynamicImageTemp.substring(1, dynamicImageTemp.length()-1);
    		for(String s:dynamicImageTemp.split(",")){
    		    if(!StringUtils.isEmpty(s))
    			dynamicImages.add(s.trim());
    		}
    	}
    	ResponseMsg res = new ResponseMsg(true, Constant.successCode, "发布成功", null);
    	try{
    		comments = commentService.getComentDetails(dynamicid, page);
    		//page.setTotalCount(commentService.getComentCount(dynamicid));
    		res.setData(comments);
    	}catch(ServiceException e){
    		e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
    	}
    	model.setViewName("comment/commentManage");
    	model.addObject("res", res);
    	model.addObject("dynamicIdTemp", dynamicid);
    	model.addObject("dynamicinfoTemp", dynamicinfoTemp);
    	model.addObject("dynamicImageTemp", dynamicImages);
    	model.addObject("commentCount",commentCount);
    	model.addObject("page", page);
		return model;
        
    }
    @RequestMapping("/addComment")
    @ResponseBody
    public   ResponseMsg addComment(HttpServletRequest request,HttpServletResponse response){
    	WgAnonymousComment comment = new WgAnonymousComment();
    	comment.setCconten(request.getParameter("cconten"));
    	comment.setDynamicid(Long.valueOf(request.getParameter("dynamicid")));
    	int ra=(int)(Math.random()*50);
    	comment.setAmousName(Constant.amousDyNames[ra]);
    	ResponseMsg res = new ResponseMsg(true, Constant.successCode, "发布成功", null);
    	try{
    		commentService.addComment(comment);
    	}catch(ServiceException e){
    		e.printStackTrace();
    		res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
    	}
    	
    	return res;
    	
    }
    
    @RequestMapping("/findComentLists")
    public ModelAndView findComentLists(Long dynamicid,Page page,HttpServletRequest request,
            HttpServletResponse response) throws IOException{
    	if(page == null|| page.getCurrentPage()==0){
            page = new Page();
            page.setCurrentPage(1);
        }
    	page.setEveryPage(20);
    	List<WgAnonymousComment> comments = null;
    	ModelAndView model = new ModelAndView();
    	ResponseMsg res = new ResponseMsg(true, Constant.successCode, "查看成功", null);
    	try{
    		comments = commentService.getComentDetails(dynamicid, page);
    		//page.setTotalCount(commentService.getComentCount(dynamicid));
    		res.setData(comments);
    	}catch(ServiceException e){
    		e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
    	}
    	model.setViewName("comment/commentList");
    	model.addObject("res", res);
    	model.addObject("page", page);
		return model;
        
    }

}
