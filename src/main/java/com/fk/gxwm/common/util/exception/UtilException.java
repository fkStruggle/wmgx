package com.fk.gxwm.common.util.exception;
/**
 * 
* <p>Title:UtilException </p>
* <p>Description:工具类非运行时异常 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月24日
 */
public class UtilException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String message;
    public UtilException() {
        super();
    }

    public UtilException(String message) {
        super(message);
        this.message = message;
    }

    public UtilException(Exception e) {
        super(e);
        this.message = e.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String toString() {
        return this.getClass().getName() + ":" + message;
    }

}
