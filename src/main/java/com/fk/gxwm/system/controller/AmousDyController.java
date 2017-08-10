package com.fk.gxwm.system.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.util.Constant;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.ResponseMsg;
import com.fk.gxwm.common.util.exception.ServiceException;
import com.fk.gxwm.system.service.impl.AmousDyService;

/**
* <p>Title:AmousDyController </p>
* <p>Description:匿名动态类 </p>
* <p>Company:myself </p> 
* @author fangkun
* @date 2017年7月11日
 */
@Controller
@RequestMapping("/amousDy")
public class AmousDyController {
    @Autowired
    AmousDyService amousDyService;
    /**
     * 新增匿名动态
     * @param wgAnonymousDynamic 匿名动态实体
     * @param files 图片集合
     * @return
     */
    @RequestMapping("/pubAnoDynamic")
    //@ResponseBody
    public void pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic,
        @RequestParam("files") MultipartFile[] files,
        HttpServletRequest request,
        HttpServletResponse response) {
        @SuppressWarnings("unused")
        ResponseMsg res = new ResponseMsg(true, Constant.successCode, "发布成功", null);
        try {
            amousDyService.pubAnoDynamic(wgAnonymousDynamic, files);
        } catch (ServiceException e) {
            e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
        }
        ModelAndView modelAndView = new ModelAndView(); 
        modelAndView.setViewName("amousDy/amousDyManage");
        //modelAndView.addObject("name", "amousDyManage");  
        //response.sendRedirect(request.getContentLength()+"");
        try {
			//response.sendRedirect("http://127.0.0.1:8080/wmgx/");
			response.sendRedirect("/wmgx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //return modelAndView;
    }
    /**
     * 根据id删除动态
     * @param id 动态id
     */
    @RequestMapping("/delAnoDynamic")
    public ResponseMsg delAnoDynamic(Long id) {
        ResponseMsg res = new ResponseMsg(true, Constant.successCode, "删除成功", null);
        try {
            amousDyService.delAnoDynamic(id);
        } catch (ServiceException e) {
            e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
        }
        return res;
    }
    /**
     * 查看所有匿名动态信息
     * @param page 分页信息
     */
    @RequestMapping("/findAnoDynamics")
    public ModelAndView findAnoDynamics(@RequestBody Page page,ModelAndView model) {
        List<WgAnonymousDynamic> wads = null;
        ResponseMsg res = new ResponseMsg(true, Constant.successCode, "查看成功", null);
        if(page == null|| page.getCurrentPage()==0){
            page = new Page();
            page.setCurrentPage(1);
        }
        try {
            wads = amousDyService.findAnoDynamics(page);
            res.setData(wads);
        } catch (ServiceException e) {
            e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
        }
        model.addObject("res",res);
        model.setViewName("amousDy/amousDyList");
        return model;
    }

}
