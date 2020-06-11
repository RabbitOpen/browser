package com.jdd.fintech.megrez.loan.core.common.submit.exception;

/**
 * @author wangxiaohui56
 * @date Created in 17:20 2020/4/26
 */
public class SubmitBusinessException extends RuntimeException {
    /**
     * 构造函数
     *
     * @param message message
     */
    public SubmitBusinessException(String message) {
        super(message);
    }

    public SubmitBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

