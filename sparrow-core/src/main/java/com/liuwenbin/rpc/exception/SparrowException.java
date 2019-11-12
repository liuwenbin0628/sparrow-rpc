package com.liuwenbin.rpc.exception;

/**
 * @author liuwenbin on 2019-11-13
 */
public class SparrowException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final SparrowErrorType errorType;

    public SparrowException(SparrowErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public SparrowException(SparrowErrorType errorType, Throwable cause) {
        super(cause);
        this.errorType = errorType;
    }

    public SparrowException(SparrowErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }

    public SparrowErrorType getErrorType() {
        return errorType;
    }

}
