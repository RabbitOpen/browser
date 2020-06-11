package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * 产品信息
 * ICCS_ASSET_LOAN_INVOICE_PRODUCT
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetLoanInvoiceProduct {

    /**
     * 租户号
     */
    @Column(order = 0, comment = "租户号", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 借据编号
     */
    @Column(order = 1, comment = "借据编号", length = 32, canBeEmpty = false)
    private String loanInvoiceId;

    /**
     * 产品主键
     */
    @Column(order = 2, comment = "产品主键", length = 32, canBeEmpty = true)
    private String productNo;

    /**
     * 产品编号
     */
    @Column(order = 3, comment = "产品编号", length = 32, canBeEmpty = true)
    private String creditProductId;

    /**
     * 产品名称
     */
    @Column(order = 4, comment = "产品名称", length = 32, canBeEmpty = true)
    private String productName;

    /**
     * 还款方式 EnumRepayMethod 1:等额本息2:等额本金3:等本等息4:按期付息到期还本5:随借随还，按月付息，到期还本6:到期一次性还本付息7:按日计息，等额还款
     */
    @Column(order = 5, comment = "还款方式", length = 2, canBeEmpty = true)
    private String repayMethodType;

    /**
     * 原始利率
     */
    @Column(order = 6, comment = "原始利率", length = 11, canBeEmpty = true)
    private BigDecimal initRate;

    /**
     * 还款频率
     */
    @Column(order = 7, comment = "还款频率", length = 2, canBeEmpty = true)
    private String repayPeriod;

    /**
     * 还款顺序 EnumRepayOrder 1:按利息先2:按费用先
     */
    @Column(order = 8, comment = "还款顺序", length = 2, canBeEmpty = true)
    private String repayOrder;

    /**
     * 本金收取方式 EnumReceiveType 1:预收2:正常3:后收;
     */
    @Column(order = 9, comment = "本金收取方式", length = 2, canBeEmpty = true)
    private String principalReceiveType;

    /**
     * 利息收取方式 EnumReceiveType 1:预收2:正常3:后收;
     */
    @Column(order = 10, comment = "利息收取方式", length = 2, canBeEmpty = true)
    private String interestReceiveType;

    /**
     * 提前还款后处理方式 EnumAdvanceRepayHandler 1:待处理2:处理中3:成功4:失败
     */
    @Column(order = 11, comment = "提前还款后处理方式", length = 2, canBeEmpty = true)
    private String advanceRepayHandler;

    /**
     * 提前还款后计息方式 EnumAdvanceRepayProfitType 1:按实际天数2:按实际使用期数
     */
    @Column(order = 12, comment = "提前还款后计息方式", length = 2, canBeEmpty = true)
    private String advanceRepayProfitType;

    /**
     * 提前还款费用规则  EnumAdvanceRepayFeeType 1:按实际使用期数 2:按借据全部剩余
     */
    @Column(order = 13, comment = "提前还款费用规则", length = 2, canBeEmpty = true)
    private String advanceRepayFeeType;

    /**
     * 提前还款类型 EnumAdvanceRepayType 1:全部2:部分;
     */
    @Column(order = 14, comment = "提前还款类型", length = 2, canBeEmpty = true)
    private String advanceRepayType;

    /**
     * 是否允许提前还款 EnumBool 0:否1：是
     */
    @Column(order = 15, comment = "是否允许提前还款", length = 2, canBeEmpty = true)
    private String isAdvanceRepay;

    /**
     * 是否收取提前还款违约金 EnumBool 0:否1：是
     */
    @Column(order = 16, comment = "是否收取提前还款违约金", length = 2, canBeEmpty = true)
    private String isAdvanceRepayAmt;

    /**
     * 部分提前还款利息计算方式 0-利随本清,1-非利随本清
     */
    @Column(order = 17, comment = "部分提前还款利息计算方式", length = 2, canBeEmpty = true)
    private String advanceRepayPartType;

    /**
     * 是否支持退款
     */
    @Column(order = 18, comment = "是否支持退款", length = 2, canBeEmpty = true)
    private String isRefund;

    /**
     * 退款资金方向
     */
    @Column(order = 19, comment = "退款资金方向", length = 2, canBeEmpty = true)
    private String refundCapitalTo;

    /**
     * 固定日类型 EnumRepayFixDayType 1:否2:是
     */
    @Column(order = 20, comment = "固定日类型", length = 2, canBeEmpty = true)
    private String repayFixDayType;

    /**
     * 固定日
     */
    @Column(order = 21, comment = "固定日", length = 4, canBeEmpty = true)
    private Integer fixDay;

    /**
     * 首期还款间隔天数
     */
    @Column(order = 22, comment = "首期还款间隔天数", length = 11, canBeEmpty = true)
    private BigDecimal firstRepayExtendDay;

    /**
     * 末期还款间隔天数
     */
    @Column(order = 23, comment = "末期还款间隔天数", length = 11, canBeEmpty = true)
    private BigDecimal lastRepayExtendDay;

    /**
     * 是否计算复利 EnumBool 0:否1：是
     */
    @Column(order = 24, comment = "是否计算复利", length = 2, canBeEmpty = true)
    private String isCompoundInterest;

    /**
     * 宽限日
     */
    @Column(order = 25, comment = "宽限日", length = 11, canBeEmpty = true)
    private BigDecimal extraRepayDay;

    /**
     * 额外信息
     */
    @Column(order = 26, comment = "额外信息", length = 255, canBeEmpty = true)
    private String extraInfo;

    /**
     * 创建时间
     */
    @Column(order = 27, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 28, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 允许还款提前天数
     */
    @Column(order = 29, comment = "允许还款提前天数", length = 11, canBeEmpty = true)
    private BigDecimal earlyRepayDay;

    /**
     * 是否允许当月还款 EnumBool 0:否 1:是
     */
    @Column(order = 30, comment = "是否允许当月还款", length = 2, canBeEmpty = true)
    private String isAllowRepayCurrMonth;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 31, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getLoanInvoiceId() {
        return loanInvoiceId;
    }

    public void setLoanInvoiceId(String loanInvoiceId) {
        this.loanInvoiceId = loanInvoiceId;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getCreditProductId() {
        return creditProductId;
    }

    public void setCreditProductId(String creditProductId) {
        this.creditProductId = creditProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRepayMethodType() {
        return repayMethodType;
    }

    public void setRepayMethodType(String repayMethodType) {
        this.repayMethodType = repayMethodType;
    }

    public BigDecimal getInitRate() {
        return initRate;
    }

    public void setInitRate(BigDecimal initRate) {
        this.initRate = initRate;
    }

    public String getRepayPeriod() {
        return repayPeriod;
    }

    public void setRepayPeriod(String repayPeriod) {
        this.repayPeriod = repayPeriod;
    }

    public String getRepayOrder() {
        return repayOrder;
    }

    public void setRepayOrder(String repayOrder) {
        this.repayOrder = repayOrder;
    }

    public String getPrincipalReceiveType() {
        return principalReceiveType;
    }

    public void setPrincipalReceiveType(String principalReceiveType) {
        this.principalReceiveType = principalReceiveType;
    }

    public String getInterestReceiveType() {
        return interestReceiveType;
    }

    public void setInterestReceiveType(String interestReceiveType) {
        this.interestReceiveType = interestReceiveType;
    }

    public String getAdvanceRepayHandler() {
        return advanceRepayHandler;
    }

    public void setAdvanceRepayHandler(String advanceRepayHandler) {
        this.advanceRepayHandler = advanceRepayHandler;
    }

    public String getAdvanceRepayProfitType() {
        return advanceRepayProfitType;
    }

    public void setAdvanceRepayProfitType(String advanceRepayProfitType) {
        this.advanceRepayProfitType = advanceRepayProfitType;
    }

    public String getAdvanceRepayFeeType() {
        return advanceRepayFeeType;
    }

    public void setAdvanceRepayFeeType(String advanceRepayFeeType) {
        this.advanceRepayFeeType = advanceRepayFeeType;
    }

    public String getAdvanceRepayType() {
        return advanceRepayType;
    }

    public void setAdvanceRepayType(String advanceRepayType) {
        this.advanceRepayType = advanceRepayType;
    }

    public String getIsAdvanceRepay() {
        return isAdvanceRepay;
    }

    public void setIsAdvanceRepay(String isAdvanceRepay) {
        this.isAdvanceRepay = isAdvanceRepay;
    }

    public String getIsAdvanceRepayAmt() {
        return isAdvanceRepayAmt;
    }

    public void setIsAdvanceRepayAmt(String isAdvanceRepayAmt) {
        this.isAdvanceRepayAmt = isAdvanceRepayAmt;
    }

    public String getAdvanceRepayPartType() {
        return advanceRepayPartType;
    }

    public void setAdvanceRepayPartType(String advanceRepayPartType) {
        this.advanceRepayPartType = advanceRepayPartType;
    }

    public String getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund;
    }

    public String getRefundCapitalTo() {
        return refundCapitalTo;
    }

    public void setRefundCapitalTo(String refundCapitalTo) {
        this.refundCapitalTo = refundCapitalTo;
    }

    public String getRepayFixDayType() {
        return repayFixDayType;
    }

    public void setRepayFixDayType(String repayFixDayType) {
        this.repayFixDayType = repayFixDayType;
    }

    public Integer getFixDay() {
        return fixDay;
    }

    public void setFixDay(Integer fixDay) {
        this.fixDay = fixDay;
    }

    public BigDecimal getFirstRepayExtendDay() {
        return firstRepayExtendDay;
    }

    public void setFirstRepayExtendDay(BigDecimal firstRepayExtendDay) {
        this.firstRepayExtendDay = firstRepayExtendDay;
    }

    public BigDecimal getLastRepayExtendDay() {
        return lastRepayExtendDay;
    }

    public void setLastRepayExtendDay(BigDecimal lastRepayExtendDay) {
        this.lastRepayExtendDay = lastRepayExtendDay;
    }

    public String getIsCompoundInterest() {
        return isCompoundInterest;
    }

    public void setIsCompoundInterest(String isCompoundInterest) {
        this.isCompoundInterest = isCompoundInterest;
    }

    public BigDecimal getExtraRepayDay() {
        return extraRepayDay;
    }

    public void setExtraRepayDay(BigDecimal extraRepayDay) {
        this.extraRepayDay = extraRepayDay;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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

    public BigDecimal getEarlyRepayDay() {
        return earlyRepayDay;
    }

    public void setEarlyRepayDay(BigDecimal earlyRepayDay) {
        this.earlyRepayDay = earlyRepayDay;
    }

    public String getIsAllowRepayCurrMonth() {
        return isAllowRepayCurrMonth;
    }

    public void setIsAllowRepayCurrMonth(String isAllowRepayCurrMonth) {
        this.isAllowRepayCurrMonth = isAllowRepayCurrMonth;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
