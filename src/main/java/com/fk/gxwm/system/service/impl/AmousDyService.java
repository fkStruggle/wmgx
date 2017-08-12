package com.fk.gxwm.system.service.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;

/**
 * 
* <p>Title:AmousDyService </p>
* <p>Description: 匿名动态信息</p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月12日
 */
public interface AmousDyService {
    /**
     * 
    * @Title: pubAnoDynamic 
    * @Description: 发布匿名动态 
    * @param wgAnonymousDynamic 匿名信息
    * @param files 多张图片构成多个文件
    * @return void    返回类型 
    * @throws 自定义service异常
     */
    public void pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic, @RequestParam("files") MultipartFile[] files) throws ServiceException;
    /**
     * 
    * @Title: delAnoDynamic 
    * @Description: 根据id删除动态
    * @param id 动态id
    * @return void    返回类型 
    * @throws 自定义service异常
     */
    public void delAnoDynamic(Long id) throws ServiceException;
    /**
    * @Title: findAnoDynamics
    * @Description: 查看所有匿名动态信息
    * @param  page  分页信息
    * @return List<WgAnonymousDynamic>  多条匿名动态
    * @throws 自定义service异常
     */
    public List<WgAnonymousDynamic> findAnoDynamics(Page page) throws ServiceException;
    
    public int countAnoDynamic() throws ServiceException;
}
