package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_LN_EXTN_AGREEMENT
 * 贷款展期信息表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class LnExtnAgreement {

    /**
     * 贷款展期编号
     */
    @Column(order = 0, comment = "贷款展期编号", length = 50, canBeEmpty = false)
    private String lnExtnNo;

    /**
     * 信贷借据号
     */
    @Column(order = 1, comment = "信贷借据号", length = 50, canBeEmpty = false)
    private String dueBillNo;

    /**
     * 合同编号
     */
    @Column(order = 2, comment = "合同编号", length = 64, canBeEmpty = false)
    private String ctrtNo;

    /**
     * 客户编号
     */
    @Column(order = 3, comment = "客户编号", length = 120, canBeEmpty = false)
    private String custNo;

    /**
     * 核心客户编号
     */
    @Column(order = 4, comment = "核心客户编号", length = 20, canBeEmpty = true)
    private String cbusCustNo;

    /**
     * 业务办理机构
     */
    @Column(order = 5, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 展期日期
     */
    @Column(order = 6, comment = "展期日期", length = 8, canBeEmpty = false)
    private String extnDt;

    /**
     * 原贷款起始日
     */
    @Column(order = 7, comment = "原贷款起始日", length = 8, canBeEmpty = false)
    private String oldLnBeginDate;

    /**
     * 原贷款到期日
     */
    @Column(order = 8, comment = "原贷款到期日", length = 8, canBeEmpty = false)
    private String oldLnEndDate;

    /**
     * 展期到期日期
     */
    @Column(order = 9, comment = "展期到期日期", length = 8, canBeEmpty = false)
    private String newLnEndDate;

    /**
     * 展期金额
     */
    @Column(order = 10, comment = "展期金额", length = 20, canBeEmpty = false)
    private BigDecimal extnBalAmt;

    /**
     * 原利率
     */
    @Column(order = 11, comment = "原利率", length = 11, canBeEmpty = false)
    private BigDecimal oldLnIntr;

    /**
     * RF01 固定利率
     * RF02 浮动利率
     * RF021 浮动比利率
     * RF022 浮动点利率
     */
    @Column(order = 12, comment = "利率类型", length = 5, canBeEmpty = false)
    private String intrType;

    /**
     * 展期执行利率
     */
    @Column(order = 13, comment = "展期执行利率", length = 11, canBeEmpty = false)
    private BigDecimal newLnIntr;

    /**
     * 百分比为单位，即1/100，一般为年利。
     */
    @Column(order = 14, comment = "展期基准利率", length = 11, canBeEmpty = true)
    private BigDecimal extnBaseIntr;

    /**
     * 基准点为单位。
     * 如上浮1%是填100.00，下浮1%是填-100.00，精确到小数点后2位。如果利率类型是固定利率，则利率浮动填写0.00。如利率类型是浮动利率，则与利率基准结合进行计算。
     */
    @Column(order = 15, comment = "利率浮动", length = 10, canBeEmpty = false)
    private BigDecimal intrFlt;

    /**
     * 原合同号
     */
    @Column(order = 16, comment = "原合同号", length = 64, canBeEmpty = true)
    private String oldCtrtNo;

    /**
     * 原借据号
     */
    @Column(order = 17, comment = "原借据号", length = 50, canBeEmpty = true)
    private String oldDueBillNo;

    /**
     * 交易柜员号
     */
    @Column(order = 18, comment = "交易柜员号", length = 12, canBeEmpty = false)
    private String txTlrNo;

    /**
     * 授权柜员号
     */
    @Column(order = 19, comment = "授权柜员号", length = 12, canBeEmpty = false)
    private String authTlrNo;

    /**
     * 备注1
     */
    @Column(order = 20, comment = "备注1", length = 20, canBeEmpty = true)
    private String lnRmrk1;

    /**
     * 备注2
     */
    @Column(order = 21, comment = "备注2", length = 20, canBeEmpty = true)
    private String lnRmrk2;

    /**
     * 备注3
     */
    @Column(order = 22, comment = "备注3", length = 20, canBeEmpty = true)
    private String lnRmrk3;

    /**
     * 备注4
     */
    @Column(order = 23, comment = "备注4", length = 20, canBeEmpty = true)
    private String lnRmrk4;

    /**
     * 备注5
     */
    @Column(order = 24, comment = "备注5", length = 20, canBeEmpty = true)
    private String lnRmrk5;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 25, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getLnExtnNo() {
        return lnExtnNo;
    }

    public void setLnExtnNo(String lnExtnNo) {
        this.lnExtnNo = lnExtnNo;
    }

    public String getDueBillNo() {
        return dueBillNo;
    }

    public void setDueBillNo(String dueBillNo) {
        this.dueBillNo = dueBillNo;
    }

    public String getCtrtNo() {
        return ctrtNo;
    }

    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCbusCustNo() {
        return cbusCustNo;
    }

    public void setCbusCustNo(String cbusCustNo) {
        this.cbusCustNo = cbusCustNo;
    }

    public String getBusnDealInstn() {
        return busnDealInstn;
    }

    public void setBusnDealInstn(String busnDealInstn) {
        this.busnDealInstn = busnDealInstn;
    }

    public String getExtnDt() {
        return extnDt;
    }

    public void setExtnDt(String extnDt) {
        this.extnDt = extnDt;
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

    public BigDecimal getExtnBalAmt() {
        return extnBalAmt;
    }

    public void setExtnBalAmt(BigDecimal extnBalAmt) {
        this.extnBalAmt = extnBalAmt;
    }

    public BigDecimal getOldLnIntr() {
        return oldLnIntr;
    }

    public void setOldLnIntr(BigDecimal oldLnIntr) {
        this.oldLnIntr = oldLnIntr;
    }

    public String getIntrType() {
        return intrType;
    }

    public void setIntrType(String intrType) {
        this.intrType = intrType;
    }

    public BigDecimal getNewLnIntr() {
        return newLnIntr;
    }

    public void setNewLnIntr(BigDecimal newLnIntr) {
        this.newLnIntr = newLnIntr;
    }

    public BigDecimal getExtnBaseIntr() {
        return extnBaseIntr;
    }

    public void setExtnBaseIntr(BigDecimal extnBaseIntr) {
        this.extnBaseIntr = extnBaseIntr;
    }

    public BigDecimal getIntrFlt() {
        return intrFlt;
    }

    public void setIntrFlt(BigDecimal intrFlt) {
        this.intrFlt = intrFlt;
    }

    public String getOldCtrtNo() {
        return oldCtrtNo;
    }

    public void setOldCtrtNo(String oldCtrtNo) {
        this.oldCtrtNo = oldCtrtNo;
    }

    public String getOldDueBillNo() {
        return oldDueBillNo;
    }

    public void setOldDueBillNo(String oldDueBillNo) {
        this.oldDueBillNo = oldDueBillNo;
    }

    public String getTxTlrNo() {
        return txTlrNo;
    }

    public void setTxTlrNo(String txTlrNo) {
        this.txTlrNo = txTlrNo;
    }

    public String getAuthTlrNo() {
        return authTlrNo;
    }

    public void setAuthTlrNo(String authTlrNo) {
        this.authTlrNo = authTlrNo;
    }

    public String getLnRmrk1() {
        return lnRmrk1;
    }

    public void setLnRmrk1(String lnRmrk1) {
        this.lnRmrk1 = lnRmrk1;
    }

    public String getLnRmrk2() {
        return lnRmrk2;
    }

    public void setLnRmrk2(String lnRmrk2) {
        this.lnRmrk2 = lnRmrk2;
    }

    public String getLnRmrk3() {
        return lnRmrk3;
    }

    public void setLnRmrk3(String lnRmrk3) {
        this.lnRmrk3 = lnRmrk3;
    }

    public String getLnRmrk4() {
        return lnRmrk4;
    }

    public void setLnRmrk4(String lnRmrk4) {
        this.lnRmrk4 = lnRmrk4;
    }

    public String getLnRmrk5() {
        return lnRmrk5;
    }

    public void setLnRmrk5(String lnRmrk5) {
        this.lnRmrk5 = lnRmrk5;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
