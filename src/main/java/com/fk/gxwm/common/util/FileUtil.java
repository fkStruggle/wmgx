package com.fk.gxwm.common.util;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.fk.gxwm.common.util.exception.UtilException;

/**
 * 
* <p>Title:FileUtil </p>
* <p>Description:文件工具类 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月17日
 */
public class FileUtil {
    /**
     * 
    * @Title: deleteFile 
    * @Description: 删除文件
    * @param  fileName 文件名全路径
    * @return    返回类型  删除成功true，失败false
    * @throws
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.isFile() && file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }
    /**
     * 
    * @Title: uploadImag 
    * @Description: 上传图片 
    * @param @param file
    * @return String    文件名称 
    * @throws
     */
    public static String uploadImag(MultipartFile file) throws UtilException{
        // 判断文件是否为空  
        if (!file.isEmpty()) {
            try {
                // 文件保存路径  
                String filePath = file.getOriginalFilename();
                //修改文件名称
                String extendImageName = String.valueOf(System.currentTimeMillis())+filePath.substring(filePath.lastIndexOf("."));
                // 转存文件  
                file.transferTo(new File(Constant.IMG_PATH,extendImageName));
                return filePath;
            } catch (Exception e) {
                e.printStackTrace();
                throw new UtilException("工具类错误：上传图片失败");
            }
        }
        return "";
    }

}
