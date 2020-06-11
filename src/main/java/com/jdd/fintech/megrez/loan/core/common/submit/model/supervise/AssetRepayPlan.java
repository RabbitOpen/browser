package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ASSET_REPAY_PLAN
 * 还款计划表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetRepayPlan {

    /**
     * 租户号
     */
    @Column(order = 0, comment = "租户号", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 借据号
     */
    @Column(order = 1, comment = "借据号", length = 32, canBeEmpty = false)
    private String loanInvoiceId;

    /**
     * 借款人
     */
    @Column(order = 2, comment = "借款人", length = 32, canBeEmpty = true)
    private String borrowerUserId;

    /**
     * 商户号（合作方行号）
     */
    @Column(order = 3, comment = "商户号", length = 32, canBeEmpty = true)
    private String merchantId;

    /**
     * 合作方用户编号
     */
    @Column(order = 4, comment = "合作方用户编号", length = 32, canBeEmpty = true)
    private String partnerUserId;

    /**
     * 总期次
     */
    @Column(order = 5, comment = "总期次", length = 11, canBeEmpty = true)
    private BigDecimal repayNum;

    /**
     * 当前期次
     */
    @Column(order = 6, comment = "当前期次", length = 11, canBeEmpty = false)
    private BigDecimal currentNum;

    /**
     * 合同编号
     */
    @Column(order = 7, comment = "合同编号", length = 32, canBeEmpty = false)
    private String contractId;

    /**
     * 托管类型 1-非托管 2-托管
     */
    @Column(order = 8, comment = "托管类型 1-非托管 2-托管", length = 2, canBeEmpty = true)
    private String manageType;

    /**
     * 开始时间
     */
    @Column(order = 9, comment = "开始时间", length = 26, canBeEmpty = true)
    private String startDate;

    /**
     * 收益天数
     */
    @Column(order = 10, comment = "收益天数", length = 11, canBeEmpty = true)
    private BigDecimal profitDays;

    /**
     * 预期还款金额
     */
    @Column(order = 11, comment = "预期还款金额", length = 16, canBeEmpty = true)
    private BigDecimal preRepayAmt;

    /**
     * 应还时间
     */
    @Column(order = 12, comment = "应还时间", length = 26, canBeEmpty = true)
    private String preRepayDate;

    /**
     * 宽限日期
     */
    @Column(order = 13, comment = "宽限日期", length = 26, canBeEmpty = true)
    private String granceDate;

    /**
     * 应还本金
     */
    @Column(order = 14, comment = "应还本金", length = 16, canBeEmpty = true)
    private BigDecimal preRepayPrincipal;

    /**
     * 应还利息
     */
    @Column(order = 15, comment = "应还利息", length = 16, canBeEmpty = true)
    private BigDecimal preRepayInterest;

    /**
     * 应还手续费
     */
    @Column(order = 16, comment = "应还手续费", length = 16, canBeEmpty = true)
    private BigDecimal preRepayFee;

    /**
     * 应还账户管理费
     */
    @Column(order = 17, comment = "应还账户管理费", length = 16, canBeEmpty = true)
    private BigDecimal preRepayManagementFee;

    /**
     * 最近实还金额
     */
    @Column(order = 18, comment = "最近实还金额", length = 16, canBeEmpty = true)
    private BigDecimal lastRepayAmt;

    /**
     * 最近实还时间
     */
    @Column(order = 19, comment = "最近实还时间", length = 26, canBeEmpty = true)
    private String lastRepayDate;

    /**
     * 剩余应还总金额
     */
    @Column(order = 20, comment = "剩余应还总金额", length = 16, canBeEmpty = true)
    private BigDecimal leftRepayAmt;

    /**
     * 剩余应还本金
     */
    @Column(order = 21, comment = "剩余应还本金", length = 16, canBeEmpty = true)
    private BigDecimal leftRepayPrincipal;

    /**
     * 剩余应还利息
     */
    @Column(order = 22, comment = "剩余应还利息", length = 16, canBeEmpty = true)
    private BigDecimal leftRepayInterest;

    /**
     * 剩余应还手续费
     */
    @Column(order = 23, comment = "剩余应还手续费", length = 16, canBeEmpty = true)
    private BigDecimal leftRepayFee;

    /**
     * 剩余应还账户管理费
     */
    @Column(order = 24, comment = "剩余应还账户管理费", length = 16, canBeEmpty = true)
    private BigDecimal leftRepayManagementFee;

    /**
     * 还款计划状态 EnumRepayPlanStatus 1:待还款2:部分还款3:已还款4:逾期5:逾期部分还款6:逾期还款7:已结清
     */
    @Column(order = 25, comment = "还款计划状态 EnumRepayPlanStatus 1:待还款2:部分还款3:已还款4:逾期5:逾期部分还款6:逾期还款7:已结清", length = 2, canBeEmpty = true)
    private String repayPlanStatus;

    /**
     * 应还用户
     */
    @Column(order = 26, comment = "应还用户", length = 32, canBeEmpty = true)
    private String preRepayUserId;

    /**
     * 实还用户
     */
    @Column(order = 27, comment = "实还用户", length = 32, canBeEmpty = true)
    private String repayUserId;

    /**
     * 免息天数
     */
    @Column(order = 28, comment = "免息天数", length = 11, canBeEmpty = true)
    private BigDecimal freeInterestDay;

    /**
     * 罚息计算时间
     */
    @Column(order = 29, comment = "罚息计算时间", length = 26, canBeEmpty = true)
    private String calcOverdueFeeDate;

    /**
     * 应付逾期罚息
     */
    @Column(order = 30, comment = "应付逾期罚息", length = 16, canBeEmpty = true)
    private BigDecimal preOverdueFee;

    /**
     * 剩余逾期罚息
     */
    @Column(order = 31, comment = "剩余逾期罚息", length = 16, canBeEmpty = true)
    private BigDecimal leftOverdueFee;

    /**
     * 临时缓存罚息
     */
    @Column(order = 32, comment = "临时缓存罚息", length = 16, canBeEmpty = true)
    private BigDecimal tempOverdueFee;

    /**
     * 结算罚息
     */
    @Column(order = 33, comment = "结算罚息", length = 16, canBeEmpty = true)
    private BigDecimal settleOverdueFee;

    /**
     * 还款手续费
     */
    @Column(order = 34, comment = "还款手续费", length = 16, canBeEmpty = true)
    private BigDecimal repaymentFee;

    /**
     * 提前还款手续费
     */
    @Column(order = 35, comment = "提前还款手续费", length = 16, canBeEmpty = true)
    private BigDecimal advanceRepayFee;

    /**
     * 剩余本金
     */
    @Column(order = 36, comment = "剩余本金", length = 16, canBeEmpty = true)
    private BigDecimal leftPrincipal;

    /**
     * 还款流水
     */
    @Column(order = 37, comment = "还款流水", length = 32, canBeEmpty = true)
    private String repaySerialNo;

    /**
     * 逾期天数
     */
    @Column(order = 38, comment = "逾期天数", length = 4, canBeEmpty = true)
    private Integer overdueDays;

    /**
     * 渠道编号
     */
    @Column(order = 39, comment = "渠道编号", length = 32, canBeEmpty = true)
    private String channelNo;

    /**
     * 创建时间
     */
    @Column(order = 40, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 41, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 虚户ID
     */
    @Column(order = 42, comment = "虚户ID", length = 32, canBeEmpty = true)
    private String virtualUserId;

    /**
     * 中文拼音简写
     * WLB --微粒贷
     * MYJB --蚂蚁借呗
     * BDXD --百度小贷
     */
    @Column(order = 43, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 账号
     */
    @Column(order = 44, comment = "账号", length = 50, canBeEmpty = true)
    private String lnAcctNo;

    /**
     * 0-未还
     * 1-已还清/结清
     * 2-本金结清，利息未结清
     * 3-本金未结清，利息结清
     */
    @Column(order = 45, comment = "还款标志", length = 1, canBeEmpty = false)
    private String rfnFlag;

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

    public String getBorrowerUserId() {
        return borrowerUserId;
    }

    public void setBorrowerUserId(String borrowerUserId) {
        this.borrowerUserId = borrowerUserId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPartnerUserId() {
        return partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }

    public BigDecimal getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(BigDecimal repayNum) {
        this.repayNum = repayNum;
    }

    public BigDecimal getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(BigDecimal currentNum) {
        this.currentNum = currentNum;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getProfitDays() {
        return profitDays;
    }

    public void setProfitDays(BigDecimal profitDays) {
        this.profitDays = profitDays;
    }

    public BigDecimal getPreRepayAmt() {
        return preRepayAmt;
    }

    public void setPreRepayAmt(BigDecimal preRepayAmt) {
        this.preRepayAmt = preRepayAmt;
    }

    public String getPreRepayDate() {
        return preRepayDate;
    }

    public void setPreRepayDate(String preRepayDate) {
        this.preRepayDate = preRepayDate;
    }

    public String getGranceDate() {
        return granceDate;
    }

    public void setGranceDate(String granceDate) {
        this.granceDate = granceDate;
    }

    public BigDecimal getPreRepayPrincipal() {
        return preRepayPrincipal;
    }

    public void setPreRepayPrincipal(BigDecimal preRepayPrincipal) {
        this.preRepayPrincipal = preRepayPrincipal;
    }

    public BigDecimal getPreRepayInterest() {
        return preRepayInterest;
    }

    public void setPreRepayInterest(BigDecimal preRepayInterest) {
        this.preRepayInterest = preRepayInterest;
    }

    public BigDecimal getPreRepayFee() {
        return preRepayFee;
    }

    public void setPreRepayFee(BigDecimal preRepayFee) {
        this.preRepayFee = preRepayFee;
    }

    public BigDecimal getPreRepayManagementFee() {
        return preRepayManagementFee;
    }

    public void setPreRepayManagementFee(BigDecimal preRepayManagementFee) {
        this.preRepayManagementFee = preRepayManagementFee;
    }

    public BigDecimal getLastRepayAmt() {
        return lastRepayAmt;
    }

    public void setLastRepayAmt(BigDecimal lastRepayAmt) {
        this.lastRepayAmt = lastRepayAmt;
    }

    public String getLastRepayDate() {
        return lastRepayDate;
    }

    public void setLastRepayDate(String lastRepayDate) {
        this.lastRepayDate = lastRepayDate;
    }

    public BigDecimal getLeftRepayAmt() {
        return leftRepayAmt;
    }

    public void setLeftRepayAmt(BigDecimal leftRepayAmt) {
        this.leftRepayAmt = leftRepayAmt;
    }

    public BigDecimal getLeftRepayPrincipal() {
        return leftRepayPrincipal;
    }

    public void setLeftRepayPrincipal(BigDecimal leftRepayPrincipal) {
        this.leftRepayPrincipal = leftRepayPrincipal;
    }

    public BigDecimal getLeftRepayInterest() {
        return leftRepayInterest;
    }

    public void setLeftRepayInterest(BigDecimal leftRepayInterest) {
        this.leftRepayInterest = leftRepayInterest;
    }

    public BigDecimal getLeftRepayFee() {
        return leftRepayFee;
    }

    public void setLeftRepayFee(BigDecimal leftRepayFee) {
        this.leftRepayFee = leftRepayFee;
    }

    public BigDecimal getLeftRepayManagementFee() {
        return leftRepayManagementFee;
    }

    public void setLeftRepayManagementFee(BigDecimal leftRepayManagementFee) {
        this.leftRepayManagementFee = leftRepayManagementFee;
    }

    public String getRepayPlanStatus() {
        return repayPlanStatus;
    }

    public void setRepayPlanStatus(String repayPlanStatus) {
        this.repayPlanStatus = repayPlanStatus;
    }

    public String getPreRepayUserId() {
        return preRepayUserId;
    }

    public void setPreRepayUserId(String preRepayUserId) {
        this.preRepayUserId = preRepayUserId;
    }

    public String getRepayUserId() {
        return repayUserId;
    }

    public void setRepayUserId(String repayUserId) {
        this.repayUserId = repayUserId;
    }

    public BigDecimal getFreeInterestDay() {
        return freeInterestDay;
    }

    public void setFreeInterestDay(BigDecimal freeInterestDay) {
        this.freeInterestDay = freeInterestDay;
    }

    public String getCalcOverdueFeeDate() {
        return calcOverdueFeeDate;
    }

    public void setCalcOverdueFeeDate(String calcOverdueFeeDate) {
        this.calcOverdueFeeDate = calcOverdueFeeDate;
    }

    public BigDecimal getPreOverdueFee() {
        return preOverdueFee;
    }

    public void setPreOverdueFee(BigDecimal preOverdueFee) {
        this.preOverdueFee = preOverdueFee;
    }

    public BigDecimal getLeftOverdueFee() {
        return leftOverdueFee;
    }

    public void setLeftOverdueFee(BigDecimal leftOverdueFee) {
        this.leftOverdueFee = leftOverdueFee;
    }

    public BigDecimal getTempOverdueFee() {
        return tempOverdueFee;
    }

    public void setTempOverdueFee(BigDecimal tempOverdueFee) {
        this.tempOverdueFee = tempOverdueFee;
    }

    public BigDecimal getSettleOverdueFee() {
        return settleOverdueFee;
    }

    public void setSettleOverdueFee(BigDecimal settleOverdueFee) {
        this.settleOverdueFee = settleOverdueFee;
    }

    public BigDecimal getRepaymentFee() {
        return repaymentFee;
    }

    public void setRepaymentFee(BigDecimal repaymentFee) {
        this.repaymentFee = repaymentFee;
    }

    public BigDecimal getAdvanceRepayFee() {
        return advanceRepayFee;
    }

    public void setAdvanceRepayFee(BigDecimal advanceRepayFee) {
        this.advanceRepayFee = advanceRepayFee;
    }

    public BigDecimal getLeftPrincipal() {
        return leftPrincipal;
    }

    public void setLeftPrincipal(BigDecimal leftPrincipal) {
        this.leftPrincipal = leftPrincipal;
    }

    public String getRepaySerialNo() {
        return repaySerialNo;
    }

    public void setRepaySerialNo(String repaySerialNo) {
        this.repaySerialNo = repaySerialNo;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
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

    public String getVirtualUserId() {
        return virtualUserId;
    }

    public void setVirtualUserId(String virtualUserId) {
        this.virtualUserId = virtualUserId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getLnAcctNo() {
        return lnAcctNo;
    }

    public void setLnAcctNo(String lnAcctNo) {
        this.lnAcctNo = lnAcctNo;
    }

    public String getRfnFlag() {
        return rfnFlag;
    }

    public void setRfnFlag(String rfnFlag) {
        this.rfnFlag = rfnFlag;
    }
}
