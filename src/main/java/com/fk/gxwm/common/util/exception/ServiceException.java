package com.fk.gxwm.common.util.exception;
/**
 * 
* <p>Title:ServiceException </p>
* <p>Description: 自定义Service层运行时异常</p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月12日
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    public ServiceException() {
        super();
    }
    public ServiceException(String message) {
        super(message);
        this.message = message;
    }
    public ServiceException(Exception e) {
        super(e);
        this.message = e.getMessage();
    }
    public String toString() {
        return this.getClass().getName() + ":" + message;
    }

}
