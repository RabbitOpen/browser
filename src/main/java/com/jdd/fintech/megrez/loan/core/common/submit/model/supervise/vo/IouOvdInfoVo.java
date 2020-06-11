package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise.vo;

/**
 * @auther yuanjingshen
 * @date 2020/5/1 17:44
 * @desc 借据逾期时间对象
 */
public class IouOvdInfoVo {
    private String iouCode;
    private Integer ovdDays;
    private String ovdDate;

    public String getOvdDate() {
        return ovdDate;
    }

    public void setOvdDate(String ovdDate) {
        this.ovdDate = ovdDate;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public Integer getOvdDays() {
        return ovdDays;
    }

    public void setOvdDays(Integer ovdDays) {
        this.ovdDays = ovdDays;
    }
}
