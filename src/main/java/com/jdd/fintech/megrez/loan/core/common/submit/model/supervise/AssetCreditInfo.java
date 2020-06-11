package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ASSET_CREDIT_INFO
 * 授信信息表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetCreditInfo {

    /**
     * 租户号
     */
    @Column(order = 0, comment = "租户号", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 授信编号
     */
    @Column(order = 1, comment = "授信编号", length = 60, canBeEmpty = false)
    private String creditId;

    /**
     * 用户编号
     */
    @Column(order = 2, comment = "用户编号", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 产品主键
     */
    @Column(order = 3, comment = "产品主键", length = 32, canBeEmpty = true)
    private String creditProductNo;

    /**
     * 授信产品id
     */
    @Column(order = 4, comment = "授信产品id", length = 32, canBeEmpty = true)
    private String creditProductId;

    /**
     * 授信产品名称
     */
    @Column(order = 5, comment = "授信产品名称", length = 32, canBeEmpty = true)
    private String creditProductName;

    /**
     * 授信额度
     */
    @Column(order = 6, comment = "授信额度", length = 16, canBeEmpty = true)
    private BigDecimal creditAmt;

    /**
     * 冻结额度
     */
    @Column(order = 7, comment = "冻结额度", length = 16, canBeEmpty = true)
    private BigDecimal frozenCreditAmt;

    /**
     * 使用额度
     */
    @Column(order = 8, comment = "使用额度", length = 16, canBeEmpty = true)
    private BigDecimal useCreditAmt;

    /**
     * 历史使用额度
     */
    @Column(order = 9, comment = "历史使用额度", length = 16, canBeEmpty = true)
    private BigDecimal hisUseCreditAmt;

    /**
     * 暂封额度
     */
    @Column(order = 10, comment = "暂封额度", length = 16, canBeEmpty = true)
    private BigDecimal closeCreditAmt;

    /**
     * 额度类型 EnumCreditType 1:循环0:不可循环;
     */
    @Column(order = 11, comment = "额度类型 EnumCreditType 1:循环0:不可循环;", length = 2, canBeEmpty = true)
    private String creditType;

    /**
     * 生效时间
     */
    @Column(order = 12, comment = "生效时间", length = 26, canBeEmpty = true)
    private String startDate;

    /**
     * 失效时间
     */
    @Column(order = 13, comment = "失效时间", length = 26, canBeEmpty = true)
    private String endDate;

    /**
     * 额度状态[参考枚举：EnumCreditStatus]
     */
    @Column(order = 14, comment = "额度状态[参考枚举：EnumCreditStatus]", length = 2, canBeEmpty = true)
    private String creditStatus;

    /**
     * 生效状态 EnumBool 0:否1：是
     */
    @Column(order = 15, comment = "生效状态 EnumBool 0:否1：是", length = 2, canBeEmpty = true)
    private String validStatus;

    /**
     * 额度恢复方式  EnumRecoverCreditType 0:本金归还即恢复 1:单笔借据结清恢复
     */
    @Column(order = 16, comment = "额度恢复方式  EnumRecoverCreditType 0:本金归还即恢复 1:单笔借据结清恢复", length = 2, canBeEmpty = true)
    private String recoverCreditType;

    /**
     * 创建时间
     */
    @Column(order = 17, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 18, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 中文拼音简写
     * WLB --微粒贷
     * MYJB --蚂蚁借呗
     * BDXD --百度小贷
     */
    @Column(order = 19, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 银行内部机构号。应具有标识机构的唯一性。
     */
    @Column(order = 20, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 授信主体种类：（默认为04）
     * 01-单一法人授信
     * 02-集团客户授信
     * 03-供应链融资
     * 04-个人客户授信
     * 05-同业客户授信
     * 06-其他。
     */
    @Column(order = 21, comment = "授信种类", length = 2, canBeEmpty = false)
    private String limitType;

    /**
     * 核心客户编号
     */
    @Column(order = 22, comment = "核心客户编号", length = 20, canBeEmpty = true)
    private String cbusCustNo;

    /**
     * 遵循《GB/T 12406-2008 表示货币和资金的代码》的字母代码，如CNY。
     */
    @Column(order = 23, comment = "单位币种", length = 3, canBeEmpty = false)
    private String unitCcy;

    /**
     * 首次授信日期
     * 授信起始日期
     */
    @Column(order = 24, comment = "首次授信日期", length = 8, canBeEmpty = false)
    private String firstLimitDt;

    /**
     * 天。（结束时间-开始时间）
     */
    @Column(order = 25, comment = "授信期限", length = 4, canBeEmpty = false)
    private Integer tenor;

    /**
     * 决策单意见
     */
    @Column(order = 26, comment = "决策单意见", length = 400, canBeEmpty = true)
    private String decSheetOpinion;

    /**
     * 最终审批人
     */
    @Column(order = 27, comment = "最终审批人", length = 12, canBeEmpty = true)
    private String endAdtr;

    /**
     * 临时额度
     */
    @Column(order = 28, comment = "临时额度", length = 20, canBeEmpty = true)
    private BigDecimal tempAmt;

    /**
     * 1-是；0-否
     */
    @Column(order = 29, comment = "是否临时额度", length = 1, canBeEmpty = false)
    private String ifTemp;

    /**
     * 临时额度开始日期
     */
    @Column(order = 30, comment = "临时额度开始日期", length = 8, canBeEmpty = true)
    private String tempAmtBeginDt;

    /**
     * 临时额度结束日期
     */
    @Column(order = 31, comment = "临时额度结束日期", length = 8, canBeEmpty = true)
    private String tempAmtEndDt;

    /**
     * 授信员工号
     */
    @Column(order = 32, comment = "授信员工号", length = 12, canBeEmpty = false)
    private String limitEmpeNo;

    /**
     * 源系统表标识
     */
    @Column(order = 33, comment = "源系统表标识", length = 128, canBeEmpty = true)
    private String sourceTableId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreditProductNo() {
        return creditProductNo;
    }

    public void setCreditProductNo(String creditProductNo) {
        this.creditProductNo = creditProductNo;
    }

    public String getCreditProductId() {
        return creditProductId;
    }

    public void setCreditProductId(String creditProductId) {
        this.creditProductId = creditProductId;
    }

    public String getCreditProductName() {
        return creditProductName;
    }

    public void setCreditProductName(String creditProductName) {
        this.creditProductName = creditProductName;
    }

    public BigDecimal getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        this.creditAmt = creditAmt;
    }

    public BigDecimal getFrozenCreditAmt() {
        return frozenCreditAmt;
    }

    public void setFrozenCreditAmt(BigDecimal frozenCreditAmt) {
        this.frozenCreditAmt = frozenCreditAmt;
    }

    public BigDecimal getUseCreditAmt() {
        return useCreditAmt;
    }

    public void setUseCreditAmt(BigDecimal useCreditAmt) {
        this.useCreditAmt = useCreditAmt;
    }

    public BigDecimal getHisUseCreditAmt() {
        return hisUseCreditAmt;
    }

    public void setHisUseCreditAmt(BigDecimal hisUseCreditAmt) {
        this.hisUseCreditAmt = hisUseCreditAmt;
    }

    public BigDecimal getCloseCreditAmt() {
        return closeCreditAmt;
    }

    public void setCloseCreditAmt(BigDecimal closeCreditAmt) {
        this.closeCreditAmt = closeCreditAmt;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    public String getRecoverCreditType() {
        return recoverCreditType;
    }

    public void setRecoverCreditType(String recoverCreditType) {
        this.recoverCreditType = recoverCreditType;
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

    public String getBusnDealInstn() {
        return busnDealInstn;
    }

    public void setBusnDealInstn(String busnDealInstn) {
        this.busnDealInstn = busnDealInstn;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public String getCbusCustNo() {
        return cbusCustNo;
    }

    public void setCbusCustNo(String cbusCustNo) {
        this.cbusCustNo = cbusCustNo;
    }

    public String getUnitCcy() {
        return unitCcy;
    }

    public void setUnitCcy(String unitCcy) {
        this.unitCcy = unitCcy;
    }

    public String getFirstLimitDt() {
        return firstLimitDt;
    }

    public void setFirstLimitDt(String firstLimitDt) {
        this.firstLimitDt = firstLimitDt;
    }

    public Integer getTenor() {
        return tenor;
    }

    public void setTenor(Integer tenor) {
        this.tenor = tenor;
    }

    public String getDecSheetOpinion() {
        return decSheetOpinion;
    }

    public void setDecSheetOpinion(String decSheetOpinion) {
        this.decSheetOpinion = decSheetOpinion;
    }

    public String getEndAdtr() {
        return endAdtr;
    }

    public void setEndAdtr(String endAdtr) {
        this.endAdtr = endAdtr;
    }

    public BigDecimal getTempAmt() {
        return tempAmt;
    }

    public void setTempAmt(BigDecimal tempAmt) {
        this.tempAmt = tempAmt;
    }

    public String getIfTemp() {
        return ifTemp;
    }

    public void setIfTemp(String ifTemp) {
        this.ifTemp = ifTemp;
    }

    public String getTempAmtBeginDt() {
        return tempAmtBeginDt;
    }

    public void setTempAmtBeginDt(String tempAmtBeginDt) {
        this.tempAmtBeginDt = tempAmtBeginDt;
    }

    public String getTempAmtEndDt() {
        return tempAmtEndDt;
    }

    public void setTempAmtEndDt(String tempAmtEndDt) {
        this.tempAmtEndDt = tempAmtEndDt;
    }

    public String getLimitEmpeNo() {
        return limitEmpeNo;
    }

    public void setLimitEmpeNo(String limitEmpeNo) {
        this.limitEmpeNo = limitEmpeNo;
    }

    public String getSourceTableId() {
        return sourceTableId;
    }

    public void setSourceTableId(String sourceTableId) {
        this.sourceTableId = sourceTableId;
    }
}
