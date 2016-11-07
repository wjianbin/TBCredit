package com.yodata.creditsupport.exception;

/**
 * 业务异常类
 * @author Anna
 *
 */
public class BusinessException extends Exception{

    private static final long serialVersionUID = -6080907893766679642L;
    
    public BusinessException() {
        super();
    }
    
    public BusinessException(String message) {
        super(message);
    }
    
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BusinessException(Throwable cause) {
        super(cause);
    }
    
    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
