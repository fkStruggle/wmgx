package com.fk.gxwm.system.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fk.gxwm.common.mapper.WgAnonymousDynamicMapper;
import com.fk.gxwm.common.pojo.WgAnonymousDynamic;
import com.fk.gxwm.common.util.Constant;
import com.fk.gxwm.common.util.FileUtil;
import com.fk.gxwm.common.util.Page;
import com.fk.gxwm.common.util.exception.ServiceException;
@Service("amousDyService")
public class AmousDyServiceImpl implements AmousDyService {
    @Autowired
    private WgAnonymousDynamicMapper wgAnonymousDynamicMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void pubAnoDynamic(WgAnonymousDynamic wgAnonymousDynamic, MultipartFile[] files) throws ServiceException {
        try {
            if (files != null && files.length > 0) {
                //循环获取file数组中得文件(格式:{"路劲":["图片1"，"图片2"，"图片3"]})
                if (files.length > 0) {
                    String imgUploadPath = Constant.IMG_PATH;
                    StringBuffer imgPaths = new StringBuffer();
                    imgPaths.append("{\"");
                    //imgPaths.append(imgUploadPath);
                    imgPaths.append("imagePath");
                    imgPaths.append("\":["); 
                    for (int i = 0; i < files.length; i++) {
                        MultipartFile file = files[i];
                        String imgPath = FileUtil.uploadImag(file);
                        //保存图片
                        imgPaths.append("\"");
                        imgPaths.append(imgPath);
                        imgPaths.append("\"");
                        imgPaths.append(",");
                    }
                    String str = imgPaths.substring(0,imgPaths.length()-1);
                    imgPaths.setLength(0);
                    imgPaths.append(str);
                    imgPaths.append("]}");
                    wgAnonymousDynamic.setDynamicimg(imgPaths.toString());
                }
            }
            wgAnonymousDynamic.setReleasetime(new Date());
            wgAnonymousDynamic.setUserloginname("");
            wgAnonymousDynamicMapper.insert(wgAnonymousDynamic);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("service层错误:" + e.getMessage());
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delAnoDynamic(Long id) throws ServiceException {
        try {
            WgAnonymousDynamic wgAnonymousDynamic = wgAnonymousDynamicMapper.selectByPrimaryKey(id);
            String imgPath = wgAnonymousDynamic.getDynamicimg();
            wgAnonymousDynamicMapper.deleteByPrimaryKey(id);
            //以下删除本地图片
            JSONObject jsonObject = JSONObject.parseObject(imgPath);
            JSONArray jsonArray = jsonObject.getJSONArray(Constant.IMG_PATH);
            for (int i = 0; i <= jsonArray.size(); i++) {
                String temp = Constant.IMG_PATH + File.separator + jsonArray.getString(i);
                boolean isDelete = FileUtil.deleteFile(temp);
                if (!isDelete) {
                    throw new ServiceException("service层错误：删除匿名动态发生错误" + jsonArray.getString(i) + "图片不存在");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("service层错误：" + e.getMessage());
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<WgAnonymousDynamic> findAnoDynamics(Page page) throws ServiceException {
        List<WgAnonymousDynamic> wads = null;
        try {
            wads = wgAnonymousDynamicMapper.selectAnsDy((page.getCurrentPage() - 1) * page.getEveryPage(), page.getEveryPage());
            for(WgAnonymousDynamic wad:wads){
                List<String> list = new ArrayList<String>();
                JSONObject jsonObjec = JSONObject.parseObject(wad.getDynamicimg());
                Set<Entry<String, Object>>  entry = jsonObjec.entrySet();
                Iterator<Entry<String, Object>> it = entry.iterator();
                while(it.hasNext()){
                    JSONArray jsonArry = (JSONArray) it.next().getValue();
                    for(Object str:jsonArry.toArray()){
                    	if(!StringUtils.isEmpty(str)){
                    		list.add((String) str);
                    	}
                    }
                    
                }
                //it.
                
                //JSONObject jsonObjec = JSONObject.parseObject(wad.getDynamicinfo());
                //jsonObjec.keySet();list
                wad.setImageNames(list);
            }
            page.setTotalCount(this.countAnoDynamic());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("service层错误：查看匿名动态发生错误");
        }
        return wads;
    }
    @Transactional(propagation=Propagation.REQUIRED)
    @Override
    public int countAnoDynamic() throws ServiceException {
        int count = 0;
        try{
            count = wgAnonymousDynamicMapper.countAnoDynamic();
        }catch(Exception e){
            e.printStackTrace();
            throw new ServiceException("service层错误：匿名动态数量发生错误");
        }
        return count;
    }
}
