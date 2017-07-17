package com.fk.gxwm.system.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    public ResponseMsg pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic,
        @RequestParam("files") MultipartFile[] files,
        HttpServletRequest request,
        HttpServletResponse response) {
        ResponseMsg res = new ResponseMsg(true, Constant.successCode, "发布成功", null);
        try {
            amousDyService.pubAnoDynamic(wgAnonymousDynamic, files);
        } catch (ServiceException e) {
            e.printStackTrace();
            res = new ResponseMsg(false, Constant.errorCode, e.getMessage(), null);
        }
        return res;
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
    public ResponseMsg findAnoDynamics(Page page) {
        List<WgAnonymousDynamic> wads = null;
        ResponseMsg res = new ResponseMsg(true, Constant.successCode, "查看成功", null);
        if(page == null){
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
        return res;
    }

}
