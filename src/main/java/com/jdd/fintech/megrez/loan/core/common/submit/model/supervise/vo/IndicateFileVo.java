package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise.vo;

import java.io.Serializable;

/**
 * cc
 *
 * @author wangxiaohui56
 * @date Created in 14:58 2020/5/8
 */
public class IndicateFileVo implements Serializable {

    private static final long serialVersionUID = -4272683898195945903L;

    /**
     * 日期
     */
    private String businessDate;

    /**
     * 行号
     */
    private String bankCode;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 条数
     */
    private String recordSize;

    /**
     * ckSum
     */
    private String ckSum;

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(String recordSize) {
        this.recordSize = recordSize;
    }

    public String getCkSum() {
        return ckSum;
    }

    public void setCkSum(String ckSum) {
        this.ckSum = ckSum;
    }
}
