package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ACCOUNT_ACCRUED_SERIAL
 * 计提流水表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AccountAccruedSerial {

    /**
     * 机构编号
     */
    @Column(order = 0, comment = "机构编号", length = 32, canBeEmpty = false)
    private String orgno;

    /**
     * 信息ID
     */
    @Column(order = 1, comment = "信息ID", length = 32, canBeEmpty = false)
    private String serialId;

    /**
     * 用户编号
     */
    @Column(order = 2, comment = "用户编号", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 借据id
     */
    @Column(order = 3, comment = "借据id", length = 32, canBeEmpty = true)
    private String iouCode;

    /**
     * 当前其次
     */
    @Column(order = 4, comment = "当前其次", length = 11, canBeEmpty = true)
    private BigDecimal currentNum;

    /**
     * 产品ID
     */
    @Column(order = 5, comment = "产品ID", length = 32, canBeEmpty = true)
    private String productId;

    /**
     * 出资机构
     */
    @Column(order = 6, comment = "出资机构", length = 32, canBeEmpty = true)
    private String fundOrg;

    /**
     * 加盟商
     */
    @Column(order = 7, comment = "加盟商", length = 32, canBeEmpty = true)
    private String merchant;

    /**
     * 担保机构
     */
    @Column(order = 8, comment = "担保机构", length = 32, canBeEmpty = true)
    private String guarantee;

    /**
     * 记账流水号
     */
    @Column(order = 9, comment = "记账流水号", length = 32, canBeEmpty = true)
    private String acctSerialId;

    /**
     * 业务流水号
     */
    @Column(order = 10, comment = "业务流水号", length = 32, canBeEmpty = true)
    private String bizSerialId;

    /**
     * 渠道流水号
     */
    @Column(order = 11, comment = "渠道流水号", length = 36, canBeEmpty = true)
    private String reqSerialId;

    /**
     * 账务日期
     */
    @Column(order = 12, comment = "账务日期", length = 8, canBeEmpty = true)
    private String accountdate;

    /**
     * 计提利息
     */
    @Column(order = 13, comment = "计提利息", length = 16, canBeEmpty = true)
    private BigDecimal accruedInterest;

    /**
     * 计提罚息
     */
    @Column(order = 14, comment = "计提罚息", length = 16, canBeEmpty = true)
    private BigDecimal accruedDefaultInterest;

    /**
     * 计提账户管理费
     */
    @Column(order = 15, comment = "计提账户管理费", length = 16, canBeEmpty = true)
    private BigDecimal accruedManagementFee;

    /**
     * 计提其他费用
     */
    @Column(order = 16, comment = "计提其他费用", length = 16, canBeEmpty = true)
    private BigDecimal accruedOtherFee;

    /**
     * 本次计提利息
     */
    @Column(order = 17, comment = "本次计提利息", length = 16, canBeEmpty = true)
    private BigDecimal currAccruedInterest;

    /**
     * 本次计提罚息
     */
    @Column(order = 18, comment = "本次计提罚息", length = 16, canBeEmpty = true)
    private BigDecimal currAccruedDefaultInterest;

    /**
     * 本次计提账户管理费
     */
    @Column(order = 19, comment = "本次计提账户管理费", length = 16, canBeEmpty = true)
    private BigDecimal currAccruedManagementFee;

    /**
     * 本次计提其他费用
     */
    @Column(order = 20, comment = "本次计提其他费用", length = 16, canBeEmpty = true)
    private BigDecimal currAccruedOtherFee;

    /**
     * 创建时间
     */
    @Column(order = 21, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 修改时间
     */
    @Column(order = 22, comment = "修改时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 23, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getOrgno() {
        return orgno;
    }

    public void setOrgno(String orgno) {
        this.orgno = orgno;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public BigDecimal getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(BigDecimal currentNum) {
        this.currentNum = currentNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFundOrg() {
        return fundOrg;
    }

    public void setFundOrg(String fundOrg) {
        this.fundOrg = fundOrg;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getAcctSerialId() {
        return acctSerialId;
    }

    public void setAcctSerialId(String acctSerialId) {
        this.acctSerialId = acctSerialId;
    }

    public String getBizSerialId() {
        return bizSerialId;
    }

    public void setBizSerialId(String bizSerialId) {
        this.bizSerialId = bizSerialId;
    }

    public String getReqSerialId() {
        return reqSerialId;
    }

    public void setReqSerialId(String reqSerialId) {
        this.reqSerialId = reqSerialId;
    }

    public String getAccountdate() {
        return accountdate;
    }

    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate;
    }

    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(BigDecimal accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public BigDecimal getAccruedDefaultInterest() {
        return accruedDefaultInterest;
    }

    public void setAccruedDefaultInterest(BigDecimal accruedDefaultInterest) {
        this.accruedDefaultInterest = accruedDefaultInterest;
    }

    public BigDecimal getAccruedManagementFee() {
        return accruedManagementFee;
    }

    public void setAccruedManagementFee(BigDecimal accruedManagementFee) {
        this.accruedManagementFee = accruedManagementFee;
    }

    public BigDecimal getAccruedOtherFee() {
        return accruedOtherFee;
    }

    public void setAccruedOtherFee(BigDecimal accruedOtherFee) {
        this.accruedOtherFee = accruedOtherFee;
    }

    public BigDecimal getCurrAccruedInterest() {
        return currAccruedInterest;
    }

    public void setCurrAccruedInterest(BigDecimal currAccruedInterest) {
        this.currAccruedInterest = currAccruedInterest;
    }

    public BigDecimal getCurrAccruedDefaultInterest() {
        return currAccruedDefaultInterest;
    }

    public void setCurrAccruedDefaultInterest(BigDecimal currAccruedDefaultInterest) {
        this.currAccruedDefaultInterest = currAccruedDefaultInterest;
    }

    public BigDecimal getCurrAccruedManagementFee() {
        return currAccruedManagementFee;
    }

    public void setCurrAccruedManagementFee(BigDecimal currAccruedManagementFee) {
        this.currAccruedManagementFee = currAccruedManagementFee;
    }

    public BigDecimal getCurrAccruedOtherFee() {
        return currAccruedOtherFee;
    }

    public void setCurrAccruedOtherFee(BigDecimal currAccruedOtherFee) {
        this.currAccruedOtherFee = currAccruedOtherFee;
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

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
