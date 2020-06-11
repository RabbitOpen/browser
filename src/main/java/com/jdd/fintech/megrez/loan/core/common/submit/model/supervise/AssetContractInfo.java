package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * 资产合同表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetContractInfo {

    /**
     * 联盟定义的用于我们系统区分的成员行号
     */
    @Column(order = 0, comment = "租户号", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 合同号
     */
    @Column(order = 1, comment = "合同号", length = 32, canBeEmpty = false)
    private String contractId;

    /**
     * 客户统一编号
     */
    @Column(order = 2, comment = "用户编号", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 优惠编号
     */
    @Column(order = 3, comment = "优惠编号", length = 32, canBeEmpty = true)
    private String discountRuleId;

    /**
     * 放款用户编号
     */
    @Column(order = 4, comment = "放款用户编号", length = 32, canBeEmpty = true)
    private String loanUserId;

    /**
     * 还款用户
     */
    @Column(order = 5, comment = "还款用户", length = 32, canBeEmpty = true)
    private String repayUserId;

    /**
     * 借款用户
     */
    @Column(order = 6, comment = "借款用户", length = 32, canBeEmpty = true)
    private String borrowUserId;

    /**
     * 收款用户
     */
    @Column(order = 7, comment = "收款用户", length = 32, canBeEmpty = true)
    private String receiveUserId;

    /**
     * 证件类型
     */
    @Column(order = 8, comment = "证件类型", length = 2, canBeEmpty = false)
    private String idKind;

    /**
     * 证件编号
     */
    @Column(order = 9, comment = "证件编号", length = 32, canBeEmpty = true)
    private String idNo;

    /**
     * 客户名称
     */
    @Column(order = 10, comment = "客户名称", length = 32, canBeEmpty = false)
    private String customerName;

    /**
     * 签约时间
     */
    @Column(order = 11, comment = "签约时间", length = 26, canBeEmpty = true)
    private String signContractTime;

    /**
     * 生效时间
     */
    @Column(order = 12, comment = "生效时间", length = 26, canBeEmpty = true)
    private String validateTime;

    /**
     * 创建时间
     */
    @Column(order = 13, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 14, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 主合同号：
     * 此项填写信贷合同对应的主合同合同号，如果此项为空则此信贷合同为主合同。
     */
    @Column(order = 15, comment = "主合同号", length = 32, canBeEmpty = true)
    private String mainCtrtNo;

    /**
     * 核心客户编号
     */
    @Column(order = 16, comment = "核心客户编号", length = 32, canBeEmpty = true)
    private String cbusCustNo;

    /**
     * 银行内部机构号。应具有标识机构的唯一性。
     */
    @Column(order = 17, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 遵循《GB/T 12406-2008 表示货币和资金的代码》的字母代码，如CNY。
     */
    @Column(order = 18, comment = "币种", length = 3, canBeEmpty = false)
    private String ccy;

    /**
     * 合同金额
     */
    @Column(order = 19, comment = "合同金额", length = 20, canBeEmpty = false)
    private BigDecimal ctrtAmt;

    /**
     * 贷款总期数
     */
    @Column(order = 20, comment = "期限月", length = 4, canBeEmpty = false)
    private Integer trmMon;

    /**
     * 合同约定日期
     */
    @Column(order = 21, comment = "合同开始日期", length = 8, canBeEmpty = false)
    private String ctrtBeginDt;

    /**
     * 合同到期日期
     */
    @Column(order = 22, comment = "合同结束日期", length = 8, canBeEmpty = false)
    private String ctrtEndDt;

    /**
     * 合同签订日期
     */
    @Column(order = 23, comment = "合同签订日期", length = 8, canBeEmpty = true)
    private String ctrtSignDt;

    /**
     * 还清日期,销户日期
     */
    @Column(order = 24, comment = "终结日期", length = 8, canBeEmpty = true)
    private String cacctDt;

    /**
     * 逾期日期
     */
    @Column(order = 25, comment = "逾期日期", length = 8, canBeEmpty = true)
    private String delayDt;

    /**
     * 01 正常
     * 02 关注
     * 03 次级
     * 04 可疑
     * 05 损失
     */
    @Column(order = 26, comment = "贷款五级分类", length = 2, canBeEmpty = false)
    private String lnFivTyp;

    /**
     * 01 期初付息(手续费),到期还本
     * 02 期末本息一次付清
     * 03 按固定周期付息,到期还本
     * 04 按固定周期付息,按分期还款计划表还本
     * 05 本息按月均还
     * 06 等额本息还款法（对公）
     * 07 等额本金法（对公）
     * 09 等比递增
     * 10 等比递减
     * 11 等额递增
     * 12 等额递减
     * 13 等额本息还款法
     * 14 等额本金法
     * 15 等额分期
     */
    @Column(order = 27, comment = "还款方式", length = 2, canBeEmpty = false)
    private String rfnSty;

    /**
     * 0 按日计息
     * 1 按月计息
     * 2 按季计息
     * 3 按半年计息
     * 4 按年计息
     * 5 不固定
     */
    @Column(order = 28, comment = "计息周期", length = 1, canBeEmpty = false)
    private String intcCycle;

    /**
     * （默认F0219）
     * F01  再贷款
     * F02  普通贷款
     * F021  消费贷款
     * F0211  个人住房贷款
     * F0212  个人汽车消费贷款
     * F0213  助学贷款
     * F02131  国家助学贷款
     * F02132  一般商业性助学贷款
     * F0219  其他消费贷款
     * F022  经营贷款
     * F023  固定资产贷款
     * F03  拆借
     * F04  透支
     * F041  账户透支
     * F042  贷记卡透支
     * F043  准贷记卡透支
     * F05  垫款
     * F051  承兑垫款
     * F052  担保垫款
     * F053  信用证垫款
     * F059  其他垫款
     * F06  回购/返售
     * F061  债券回购/返售
     * F062  票据回购/返售
     * F063  贷款回购/返售
     * F064  股票及其他股权回购/返售
     * F065  黄金回购/返售
     * F069  其他资产回购/返售
     * F07  黄金、证券借贷
     * F071  债券借贷
     * F072  票据借贷
     * F073  股票及其他股权借贷
     * F074  黄金借贷
     * F079  其他资产借贷
     * F08  贸易融资
     * F081  国际贸易融资
     * F082  国内贸易融资
     * F09  融资租赁
     * F10  打包信贷受让资产
     * F11  转贷款
     * F12  并购贷款
     * F99  其它贷款
     */
    @Column(order = 29, comment = "信贷产品类别", length = 6, canBeEmpty = false)
    private String lnBizCase;

    /**
     * RF01 固定利率
     * RF02 浮动利率
     * RF021 浮动比利率
     * RF022 浮动点利率
     */
    @Column(order = 30, comment = "利率类型", length = 5, canBeEmpty = false)
    private String intrType;

    /**
     * 单位为百分比，默认值一年期基准利率（4.35）
     */
    @Column(order = 31, comment = "基准利率", length = 11, canBeEmpty = false)
    private BigDecimal baseIntr;

    /**
     * 利率浮动
     */
    @Column(order = 32, comment = "利率浮动", length = 10, canBeEmpty = false)
    private BigDecimal intrFlt;

    /**
     * 年利率。单位为百分比
     */
    @Column(order = 33, comment = "执行利率", length = 24, canBeEmpty = false)
    private BigDecimal intRate;

    /**
     * 主要担保方式：（默认01）
     * 质押（含保证金），抵押，保证，信用，其他。
     * 01 信用
     * 02 保证
     * 021 单人保证
     * 022 多人保证
     * 023 多人联保
     * 024 多人分保
     * 03 抵押
     * 04 质押
     * 05 组合担保
     * 99 其他
     */
    @Column(order = 34, comment = "担保方式", length = 3, canBeEmpty = false)
    private String guarWay;

    /**
     * 客户经理工号
     */
    @Column(order = 35, comment = "客户经理工号", length = 12, canBeEmpty = false)
    private String custMgNo;

    /**
     * GB/T 4754-2017国民经济行业分类（默认：其他）
     */
    @Column(order = 36, comment = "贷款投向行业", length = 5, canBeEmpty = true)
    private String lnOccCode;

    /**
     * 1-是，2-否。（默认2）
     */
    @Column(order = 37, comment = "工业转型升级标识", length = 1, canBeEmpty = false)
    private String industryFlag;

    /**
     * 1-鼓励，2-限制，3-淘汰（默认1）
     */
    @Column(order = 38, comment = "产业结构调整类型", length = 1, canBeEmpty = false)
    private String industryType;

    /**
     * (默认09)
     * 01-节能环保，
     * 02-新一代信息技术，
     * 03-生物医药，
     * 04-高端装备制造，
     * 05-新能源，
     * 06-新材料，
     * 07-新能源汽车
     * 08-数字创意
     * 09-相关服务业
     */
    @Column(order = 39, comment = "战略新兴产业类型", length = 2, canBeEmpty = false)
    private String tacticType;

    /**
     * 1-是，2-否.（默认2）
     */
    @Column(order = 40, comment = "是否国家限制行业", length = 1, canBeEmpty = false)
    private String isContryFbIndy;

    /**
     * 贷款新规种类（默认10）
     * 按三办法一指引分类，个贷，固贷和流贷。
     * 10 -个贷
     * 20 -固贷
     * 30 -流贷
     */
    @Column(order = 41, comment = "贷款新规种类", length = 2, canBeEmpty = false)
    private String lnXgType;

    /**
     * 单位天
     */
    @Column(order = 42, comment = "贷款期限", length = 5, canBeEmpty = false)
    private String lnTrm;

    /**
     * 放款方式（默认10）
     * 10 -自主支付
     * 20 -受托支付
     * 30 -混合支付
     */
    @Column(order = 43, comment = "支付方式/放款方式", length = 2, canBeEmpty = false)
    private String payWayCd;

    /**
     * （默认01）
     * 01 自营
     * 02 委托
     * 03 转贷款
     * 04 其他
     */
    @Column(order = 44, comment = "资金来源", length = 2, canBeEmpty = false)
    private String fundSource;

    /**
     * 个人贷款用途（默认9902）
     * 0100 房屋
     * 0101 购买自住用房
     * 0102 购买商用房
     * 0103 自住用房装修
     * 0104 商用房装修
     * 0105 购家私电器
     * 0200 汽车
     * 0201 购车
     * 0202 购车牌
     * 0203 购车位
     * 0300 助学
     * 0301 助学-部属院校
     * 0302 助学-省属及省属以下院校
     * 0303 助学-生源地助学
     * 0304 助学-其他形式助学
     * 0400 个人经营
     * 0401 生产经营所需的周转资金
     * 0402 购置或更新经营设备
     * 0403 支付租赁经营场所资金
     * 0500 子女教育
     * 0600 出国留学
     * 0700 旅游
     * 9900 其他用途
     * 9901 其它经营性用途
     * 9902 其它消费性用途
     * --对公贷款用途
     * 010000 单位普通贷款
     * 010100 经营贷款
     * 010200 固定资产贷款
     * 020000 普通并购贷款
     * 030000 银团贷款
     * 030100 经营贷款
     * 030200 固定资产贷款
     * 030300 用于并购的银团贷款
     * 030400 用于贸易融资的银团贷款
     * 040000 贸易融资
     * 040100 买方信贷
     * 040200 卖方信贷
     * 040300 进出口押汇
     * 050000 境外筹资转贷款
     * 050100 经营贷款
     * 050200 固定资产贷款
     * 050300 用于并购的转贷款
     * 050400 用于贸易融资的转贷款
     * 060000 对非居民贷款
     * 060100 非金融国际组织
     * 060200 国际金融组织
     * 060300 政府
     * 060400 金融机构
     * 060401 中央银行
     * 060402 银行业金融机构
     * 060403 非银行业金融机构
     */
    @Column(order = 45, comment = "贷款用途", length = 6, canBeEmpty = false)
    private String loanPurp;

    /**
     * 境内地区参照《GB/T 2260 中华人民共和国行政区划代码》填写国内行政区划代码；
     * 境外地区参照《GB/T 2659-2000 世界各国和地区名称》填写国名或地区名称。
     */
    @Column(order = 46, comment = "贷款投向地区", length = 6, canBeEmpty = true)
    private String lnInvestArea;

    /**
     * 1-牵头行，2-参与行。
     */
    @Column(order = 47, comment = "银团贷款标识", length = 1, canBeEmpty = true)
    private String syndicLnAtion;

    /**
     * 银团编号
     */
    @Column(order = 48, comment = "银团编号", length = 20, canBeEmpty = true)
    private String syndicLnCd;

    /**
     * 银行出资比例
     */
    @Column(order = 49, comment = "银行出资比例", length = 5, canBeEmpty = true)
    private BigDecimal bankProportion;

    /**
     * 1--正常
     * 2--注销
     */
    @Column(order = 50, comment = "贷款状态", length = 1, canBeEmpty = false)
    private String lnSts;

    /**
     * 备注1
     */
    @Column(order = 51, comment = "备注1", length = 20, canBeEmpty = true)
    private String lnRmrk1;

    /**
     * 备注2
     */
    @Column(order = 52, comment = "备注2", length = 20, canBeEmpty = true)
    private String lnRmrk2;

    /**
     * 备注3
     */
    @Column(order = 53, comment = "备注3", length = 20, canBeEmpty = true)
    private String lnRmrk3;

    /**
     * 备注4
     */
    @Column(order = 54, comment = "备注4", length = 20, canBeEmpty = true)
    private String lnRmrk4;

    /**
     * 备注5
     */
    @Column(order = 55, comment = "备注5", length = 20, canBeEmpty = true)
    private String lnRmrk5;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 56, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 使用基准利率：L1-短期贷款6月;L2-短期贷款6至12月;L3-中长期贷款12至36月;L4-中长期贷款36至60月;L5-中长期贷款60月以上
     * 使用LPR利率：BB-1到5年期（包含一年以内，包含5年)；BF-5年期以上
     * 既不参考基准利率也不参考人行LPR利率，给空值
     */
    @Column(order = 57, comment = "利率类别", length = 2, canBeEmpty = false)
    private String lnIntrTypCd;

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

    public String getMainCtrtNo() {
        return mainCtrtNo;
    }

    public void setMainCtrtNo(String mainCtrtNo) {
        this.mainCtrtNo = mainCtrtNo;
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

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
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

    public String getDelayDt() {
        return delayDt;
    }

    public void setDelayDt(String delayDt) {
        this.delayDt = delayDt;
    }

    public String getLnFivTyp() {
        return lnFivTyp;
    }

    public void setLnFivTyp(String lnFivTyp) {
        this.lnFivTyp = lnFivTyp;
    }

    public String getRfnSty() {
        return rfnSty;
    }

    public void setRfnSty(String rfnSty) {
        this.rfnSty = rfnSty;
    }

    public String getIntcCycle() {
        return intcCycle;
    }

    public void setIntcCycle(String intcCycle) {
        this.intcCycle = intcCycle;
    }

    public String getLnBizCase() {
        return lnBizCase;
    }

    public void setLnBizCase(String lnBizCase) {
        this.lnBizCase = lnBizCase;
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

    public String getCustMgNo() {
        return custMgNo;
    }

    public void setCustMgNo(String custMgNo) {
        this.custMgNo = custMgNo;
    }

    public String getLnOccCode() {
        return lnOccCode;
    }

    public void setLnOccCode(String lnOccCode) {
        this.lnOccCode = lnOccCode;
    }

    public String getIndustryFlag() {
        return industryFlag;
    }

    public void setIndustryFlag(String industryFlag) {
        this.industryFlag = industryFlag;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getTacticType() {
        return tacticType;
    }

    public void setTacticType(String tacticType) {
        this.tacticType = tacticType;
    }

    public String getIsContryFbIndy() {
        return isContryFbIndy;
    }

    public void setIsContryFbIndy(String isContryFbIndy) {
        this.isContryFbIndy = isContryFbIndy;
    }

    public String getLnXgType() {
        return lnXgType;
    }

    public void setLnXgType(String lnXgType) {
        this.lnXgType = lnXgType;
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

    public String getFundSource() {
        return fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
    }

    public String getLoanPurp() {
        return loanPurp;
    }

    public void setLoanPurp(String loanPurp) {
        this.loanPurp = loanPurp;
    }

    public String getLnInvestArea() {
        return lnInvestArea;
    }

    public void setLnInvestArea(String lnInvestArea) {
        this.lnInvestArea = lnInvestArea;
    }

    public String getSyndicLnAtion() {
        return syndicLnAtion;
    }

    public void setSyndicLnAtion(String syndicLnAtion) {
        this.syndicLnAtion = syndicLnAtion;
    }

    public String getSyndicLnCd() {
        return syndicLnCd;
    }

    public void setSyndicLnCd(String syndicLnCd) {
        this.syndicLnCd = syndicLnCd;
    }

    public BigDecimal getBankProportion() {
        return bankProportion;
    }

    public void setBankProportion(BigDecimal bankProportion) {
        this.bankProportion = bankProportion;
    }

    public String getLnSts() {
        return lnSts;
    }

    public void setLnSts(String lnSts) {
        this.lnSts = lnSts;
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

    public String getLnIntrTypCd() {
        return lnIntrTypCd;
    }

    public void setLnIntrTypCd(String lnIntrTypCd) {
        this.lnIntrTypCd = lnIntrTypCd;
    }
}
