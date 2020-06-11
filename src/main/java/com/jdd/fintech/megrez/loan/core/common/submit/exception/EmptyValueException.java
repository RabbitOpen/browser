package com.jdd.fintech.megrez.loan.core.common.submit.exception;

/**
 * 字段值空异常
 * @author xiaoqianbin
 * @date 2020/4/29
 **/
public class EmptyValueException extends SubmitBusinessException {

    public EmptyValueException(String message) {
        super(message);
    }
}
