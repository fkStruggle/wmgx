package com.fk.gxwm.common.util.exception;

public class UtilException extends RuntimeException {
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
