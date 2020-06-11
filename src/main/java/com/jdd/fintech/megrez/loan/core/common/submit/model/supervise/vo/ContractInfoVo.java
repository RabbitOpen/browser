package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise.vo;

import java.math.BigDecimal;

/**
 * @auther yuanjingshen
 * @date 2020/5/1 14:46
 * @desc 合同信息VO
 */
public class ContractInfoVo {
    private Long id;
    private String iouCode;
    private String tenantId;
    private String contractId;
    private String userId;
    private String discountRuleId;
    private String loanUserId;
    private String repayUserId;
    private String borrowUserId;
    private String receiveUserId;
    private String idKind;
    private String idNo;
    private String customerName;
    private String signContractTime;
    private String validateTime;
    private String createTime;
    private String updateTime;
    private String cbusCustNo;
    private BigDecimal ctrtAmt;
    private Integer trmMon;
    private String ctrtBeginDt;
    private String ctrtEndDt;
    private String ctrtSignDt;
    private String cacctDt;
    private String lnFivTyp;
    private String productCode;
    private String intrType;
    private String rfnSty;
    private BigDecimal baseIntr;
    private BigDecimal executeRate;
    private BigDecimal intrFlt;
    private BigDecimal intRate;
    private String guarWay;
    private String lnTrm;
    private String payWayCd;
    private String loanPurp;
    private String lnSts;
    private String delayDt;
    private String lnBizCase;
    private String lnIntrTypCd;

    public String getLnIntrTypCd() {
        return lnIntrTypCd;
    }

    public void setLnIntrTypCd(String lnIntrTypCd) {
        this.lnIntrTypCd = lnIntrTypCd;
    }

    public BigDecimal getExecuteRate() {
        return executeRate;
    }

    public void setExecuteRate(BigDecimal executeRate) {
        this.executeRate = executeRate;
    }

    public String getLnBizCase() {
        return lnBizCase;
    }

    public void setLnBizCase(String lnBizCase) {
        this.lnBizCase = lnBizCase;
    }

    public String getDelayDt() {
        return delayDt;
    }

    public void setDelayDt(String delayDt) {
        this.delayDt = delayDt;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getRfnSty() {
        return rfnSty;
    }

    public void setRfnSty(String rfnSty) {
        this.rfnSty = rfnSty;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDiscountRuleId() {
        return discountRuleId;
    }

    public void setDiscountRuleId(String discountRuleId) {
        this.discountRuleId = discountRuleId;
    }

    public String getLoanUserId() {
        return loanUserId;
    }

    public void setLoanUserId(String loanUserId) {
        this.loanUserId = loanUserId;
    }

    public String getRepayUserId() {
        return repayUserId;
    }

    public void setRepayUserId(String repayUserId) {
        this.repayUserId = repayUserId;
    }

    public String getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(String borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getIdKind() {
        return idKind;
    }

    public void setIdKind(String idKind) {
        this.idKind = idKind;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSignContractTime() {
        return signContractTime;
    }

    public void setSignContractTime(String signContractTime) {
        this.signContractTime = signContractTime;
    }

    public String getValidateTime() {
        return validateTime;
    }

    public void setValidateTime(String validateTime) {
        this.validateTime = validateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCbusCustNo() {
        return cbusCustNo;
    }

    public void setCbusCustNo(String cbusCustNo) {
        this.cbusCustNo = cbusCustNo;
    }

    public BigDecimal getCtrtAmt() {
        return ctrtAmt;
    }

    public void setCtrtAmt(BigDecimal ctrtAmt) {
        this.ctrtAmt = ctrtAmt;
    }

    public Integer getTrmMon() {
        return trmMon;
    }

    public void setTrmMon(Integer trmMon) {
        this.trmMon = trmMon;
    }

    public String getCtrtBeginDt() {
        return ctrtBeginDt;
    }

    public void setCtrtBeginDt(String ctrtBeginDt) {
        this.ctrtBeginDt = ctrtBeginDt;
    }

    public String getCtrtEndDt() {
        return ctrtEndDt;
    }

    public void setCtrtEndDt(String ctrtEndDt) {
        this.ctrtEndDt = ctrtEndDt;
    }

    public String getCtrtSignDt() {
        return ctrtSignDt;
    }

    public void setCtrtSignDt(String ctrtSignDt) {
        this.ctrtSignDt = ctrtSignDt;
    }

    public String getCacctDt() {
        return cacctDt;
    }

    public void setCacctDt(String cacctDt) {
        this.cacctDt = cacctDt;
    }

    public String getLnFivTyp() {
        return lnFivTyp;
    }

    public void setLnFivTyp(String lnFivTyp) {
        this.lnFivTyp = lnFivTyp;
    }

    public String getIntrType() {
        return intrType;
    }

    public void setIntrType(String intrType) {
        this.intrType = intrType;
    }

    public BigDecimal getBaseIntr() {
        return baseIntr;
    }

    public void setBaseIntr(BigDecimal baseIntr) {
        this.baseIntr = baseIntr;
    }

    public BigDecimal getIntrFlt() {
        return intrFlt;
    }

    public void setIntrFlt(BigDecimal intrFlt) {
        this.intrFlt = intrFlt;
    }

    public BigDecimal getIntRate() {
        return intRate;
    }

    public void setIntRate(BigDecimal intRate) {
        this.intRate = intRate;
    }

    public String getGuarWay() {
        return guarWay;
    }

    public void setGuarWay(String guarWay) {
        this.guarWay = guarWay;
    }

    public String getLnTrm() {
        return lnTrm;
    }

    public void setLnTrm(String lnTrm) {
        this.lnTrm = lnTrm;
    }

    public String getPayWayCd() {
        return payWayCd;
    }

    public void setPayWayCd(String payWayCd) {
        this.payWayCd = payWayCd;
    }

    public String getLoanPurp() {
        return loanPurp;
    }

    public void setLoanPurp(String loanPurp) {
        this.loanPurp = loanPurp;
    }

    public String getLnSts() {
        return lnSts;
    }

    public void setLnSts(String lnSts) {
        this.lnSts = lnSts;
    }
}
