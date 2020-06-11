package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ASSET_LOAN_SERIAL
 * 放款流水表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetLoanSerial {

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
     * 业务流水
     */
    @Column(order = 2, comment = "业务流水", length = 60, canBeEmpty = false)
    private String serialNo;

    /**
     * 放款时间
     */
    @Column(order = 3, comment = "放款时间", length = 26, canBeEmpty = true)
    private String loanDate;

    /**
     * 借款用户编号
     */
    @Column(order = 4, comment = "借款用户编号", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 用户姓名
     */
    @Column(order = 5, comment = "用户姓名", length = 32, canBeEmpty = true)
    private String userName;

    /**
     * 收款用户
     */
    @Column(order = 6, comment = "收款用户", length = 32, canBeEmpty = true)
    private String receiveUserId;

    /**
     * 商户编号
     */
    @Column(order = 7, comment = "商户编号", length = 32, canBeEmpty = true)
    private String merchantId;

    /**
     * 门店Id
     */
    @Column(order = 8, comment = "门店Id", length = 32, canBeEmpty = true)
    private String shopId;

    /**
     * 合作商编号
     */
    @Column(order = 9, comment = "合作商编号", length = 32, canBeEmpty = true)
    private String partnerUserId;

    /**
     * 放款类型 EnumLineType 1:线上2:线下;
     */
    @Column(order = 10, comment = "放款类型 EnumLineType 1:线上2:线下;", length = 2, canBeEmpty = true)
    private String loanType;

    /**
     * 放款方式  EnumLoanMode 0自主支付1受托支付
     */
    @Column(order = 11, comment = "放款方式  EnumLoanMode 0自主支付1受托支付", length = 2, canBeEmpty = true)
    private String loanMode;

    /**
     * 放款金额
     */
    @Column(order = 12, comment = "放款金额", length = 16, canBeEmpty = true)
    private BigDecimal loanAmt;

    /**
     * 一次性手续费
     */
    @Column(order = 13, comment = "一次性手续费", length = 16, canBeEmpty = true)
    private BigDecimal oneServiceFee;

    /**
     * 合作费
     */
    @Column(order = 14, comment = "合作费", length = 16, canBeEmpty = true)
    private BigDecimal cooperationFee;

    /**
     * 放款状态 EnumLoanSerialStatus 1:放款处理中2:已放款3:失败;
     */
    @Column(order = 15, comment = "放款状态 EnumLoanSerialStatus 1:放款处理中2:已放款3:失败;", length = 2, canBeEmpty = true)
    private String loanStatus;

    /**
     * 结算流水
     */
    @Column(order = 16, comment = "结算流水", length = 60, canBeEmpty = true)
    private String balanceSerialNo;

    /**
     * 结算明细号
     */
    @Column(order = 17, comment = "结算明细号", length = 60, canBeEmpty = true)
    private String balanceDetailNo;

    /**
     * 结算时间
     */
    @Column(order = 18, comment = "结算时间", length = 26, canBeEmpty = true)
    private String balanceDate;

    /**
     * 结算状态 EnumBalanceStatus 0:全部1:结算中2:待结算3:已结算;
     */
    @Column(order = 19, comment = "结算状态 EnumBalanceStatus 0:全部1:结算中2:待结算3:已结算;", length = 2, canBeEmpty = true)
    private String balanceStatus;

    /**
     * 创建时间
     */
    @Column(order = 20, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 21, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 中文拼音简写
     * WLB --微粒贷
     * MYJB --蚂蚁借呗
     * BDXD --百度小贷
     */
    @Column(order = 22, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 核心记账日期
     */
    @Column(order = 23, comment = "核心记账日期", length = 8, canBeEmpty = false)
    private String accountDate;

    /**
     * 该笔业务所属机构，对应的为行方的内部机构号，且要在报送的机构表中存在
     */
    @Column(order = 24, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 贷款分户账号
     */
    @Column(order = 25, comment = "贷款分户账号", length = 50, canBeEmpty = false)
    private String lnAcctNo;

    /**
     * 贷款合同编码
     */
    @Column(order = 26, comment = "信贷合同号", length = 64, canBeEmpty = false)
    private String ctrtNo;

    /**
     * 核心客户编号
     */
    @Column(order = 27, comment = "核心客户编号", length = 20, canBeEmpty = true)
    private String cbusCustNo;

    /**
     * 明细科目编号
     */
    @Column(order = 28, comment = "明细科目编号", length = 8, canBeEmpty = false)
    private String aclgNo;

    /**
     * 账户名称
     */
    @Column(order = 29, comment = "账户名称", length = 120, canBeEmpty = false)
    private String acctName;

    /**
     * 00--贷款发放
     * 10--贷款回收
     * 20--贷款利息处理
     * 21--补记/销记贷款利息
     * 22--补收/退回贷款利息
     * 23--应收利息核销
     * 30--调账
     * 31--隔日错账调整
     * 40--贷款核销/状态调整
     * 41--正常转逾期
     * 42--非应计转正常
     * 43--核销贷款表外销记
     */
    @Column(order = 30, comment = "交易类型", length = 2, canBeEmpty = false)
    private String txType;

    /**
     * C-贷，D-借
     */
    @Column(order = 31, comment = "交易借贷标志", length = 1, canBeEmpty = false)
    private String txDrCrFlg;

    /**
     * 账户余额
     */
    @Column(order = 32, comment = "账户余额", length = 20, canBeEmpty = false)
    private BigDecimal acctBalAmt;

    /**
     * 对方账号
     */
    @Column(order = 33, comment = "对方账号", length = 60, canBeEmpty = false)
    private String oppoAcctNo;

    /**
     * 对方户名
     */
    @Column(order = 34, comment = "对方户名", length = 120, canBeEmpty = false)
    private String oppoAcctNamt;

    /**
     * 默认放产品名称
     */
    @Column(order = 35, comment = "对方行号", length = 12, canBeEmpty = false)
    private String oppoAcctBankNo;

    /**
     * 默认放产品名称
     */
    @Column(order = 36, comment = "对方行名", length = 120, canBeEmpty = false)
    private String oppoAcctBankName;

    /**
     * （默认22）
     * 00 其他
     * 01 柜面
     * 02 网上银行
     * 03 手机银行
     * 04 电话银行
     * 05 短信
     * 06 ATM
     * 07 POS（银联）
     * 08 中间业务平台
     * 09 信贷管理系统
     * 10 农民工卡
     * 11 统一支付平台系统
     * 12 银联无卡支付
     * 13 同城交换系统
     * 14 人民银行
     * 15 统一支付平台系统
     * 16 烟台行查询机
     * 17 期货
     * 18 税库银TIPS
     * 19 网银互联
     * 20 POSP（行内）
     * 21 IC终端
     * 22 互联网
     * 23 银联
     * 24 助农取款
     * 25 基金代销
     * 26 理财平台
     * 27 财务系统
     * 28 XBUS（外联业务系统）
     * 29 银联数据
     * 30 自助设备（自助终端）
     * 31 IC卡行业应用
     * 32 多应用平台
     * 33 微信银行
     * 34 网络支付清算平台系统
     * 35 头寸渠道
     * 36 现金柜员循环机系统
     * 37 现金管理渠道
     * 38 集中作业平台
     * 39 移动展业
     * 40 行内汇划
     * 41 电视银行
     * 42 POS商户管理系统
     * 43 多媒体终端
     * 44 国际结算系统
     * 45 国库集中支付
     * 46 法院查控系统平台
     * 47 FTP系统
     * 48 空中营业厅
     * 49 直销银行
     * 50 助农终端
     * 51 超级柜台
     * 52 统一支付
     * 53 国家移动金融安全公共服务平台
     * 54 增值税管理平台
     * 60 供应链金融
     * 61 电票系统
     * 62 国土资源系统
     * 63 银行自动柜员系统
     * 64 一卡通系统
     * 65 银医渠道
     * 66 网贷平台
     * 67 金融服务平台
     * 68 理财资产管理系统
     * 69 总账管理系统
     * 70 云商平台
     * 71 互联网第三方服务
     * 72 产品装配平台
     * 95 CC批量
     * 96 非柜面
     * 99 通用
     * A2 7122交易占用
     */
    @Column(order = 37, comment = "交易渠道", length = 2, canBeEmpty = false)
    private String txChnl;

    /**
     * 《表示货币和资金的代码类》(GBT 12406-2008)
     */
    @Column(order = 38, comment = "币种", length = 3, canBeEmpty = false)
    private String txCcy;

    /**
     * 交易柜员号
     */
    @Column(order = 39, comment = "交易柜员号", length = 12, canBeEmpty = false)
    private String txTlrNo;

    /**
     * 授权柜员号
     */
    @Column(order = 40, comment = "授权柜员号", length = 12, canBeEmpty = false)
    private String authrTlrNo;

    /**
     * 1 现金
     * 2 转账
     */
    @Column(order = 41, comment = "现转标志", length = 1, canBeEmpty = false)
    private String cashOrTransFlg;

    /**
     * D01 -正常发放 金融机构正常发放贷款业务。
     * D0101- 借新还旧 贷款到期（含展期后到期）后不能按时以货币资金形式收回，又重新发放贷款用于归还部分或全部原贷款。
     * D0199 -其他 正常发放的非借新还旧贷款。
     * D02 -不同法人机构间贷款转入 金融机构从其他法人机构转入贷款。
     * D03 -同一法人机构内贷款转入 金融机构从系统内的其他机构转入贷款，包括因内部机构撤并、分设等因素导致的贷款增加。
     * D99 -其他 除贷款正常发放、不同法人机构间贷款转入、同一法人机构内贷款转入等因素外，其他引起贷款原值增加的因素。
     */
    @Column(order = 42, comment = "贷款发放类别", length = 5, canBeEmpty = false)
    private String lnBusTyp;

    /**
     * E01-正常收回 贷款按照合同约定正常收回。
     * E02-核销 指金融机构处置贷款时，以贷款减值准备等冲销贷款本金。包括税前和税后列支的全部核销贷款。
     * E03-资产证券化贷款转出 金融机构将贷款打包转让给特定目的载体（SPV），构建资产池发行市场流通的标准化债券。
     * E04-不同法人机构间贷款转出 金融机构将向借款人已发放的贷款所形成的债权转让给受让方的交易行为，不包括金融机构将贷款资产转移给特定目的载体（SPV）开展资产证券化。
     * E0401-向金融资产管理公司转出 指金融机构将不良贷款列入坏账并转由金融资产管理公司进行资产处置的行为。
     * E0499-向其他法人机构转出 金融机构向金融资产管理公司以外的其他法人机构转出贷款。
     * E05-同一法人机构内贷款转出 金融机构系统内贷款的协议转让、为贷款核销进行的系统内划转以及因内部机构撤并、分设等因素导致的贷款减少。
     * E06-政策性置换 指地方政府债券等置换金融机构（资产负债表内）贷款，不包括置换委托贷款、信托贷款等表外融资业务。
     * E07-以物抵债 金融机构在借款人不能依约归还贷款时，以借款人、担保人的抵押物、质押物、股权资产及其他资产抵偿未清偿贷款。
     * E08-重组 指借款人财务状况困难，无法遵守借款合同规定的时间表还款，逾期超过信贷管理政策规定的一定时间，还款情况已不正常，金融机构不得不对合同规定的还款条件进行修订，对借款人作出贷款减让安排。
     * E09-债转股 金融机构通过向债转股实施机构转让，由实施机构转变为对借款企业股权的贷款。
     * E99-其他 指除正常收回、核销、资产证券化转出、不同法人机构间贷款转出、同一法人机构内贷款转出、政策性置换、以物抵债、重组、债转股外，其他引起贷款原值减少的因素。
     */
    @Column(order = 43, comment = "贷款收回类别", length = 5, canBeEmpty = false)
    private String lnRecTyp;

    /**
     * 1 正常
     * 2 冲账
     * 3 补账
     * 4 抹账
     */
    @Column(order = 44, comment = "冲补抹标志", length = 1, canBeEmpty = false)
    private String beCorrctAmenRecdFlag;

    /**
     * 默认为产品名称
     */
    @Column(order = 45, comment = "交易码", length = 12, canBeEmpty = true)
    private String txCode;

    /**
     * 默认为产品名称
     */
    @Column(order = 46, comment = "交易描述", length = 200, canBeEmpty = true)
    private String txDesc;

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

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPartnerUserId() {
        return partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanMode() {
        return loanMode;
    }

    public void setLoanMode(String loanMode) {
        this.loanMode = loanMode;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public BigDecimal getOneServiceFee() {
        return oneServiceFee;
    }

    public void setOneServiceFee(BigDecimal oneServiceFee) {
        this.oneServiceFee = oneServiceFee;
    }

    public BigDecimal getCooperationFee() {
        return cooperationFee;
    }

    public void setCooperationFee(BigDecimal cooperationFee) {
        this.cooperationFee = cooperationFee;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getBalanceSerialNo() {
        return balanceSerialNo;
    }

    public void setBalanceSerialNo(String balanceSerialNo) {
        this.balanceSerialNo = balanceSerialNo;
    }

    public String getBalanceDetailNo() {
        return balanceDetailNo;
    }

    public void setBalanceDetailNo(String balanceDetailNo) {
        this.balanceDetailNo = balanceDetailNo;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(String balanceStatus) {
        this.balanceStatus = balanceStatus;
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

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getBusnDealInstn() {
        return busnDealInstn;
    }

    public void setBusnDealInstn(String busnDealInstn) {
        this.busnDealInstn = busnDealInstn;
    }

    public String getLnAcctNo() {
        return lnAcctNo;
    }

    public void setLnAcctNo(String lnAcctNo) {
        this.lnAcctNo = lnAcctNo;
    }

    public String getCtrtNo() {
        return ctrtNo;
    }

    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }

    public String getCbusCustNo() {
        return cbusCustNo;
    }

    public void setCbusCustNo(String cbusCustNo) {
        this.cbusCustNo = cbusCustNo;
    }

    public String getAclgNo() {
        return aclgNo;
    }

    public void setAclgNo(String aclgNo) {
        this.aclgNo = aclgNo;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public String getTxDrCrFlg() {
        return txDrCrFlg;
    }

    public void setTxDrCrFlg(String txDrCrFlg) {
        this.txDrCrFlg = txDrCrFlg;
    }

    public BigDecimal getAcctBalAmt() {
        return acctBalAmt;
    }

    public void setAcctBalAmt(BigDecimal acctBalAmt) {
        this.acctBalAmt = acctBalAmt;
    }

    public String getOppoAcctNo() {
        return oppoAcctNo;
    }

    public void setOppoAcctNo(String oppoAcctNo) {
        this.oppoAcctNo = oppoAcctNo;
    }

    public String getOppoAcctNamt() {
        return oppoAcctNamt;
    }

    public void setOppoAcctNamt(String oppoAcctNamt) {
        this.oppoAcctNamt = oppoAcctNamt;
    }

    public String getOppoAcctBankNo() {
        return oppoAcctBankNo;
    }

    public void setOppoAcctBankNo(String oppoAcctBankNo) {
        this.oppoAcctBankNo = oppoAcctBankNo;
    }

    public String getOppoAcctBankName() {
        return oppoAcctBankName;
    }

    public void setOppoAcctBankName(String oppoAcctBankName) {
        this.oppoAcctBankName = oppoAcctBankName;
    }

    public String getTxChnl() {
        return txChnl;
    }

    public void setTxChnl(String txChnl) {
        this.txChnl = txChnl;
    }

    public String getTxCcy() {
        return txCcy;
    }

    public void setTxCcy(String txCcy) {
        this.txCcy = txCcy;
    }

    public String getTxTlrNo() {
        return txTlrNo;
    }

    public void setTxTlrNo(String txTlrNo) {
        this.txTlrNo = txTlrNo;
    }

    public String getAuthrTlrNo() {
        return authrTlrNo;
    }

    public void setAuthrTlrNo(String authrTlrNo) {
        this.authrTlrNo = authrTlrNo;
    }

    public String getCashOrTransFlg() {
        return cashOrTransFlg;
    }

    public void setCashOrTransFlg(String cashOrTransFlg) {
        this.cashOrTransFlg = cashOrTransFlg;
    }

    public String getLnBusTyp() {
        return lnBusTyp;
    }

    public void setLnBusTyp(String lnBusTyp) {
        this.lnBusTyp = lnBusTyp;
    }

    public String getLnRecTyp() {
        return lnRecTyp;
    }

    public void setLnRecTyp(String lnRecTyp) {
        this.lnRecTyp = lnRecTyp;
    }

    public String getBeCorrctAmenRecdFlag() {
        return beCorrctAmenRecdFlag;
    }

    public void setBeCorrctAmenRecdFlag(String beCorrctAmenRecdFlag) {
        this.beCorrctAmenRecdFlag = beCorrctAmenRecdFlag;
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode;
    }

    public String getTxDesc() {
        return txDesc;
    }

    public void setTxDesc(String txDesc) {
        this.txDesc = txDesc;
    }
}
