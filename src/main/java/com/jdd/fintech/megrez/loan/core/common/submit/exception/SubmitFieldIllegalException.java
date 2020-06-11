package com.jdd.fintech.megrez.loan.core.common.submit.exception;

/**
 * 字段非法
 *
 * @author wangxiaohui56
 * @date Created in 16:36 2020/4/26
 */
public class SubmitFieldIllegalException extends RuntimeException {

    /**
     * 构造函数
     *
     * @param message 消息
     */
    public SubmitFieldIllegalException(String message) {
        super(message);
    }
}
