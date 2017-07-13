package com.fk.gxwm.system.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fk.gxwm.common.mapper.WgAnonymousDynamicMapper;
import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;
@Service("amousDyService")
public class AmousDyServiceImpl implements AmousDyService {
    @Autowired
    private WgAnonymousDynamicMapper wgAnonymousDynamicMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic, MultipartFile[] files) throws ServiceException {
        if (files != null && files.length > 0) {
            //循环获取file数组中得文件
            String imgUploadPath = "";
            StringBuffer imgPaths = new StringBuffer(imgUploadPath);
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                String imgPath = saveImag(file);
                //保存图片
                imgPaths.append(";");
                imgPaths.append(imgPath);
            }
            wgAnonymousDynamic.setDynamicimg(imgUploadPath);

        }
        wgAnonymousDynamic.setReleasetime(new Date());
        wgAnonymousDynamic.setUserloginname("");
        wgAnonymousDynamicMapper.insert(wgAnonymousDynamic);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delAnoDynamic(Long id) throws ServiceException {
        try {
            wgAnonymousDynamicMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("service层错误：删除匿名动态发生错误");
        }

        //同时删除本地图片
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void findAnoDynamics(Page page) throws ServiceException {
        // TODO Auto-generated method stub

    }

    private String saveImag(MultipartFile file) {
        // 判断文件是否为空  
        if (!file.isEmpty()) {
            try {
                // 文件保存路径  
                String filePath = file.getOriginalFilename();
                // 转存文件  
                file.transferTo(new File(filePath));
                return filePath;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

}
