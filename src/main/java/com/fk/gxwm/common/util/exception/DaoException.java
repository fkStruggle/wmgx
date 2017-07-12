package com.fk.gxwm.common.util.exception;
/**
 * 
* <p>Title:DaoException </p>
* <p>Description:自定义数据层异常 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月12日
 */
public class DaoException extends Exception {

    private static final long serialVersionUID = 1L;
    private String message;
    public DaoException() {
        super();
    }
    public DaoException(Exception e) {
        super(e);
        this.message = e.getMessage();
    }
    public DaoException(String message) {
        super(message);
        this.message = message;
    }
    public String toString() {
        return this.getClass().getName() + ":" + message;
    }

}
