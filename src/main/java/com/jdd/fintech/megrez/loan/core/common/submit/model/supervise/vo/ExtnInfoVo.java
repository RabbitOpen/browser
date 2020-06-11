package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise.vo;

import java.math.BigDecimal;

/**
 * @auther yuanjingshen
 * @date 2020/5/18 15:37
 * @desc
 */
public class ExtnInfoVo {
    private Long id;
    private String productCode;
    private String dueBillNo;
    private BigDecimal extnBalAmt;
    private String lnExtnNo;
    private String oldLnBeginDate;
    private String oldLnEndDate;
    private String newLnEndDate;
    private String extnDt;
    private String oldLnIntr;
    private String intrType;
    private String ctrtNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDueBillNo() {
        return dueBillNo;
    }

    public void setDueBillNo(String dueBillNo) {
        this.dueBillNo = dueBillNo;
    }

    public BigDecimal getExtnBalAmt() {
        return extnBalAmt;
    }

    public void setExtnBalAmt(BigDecimal extnBalAmt) {
        this.extnBalAmt = extnBalAmt;
    }

    public String getLnExtnNo() {
        return lnExtnNo;
    }

    public void setLnExtnNo(String lnExtnNo) {
        this.lnExtnNo = lnExtnNo;
    }

    public String getOldLnBeginDate() {
        return oldLnBeginDate;
    }

    public void setOldLnBeginDate(String oldLnBeginDate) {
        this.oldLnBeginDate = oldLnBeginDate;
    }

    public String getOldLnEndDate() {
        return oldLnEndDate;
    }

    public void setOldLnEndDate(String oldLnEndDate) {
        this.oldLnEndDate = oldLnEndDate;
    }

    public String getNewLnEndDate() {
        return newLnEndDate;
    }

    public void setNewLnEndDate(String newLnEndDate) {
        this.newLnEndDate = newLnEndDate;
    }

    public String getExtnDt() {
        return extnDt;
    }

    public void setExtnDt(String extnDt) {
        this.extnDt = extnDt;
    }

    public String getOldLnIntr() {
        return oldLnIntr;
    }

    public void setOldLnIntr(String oldLnIntr) {
        this.oldLnIntr = oldLnIntr;
    }

    public String getIntrType() {
        return intrType;
    }

    public void setIntrType(String intrType) {
        this.intrType = intrType;
    }

    public String getCtrtNo() {
        return ctrtNo;
    }

    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }
}
