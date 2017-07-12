package com.fk.gxwm.system.service.impl;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.util.exception.ServiceException;
import com.fk.gxwm.system.utils.Page;

/**
 * 
* <p>Title:AmousDyService </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月12日
 */
public interface AmousDyService {
    /**
     * 
     * @param wgAnonymousDynamic
     * @param files
     */
    public void pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic, @RequestParam("files") MultipartFile[] files) throws ServiceException;
    /**
     * 根据id删除动态
     * @param id 动态id
     */
    public void delAnoDynamic(Long id) throws ServiceException;
    /**
     * 查看所有匿名动态信息
     * @param page 分页信息
     */
    public void findAnoDynamics(Page page) throws ServiceException;
}
