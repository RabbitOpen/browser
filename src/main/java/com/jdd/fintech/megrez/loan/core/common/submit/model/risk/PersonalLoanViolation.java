package com.jdd.fintech.megrez.loan.core.common.submit.model.risk;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 个人贷款违约
 * @author xiaoqianbin
 * @date 2020/4/27
 **/
@Format(split = "$")
public class PersonalLoanViolation {

    /**
     * 客户id
     */
    @Column(order = 0, comment = "客户id", length = 18)
    private String customerID;

    /**
     * 客户名称
     */
    @Column(order = 1, comment = "客户名称", length = 80)
    private String customerName;

    /**
     * 证件类型
     */
    @Column(order = 2, comment = "证件类型", length = 18)
    private String certType = "身份证";

    /**
     * 证件号码
     */
    @Column(order = 3, comment = "证件号码", length = 32)
    private String certID;

    /**
     * 贷款发放行代码
     */
    @Column(order = 4, comment = "贷款发放行代码", length = 30)
    private String branchCode = "行方提供";

    /**
     * 贷款合同号
     */
    @Column(order = 5, comment = "贷款合同号", length = 40)
    private String bcSerialno;

    /**
     * 借据号
     */
    @Column(order = 6, comment = "借据号", length = 40)
    private String bdSerialno;

    /**
     * 业务品种类型， 1-住房贷款，2-商用房贷款，3-公积金贷款，4-汽车贷款，5-助学贷款，6-消费贷款，7-个人经营性贷款，8-农户贷款，9-其他
     */
    @Column(order = 7, comment = "业务品种类型", length = 1)
    private String businessType = "9";

    /**
     * 主要担保方式, 1-保证，2-抵押，3-质押，4-信用
     */
    @Column(order = 8, comment = "主要担保方式", length = 1)
    private String vouchType = "4";

    /**
     * 发放金额
     */
    @Column(order = 9, comment = "发放金额")
    private BigDecimal businessSum;

    /**
     * 贷款余额
     */
    @Column(order = 10, comment = "贷款余额")
    private BigDecimal balance;

    /**
     * 发放日期
     */
    @Column(order = 11, comment = "发放日期", length = 10)
    private String putoutDate;

    /**
     * 实际到期日
     */
    @Column(order = 12, comment = "实际到期日", length = 10)
    private String actualMaturity;

    /**
     * 违约金额
     */
    @Column(order = 13, comment = "违约金额")
    private BigDecimal wyBalance;

    // 逾期利息
    private BigDecimal overdueInterestAmt;

    // 逾期本金
    private BigDecimal overduePrplAmt;

    /**
     * 违约天数
     */
    @Column(order = 14, comment = "违约天数")
    private Integer wyDays;

    /**
     * 五级分类结果
     */
    @Column(order = 15, comment = "五级分类结果", length = 10)
    private String classifyResult;

    /**
     * 还本方式 :1-按月，2-按季，3-按半年，4-按年，5-利随本清，6-分期付息一次还本，7-其他
     */
    @Column(order = 16, comment = "还本方式", length = 1)
    private String corpuspayMethod = "1";

    /**
     * 最近一次还款金额
     */
    @Column(order = 17, comment = "最近一次还款金额")
    private BigDecimal recentlyPaymentMoney;

    /**
     * 最近一次还款日期
     */
    @Column(order = 18, comment = "最近一次还款日期", length = 10)
    @XmlElement(name = "recentlyPaymentDate")
    private String recentlyPaymentDate;

    /**
     * 客户住址
     */
    @Column(order = 19, comment = "客户住址", length = 200)
    private String familyDdd = "-----";

    /**
     * 住址行政区划代码
     */
    @Column(order = 20, comment = "住址行政区划代码", length = 10)
    private String addressAdministrativeCode = "110000";

    /**
     * 客户其他证件类型、客户其他证件号码
     */
    @Column(order = 21, comment = "客户其他证件类型、客户其他证件号码", length = 40)
    private String otherPaperType;

    /**
     * 共同债务人姓名、证件类型、证件号码
     */
    @Column(order = 22, comment = "共同债务人姓名、证件类型、证件号码", length = 40)
    private String otherPaperCode;

    /**
     * 助学贷款专项指标
     */
    @Column(order = 23, comment = "助学贷款专项指标", length = 40)
    private String jointDebtor;

