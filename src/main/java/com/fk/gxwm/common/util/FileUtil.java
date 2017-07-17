package com.fk.gxwm.common.util;

import java.io.File;

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

}
