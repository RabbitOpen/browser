package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ASSET_RISK_MANAGEMENT
 * 风控信息表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetRiskManagement {

    /**
     * 租户号
     */
    @Column(order = 0, comment = "租户号", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 借据号
     */
    @Column(order = 1, comment = "借据号", length = 32, canBeEmpty = false)
    private String iouCode;

    /**
     * 用户编号
     */
    @Column(order = 2, comment = "用户编号", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 商户Id
     */
    @Column(order = 3, comment = "商户Id", length = 32, canBeEmpty = true)
    private String merchantId;

    /**
     * 产品NO
     */
    @Column(order = 4, comment = "产品CODE", length = 32, canBeEmpty = true)
    private String productCode;

    /**
     * 产品Id
     */
    @Column(order = 5, comment = "产品Id", length = 32, canBeEmpty = true)
    private String productId;

    /**
     * 产品名称
     */
    @Column(order = 6, comment = "产品名称", length = 32, canBeEmpty = false)
    private String productName;

    /**
     * 门店Id
     */
    @Column(order = 7, comment = "门店Id", length = 32, canBeEmpty = true)
    private String shopId;

    /**
     * 逾期天数
     */
    @Column(order = 8, comment = "逾期天数", length = 11, canBeEmpty = true)
    private BigDecimal overdueDays;

    /**
     * 逾期罚息（废弃）
     */
    @Column(order = 9, comment = "逾期罚息（废弃）", length = 16, canBeEmpty = true)
    private BigDecimal preOverdueFee;

    /**
     * 逾期罚息（废弃）
     */
    @Column(order = 10, comment = "逾期罚息（废弃）", length = 16, canBeEmpty = true)
    private BigDecimal overdueFee;

    /**
     * 五级分类标志 EnumFiveLevel 1:正常2:关注3:次级4:可疑5:损失
     */
    @Column(order = 11, comment = "五级分类标志 EnumFiveLevel 1:正常2:关注3:次级4:可疑5:损失", length = 2, canBeEmpty = true)
    private String riskLevel;

    /**
     * 四级分类标志 EnumFourLevel 1:正常2:逾期3:呆滞4:呆账
     */
    @Column(order = 12, comment = "四级分类标志 EnumFourLevel 1:正常2:逾期3:呆滞4:呆账", length = 2, canBeEmpty = true)
    private String fourLevelType;

    /**
     * 认定时间
     */
    @Column(order = 13, comment = "认定时间", length = 26, canBeEmpty = true)
    private String tradeTime;

    /**
     * 认定类型EnumCognizanceType: 0:系统 1:人工
     */
    @Column(order = 14, comment = "认定类型EnumCognizanceType: 0:系统 1:人工", length = 2, canBeEmpty = true)
    private String tradeType;

    /**
     * 是否进行回归认定EnumBool: 0:否 1:是
     */
    @Column(order = 15, comment = "是否进行回归认定EnumBool: 0:否 1:是", length = 2, canBeEmpty = true)
    private String isRegression;

    /**
     * 连续正常还款次数
     */
    @Column(order = 16, comment = "连续正常还款次数", length = 4, canBeEmpty = true)
    private Integer normalRepayNumber;

    /**
     * 上一次呆账储备金（减至）
     */
    @Column(order = 17, comment = "上一次呆账储备金（减至）", length = 16, canBeEmpty = true)
    private BigDecimal lastBadDebt;

    /**
     * 创建时间
     */
    @Column(order = 18, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 19, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 是否已结清 EnumBool 0:否 1:是
     */
    @Column(order = 20, comment = "是否已结清 EnumBool 0:否 1:是", length = 2, canBeEmpty = true)
    private String isSettled;

    /**
     * 中文拼音简写
     * WLB --微粒贷
     * MYJB --蚂蚁借呗
     * BDXD --百度小贷
     */
    @Column(order = 21, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 内部机构号
     */
    @Column(order = 22, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 原明细科目编号
     */
    @Column(order = 23, comment = "原明细科目编号", length = 8, canBeEmpty = true)
    private String oldAclgNo;

    /**
     * 01 正常
     * 02 关注
     * 03 次级
     * 04 可疑
     * 05 损失
     */
    @Column(order = 24, comment = "原五级形态", length = 2, canBeEmpty = false)
    private String oldRiskLevel;

    /**
     * 新明细科目编号
     */
    @Column(order = 25, comment = "新明细科目编号", length = 8, canBeEmpty = true)
    private String newAclgNo;

    /**
     * 01 正常
     * 02 关注
     * 03 次级
     * 04 可疑
     * 05 损失
     */
    @Column(order = 26, comment = "新五级形态", length = 2, canBeEmpty = false)
    private String newRiskLevel;

    /**
     * 新科目转入金额
     */
    @Column(order = 27, comment = "转入金额", length = 20, canBeEmpty = true)
    private BigDecimal enterAmt;

    /**
     * 原科目转出金额，与转入金额相等
     */
    @Column(order = 28, comment = "转出金额", length = 20, canBeEmpty = true)
    private BigDecimal trnoAmt;

    /**
     * 经办员工号
     */
    @Column(order = 29, comment = "经办员工号", length = 12, canBeEmpty = true)
    private String hadlerTlrNo;

    /**
     * 授权员工号
     */
    @Column(order = 30, comment = "授权员工号", length = 12, canBeEmpty = true)
    private String authrTlrNo;

    /**
     * 审批员工号
     */
    @Column(order = 31, comment = "审批员工号", length = 12, canBeEmpty = true)
    private String adtrTlrNo;

    /**
     * 变动原因
     */
    @Column(order = 32, comment = "变动原因", length = 200, canBeEmpty = true)
    private String chgRsn;

    /**
     * 1-人工，0-自动。
     */
    @Column(order = 33, comment = "变动方式", length = 1, canBeEmpty = true)
    private String changeType;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public BigDecimal getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(BigDecimal overdueDays) {
        this.overdueDays = overdueDays;
    }

    public BigDecimal getPreOverdueFee() {
        return preOverdueFee;
    }

    public void setPreOverdueFee(BigDecimal preOverdueFee) {
        this.preOverdueFee = preOverdueFee;
    }

    public BigDecimal getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(BigDecimal overdueFee) {
        this.overdueFee = overdueFee;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getFourLevelType() {
        return fourLevelType;
    }

    public void setFourLevelType(String fourLevelType) {
        this.fourLevelType = fourLevelType;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getIsRegression() {
        return isRegression;
    }

    public void setIsRegression(String isRegression) {
        this.isRegression = isRegression;
    }

    public Integer getNormalRepayNumber() {
        return normalRepayNumber;
    }

    public void setNormalRepayNumber(Integer normalRepayNumber) {
        this.normalRepayNumber = normalRepayNumber;
    }

    public BigDecimal getLastBadDebt() {
        return lastBadDebt;
    }

    public void setLastBadDebt(BigDecimal lastBadDebt) {
        this.lastBadDebt = lastBadDebt;
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

    public String getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(String isSettled) {
        this.isSettled = isSettled;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getBusnDealInstn() {
        return busnDealInstn;
    }

    public void setBusnDealInstn(String busnDealInstn) {
        this.busnDealInstn = busnDealInstn;
    }

    public String getOldAclgNo() {
        return oldAclgNo;
    }

    public void setOldAclgNo(String oldAclgNo) {
        this.oldAclgNo = oldAclgNo;
    }

    public String getOldRiskLevel() {
        return oldRiskLevel;
    }

    public void setOldRiskLevel(String oldRiskLevel) {
        this.oldRiskLevel = oldRiskLevel;
    }

    public String getNewAclgNo() {
        return newAclgNo;
    }

    public void setNewAclgNo(String newAclgNo) {
        this.newAclgNo = newAclgNo;
    }

    public String getNewRiskLevel() {
        return newRiskLevel;
    }

    public void setNewRiskLevel(String newRiskLevel) {
        this.newRiskLevel = newRiskLevel;
    }

    public BigDecimal getEnterAmt() {
        return enterAmt;
    }

    public void setEnterAmt(BigDecimal enterAmt) {
        this.enterAmt = enterAmt;
    }

    public BigDecimal getTrnoAmt() {
        return trnoAmt;
    }

    public void setTrnoAmt(BigDecimal trnoAmt) {
        this.trnoAmt = trnoAmt;
    }

    public String getHadlerTlrNo() {
        return hadlerTlrNo;
    }

    public void setHadlerTlrNo(String hadlerTlrNo) {
        this.hadlerTlrNo = hadlerTlrNo;
    }

    public String getAuthrTlrNo() {
        return authrTlrNo;
    }

    public void setAuthrTlrNo(String authrTlrNo) {
        this.authrTlrNo = authrTlrNo;
    }

    public String getAdtrTlrNo() {
        return adtrTlrNo;
    }

    public void setAdtrTlrNo(String adtrTlrNo) {
        this.adtrTlrNo = adtrTlrNo;
    }

    public String getChgRsn() {
        return chgRsn;
    }

    public void setChgRsn(String chgRsn) {
        this.chgRsn = chgRsn;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }
}