    /**
     * 来源系统
     */
    @Column(order = 24, comment = "来源系统", length = 20)
    private String resourcesys = "JDWD";

    /**
     * 报表日期 yyyy/MM/dd
     */
    @Column(order = 25, comment = "报表日期", length = 10)
    private String reportDate = new SimpleDateFormat("yyyy/MM/dd").format(new Date());

    public String getCustomerID() {
        return "JD" + customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertID() {
        return certID;
    }

    public void setCertID(String certID) {
        this.certID = certID;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBcSerialno() {
        return bcSerialno;
    }

    public void setBcSerialno(String bcSerialno) {
        this.bcSerialno = bcSerialno;
    }

    public String getBdSerialno() {
        return bdSerialno;
    }

    public void setBdSerialno(String bdSerialno) {
        this.bdSerialno = bdSerialno;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getVouchType() {
        return vouchType;
    }

    public void setVouchType(String vouchType) {
        this.vouchType = vouchType;
    }

    public BigDecimal getBusinessSum() {
        return businessSum;
    }

    public void setBusinessSum(BigDecimal businessSum) {
        this.businessSum = businessSum;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPutoutDate() {
        return putoutDate;
    }

    public void setPutoutDate(String putoutDate) {
        this.putoutDate = putoutDate;
    }

    public String getActualMaturity() {
        return actualMaturity;
    }

    public void setActualMaturity(String actualMaturity) {
        this.actualMaturity = actualMaturity;
    }

    public BigDecimal getWyBalance() {
        return overdueInterestAmt.add(overduePrplAmt);
    }

    public void setWyBalance(BigDecimal wyBalance) {
        this.wyBalance = wyBalance;
    }

    public Integer getWyDays() {
        return wyDays;
    }

    public void setWyDays(Integer wyDays) {
        this.wyDays = wyDays;
    }

    public String getClassifyResult() {
        return classifyResult;
    }

    public void setClassifyResult(String classifyResult) {
        this.classifyResult = classifyResult;
    }

    public String getCorpuspayMethod() {
        return corpuspayMethod;
    }

    public void setCorpuspayMethod(String corpuspayMethod) {
        this.corpuspayMethod = corpuspayMethod;
    }

    public BigDecimal getRecentlyPaymentMoney() {
        return recentlyPaymentMoney;
    }

    public void setRecentlyPaymentMoney(BigDecimal recentlyPaymentMoney) {
        this.recentlyPaymentMoney = recentlyPaymentMoney;
    }

    public String getRecentlyPaymentDate() {
        return recentlyPaymentDate;
    }

    public void setRecentlyPaymentDate(String recentlyPaymentDate) {
        this.recentlyPaymentDate = recentlyPaymentDate;
    }

    public String getFamilyDdd() {
        return familyDdd;
    }

    public void setFamilyDdd(String familyDdd) {
        this.familyDdd = familyDdd;
    }

    public String getAddressAdministrativeCode() {
        return addressAdministrativeCode;
    }

    public void setAddressAdministrativeCode(String addressAdministrativeCode) {
        this.addressAdministrativeCode = addressAdministrativeCode;
    }

    public String getOtherPaperType() {
        return otherPaperType;
    }

    public void setOtherPaperType(String otherPaperType) {
        this.otherPaperType = otherPaperType;
    }

    public String getOtherPaperCode() {
        return otherPaperCode;
    }

    public void setOtherPaperCode(String otherPaperCode) {
        this.otherPaperCode = otherPaperCode;
    }

    public String getJointDebtor() {
        return jointDebtor;
    }

    public void setJointDebtor(String jointDebtor) {
        this.jointDebtor = jointDebtor;
    }

    public String getResourcesys() {
        return resourcesys;
    }

    public void setResourcesys(String resourcesys) {
        this.resourcesys = resourcesys;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public BigDecimal getOverdueInterestAmt() {
        return overdueInterestAmt;
    }

    public void setOverdueInterestAmt(BigDecimal overdueInterestAmt) {
        this.overdueInterestAmt = overdueInterestAmt;
    }

    public BigDecimal getOverduePrplAmt() {
        return overduePrplAmt;
    }

    public void setOverduePrplAmt(BigDecimal overduePrplAmt) {
        this.overduePrplAmt = overduePrplAmt;
    }
}
