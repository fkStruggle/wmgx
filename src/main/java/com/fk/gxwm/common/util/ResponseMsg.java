package com.fk.gxwm.common.util;
/**
 * 
* <p>Title:ResponseMsg </p>
* <p>Description:公共类，后台为前台传送数据 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月13日
 */
public class ResponseMsg {
    //成功标识
    private String isSuccess;
    //提示编码
    private String code;
    //提示信息
    private String message;
    //数据
    private Object data;
    
    public ResponseMsg(String isSuccess, String code, String message, Object data) {
        super();
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ResponseMsg(){
        
    }
    public String getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    

}
