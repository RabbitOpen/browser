package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * ICCS_ASSET_LOAN_INVOICE_INFO
 * 借据信息表
 *
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class AssetLoanInvoiceInfo {

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
     * 授信id
     */
    @Column(order = 2, comment = "授信id", length = 32, canBeEmpty = true)
    private String creditId;

    /**
     * 产品编号
     */
    @Column(order = 3, comment = "产品编号", length = 32, canBeEmpty = true)
    private String productId;

    /**
     * 产品名称
     */
    @Column(order = 4, comment = "产品名称", length = 32, canBeEmpty = false)
    private String productName;

    /**
     * 产品主键
     */
    @Column(order = 5, comment = "产品主键", length = 32, canBeEmpty = true)
    private String productNo;

    /**
     * 商品类型
     */
    @Column(order = 6, comment = "商品类型", length = 32, canBeEmpty = true)
    private String productType;

    /**
     * 借款码
     */
    @Column(order = 7, comment = "借款码", length = 255, canBeEmpty = true)
    private String loanCode;

    /**
     * 合同号
     */
    @Column(order = 8, comment = "合同号", length = 32, canBeEmpty = false)
    private String contractId;

    /**
     * 托管类型 1-非托管 2-托管
     */
    @Column(order = 9, comment = "托管类型", length = 2, canBeEmpty = true)
    private String manageType;

    /**
     * 借款人编号
     */
    @Column(order = 10, comment = "借款人编号", length = 32, canBeEmpty = true)
    private String borrowerId;

    /**
     * 借款人类型 EnumUserType
     */
    @Column(order = 11, comment = "借款人类型", length = 3, canBeEmpty = true)
    private String borrowerType;

    /**
     * 商户号区分不同的产品
     */
    @Column(order = 12, comment = "商户号", length = 32, canBeEmpty = true)
    private String merchantId;

    /**
     * 门店Id
     */
    @Column(order = 13, comment = "门店Id", length = 32, canBeEmpty = true)
    private String shopId;

    /**
     * 合作方用户编号
     */
    @Column(order = 14, comment = "合作方用户编号", length = 32, canBeEmpty = true)
    private String partnerUserId;

    /**
     * 合作方费用
     */
    @Column(order = 15, comment = "合作方费用", length = 16, canBeEmpty = true)
    private BigDecimal partnerFee;

    /**
     * 剩余本金
     */
    @Column(order = 16, comment = "剩余本金", length = 16, canBeEmpty = true)
    private BigDecimal leftPrinciple;

    /**
     * 处理中的本金
     */
    @Column(order = 17, comment = "处理中的本金", length = 16, canBeEmpty = true)
    private BigDecimal inhandlePrinciple;

    /**
     * 支用金额
     */
    @Column(order = 18, comment = "支用金额", length = 16, canBeEmpty = true)
    private BigDecimal loanAmt;

    /**
     * 借据状态
     * '0','开户未放款'
     * '1','正常'
     * '2','逾期'
     * '3','非应计'
     * '5','结清'
     * '6','部分逾期'
     * '9','其他'
     */
    @Column(order = 19, comment = "借据状态", length = 2, canBeEmpty = true)
    private String loanInvoiceStatus;

    /**
     * 提前到期状态 0，null -否 1-是
     */
    @Column(order = 20, comment = "提前到期状态", length = 2, canBeEmpty = true)
    private String advanceStatus;

    /**
     * 是否支持代扣 EnumBool 0:否1：是
     */
    @Column(order = 21, comment = "是否支持代扣", length = 2, canBeEmpty = true)
    private String withholdType;

    /**
     * 代扣签约时间
     */
    @Column(order = 22, comment = "代扣签约时间", length = 26, canBeEmpty = true)
    private String withholdSignDate;

    /**
     * 代扣账号
     */
    @Column(order = 23, comment = "代扣账号", length = 32, canBeEmpty = true)
    private String withholdAccount;

    /**
     * 代扣用户姓名
     */
    @Column(order = 24, comment = "代扣用户姓名", length = 32, canBeEmpty = true)
    private String withholdUserName;

    /**
     * 代扣用户编号
     */
    @Column(order = 25, comment = "代扣用户编号", length = 32, canBeEmpty = true)
    private String withholdUserId;

    /**
     * 代扣账号类型
     */
    @Column(order = 26, comment = "代扣账号类型", length = 5, canBeEmpty = true)
    private String withholdAccountKind;

    /**
     * 证件类型
     */
    @Column(order = 27, comment = "手机号", length = 32, canBeEmpty = true)
    private String withholdMobileTel;

    /**
     * 证件号
     */
    @Column(order = 28, comment = "证件号", length = 32, canBeEmpty = true)
    private String withholdCertificateId;

    /**
     * 证件类型
     */
    @Column(order = 29, comment = "证件类型", length = 4, canBeEmpty = false)
    private String withholdCertificateKind;

    /**
     * 总期次
     */
    @Column(order = 30, comment = "总期次", length = 11, canBeEmpty = true)
    private BigDecimal repayNum;

    /**
     * 初始利率
     */
    @Column(order = 31, comment = "初始利率", length = 11, canBeEmpty = true)
    private BigDecimal initRate;

    /**
     * 执行利率
     */
    @Column(order = 32, comment = "执行利率", length = 11, canBeEmpty = false)
    private BigDecimal executeRate;

    /**
     * 起息日
     */
    @Column(order = 33, comment = "起息日", length = 26, canBeEmpty = true)
    private String beginProfitDate;

    /**
     * 结清日在放款之后是不会变的，例如申请一年期的20190101-20200101,结清日是20200101。到那时客户在20190601提前还款了,这个真正结清日就是20190601
     */
    @Column(order = 34, comment = "结清日", length = 26, canBeEmpty = true)
    private String settleDate;

    /**
     * 真正结清日
     */
    @Column(order = 35, comment = "真正结清日", length = 26, canBeEmpty = true)
    private String realSettleDate;

    /**
     * 核销状态 EnumVerificationStatus 0-正常 1-核销
     */
    @Column(order = 36, comment = "核销状态", length = 2, canBeEmpty = true)
    private String verificationStatus;

    /**
     * 核销时间
     */
    @Column(order = 37, comment = "核销时间", length = 26, canBeEmpty = true)
    private String verificationDate;

    /**
     * 期限
     */
    @Column(order = 38, comment = "期限", length = 11, canBeEmpty = true)
    private BigDecimal profitPeriod;

    /**
     * 优惠编号
     */
    @Column(order = 39, comment = "优惠编号", length = 32, canBeEmpty = true)
    private String discountRuleId;

    /**
     * 费用规则编号
     */
    @Column(order = 40, comment = "费用规则编号", length = 32, canBeEmpty = true)
    private String feeRuleId;

    /**
     * 是否支持代扣 EnumGuaranteeMode 1:信用2:抵押3:质押4:保证5:担保
     */
    @Column(order = 41, comment = "是否支持代扣 EnumGuaranteeMode 1:信用2:抵押3:质押4:保证5:担保", length = 32, canBeEmpty = true)
    private String guaranteeMode;

    /**
     * 放款流水
     */
    @Column(order = 42, comment = "放款流水", length = 255, canBeEmpty = true)
    private String loanSerialNo;

    /**
     * 摘要
     */
    @Column(order = 43, comment = "摘要", length = 255, canBeEmpty = true)
    private String summary;

    /**
     * 机构号
     */
    @Column(order = 44, comment = "机构号", length = 32, canBeEmpty = true)
    private String fundOrg;

    /**
     * EnumLoanPayMode支付方式
     */
    @Column(order = 45, comment = "EnumLoanPayMode支付方式", length = 2, canBeEmpty = true)
    private String payMode;

    /**
     * 渠道编号
     */
    @Column(order = 46, comment = "渠道编号", length = 32, canBeEmpty = true)
    private String channelNo;

    /**
     * 创建时间
     */
    @Column(order = 47, comment = "创建时间", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 更新时间
     */
    @Column(order = 48, comment = "更新时间", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 核心记账日期
     */
    @Column(order = 49, comment = "核心记账日期", length = 8, canBeEmpty = true)
    private String accountDate;

    /**
     * 交易日期
     */
    @Column(order = 50, comment = "交易日期", length = 8, canBeEmpty = false)
    private String txDt;

    /**
     * 该笔业务所属机构，对应的为行方的内部机构号，且要在报送的机构表中存在
     */
    @Column(order = 51, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     * 贷款分户账号
     */
    @Column(order = 52, comment = "贷款分户账号", length = 50, canBeEmpty = false)
    private String lnAcctNo;

    /**
     * 核心客户编号
     */
    @Column(order = 53, comment = "核心客户编号", length = 20, canBeEmpty = true)
    private String cbusCustNo;

    /**
     * 明细科目编号
     * 机构实际使用的明细科目编号。
     */
    @Column(order = 54, comment = "科目编号", length = 8, canBeEmpty = false)
    private String aclgNo;

    /**
     * 明细科目名称
     */
    @Column(order = 55, comment = "科目名称", length = 60, canBeEmpty = true)
    private String aclgName;

    /**
     * 遵循《GB/T 12406-2008 表示货币和资金的代码》的字母代码，如CNY。
     */
    @Column(order = 56, comment = "币种", length = 3, canBeEmpty = false)
    private String ccy;

    /**
     * 贷款逾期余额
     */
    @Column(order = 57, comment = "贷款逾期余额", length = 20, canBeEmpty = true)
    private BigDecimal lnDelayBalAmt;

    /**
     * 欠本余额
     */
    @Column(order = 58, comment = "欠本余额", length = 20, canBeEmpty = true)
    private BigDecimal lnOweBalAmt;

    /**
     * 欠本天数
     */
    @Column(order = 59, comment = "欠本天数", length = 10, canBeEmpty = true)
    private String lnOweDays;

    /**
     * 欠息余额
     */
    @Column(order = 60, comment = "欠息余额", length = 20, canBeEmpty = true)
    private BigDecimal lnOweIntAmt;

    /**
     * 欠息天数
     */
    @Column(order = 61, comment = "欠息天数", length = 10, canBeEmpty = true)
    private String lnOweIntDays;

    /**
     * 本期还款
     */
    @Column(order = 62, comment = "本期还款", length = 20, canBeEmpty = true)
    private BigDecimal lnCrntRfnAmt;

    /**
     * 减值准备
     */
    @Column(order = 63, comment = "减值准备", length = 20, canBeEmpty = true)
    private BigDecimal lnDepreciationAmt;

    /**
     * 贷款期限：实际到期日减去起始日，按天表示。
     */
    @Column(order = 64, comment = "贷款期限", length = 5, canBeEmpty = false)
    private String lnTrm;

    /**
     * 展期次数
     */
    @Column(order = 65, comment = "展期次数", length = 5, canBeEmpty = true)
    private String lnExtnTm;

    /**
     * 当前期数
     */
    @Column(order = 66, comment = "当前期数", length = 5, canBeEmpty = true)
    private String lnPstTrm;

    /**
     * YYYYMMDD，默认值99991231。
     */
    @Column(order = 67, comment = "贷款实际发放日期", length = 8, canBeEmpty = false)
    private String lnActDsphDt;

    /**
     * YYYYMMDD，默认值99991231。
     */
    @Column(order = 68, comment = "贷款原始到期日期", length = 8, canBeEmpty = true)
    private String lnOrgnEndDt;

    /**
     * YYYYMMDD，默认值99991231。
     * 垫款按垫款发生日填写。实际到期日期可以是展期后的日期，与原始到期日期不同
     */
    @Column(order = 69, comment = "贷款实际到期日期", length = 8, canBeEmpty = false)
    private String lnActEndDt;

    /**
     * 单位元
     */
    @Column(order = 70, comment = "表内欠息余额", length = 20, canBeEmpty = true)
    private BigDecimal lnInOweInt;

    /**
     * 单位元
     */
    @Column(order = 71, comment = "表外欠息余额", length = 20, canBeEmpty = true)
    private BigDecimal lnObsOweInt;

    /**
     * 逾期日期
     */
    @Column(order = 72, comment = "逾期日期", length = 8, canBeEmpty = false)
    private String delayDt;

    /**
     * 贷款类型（默认F0219）
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
    @Column(order = 73, comment = "信贷产品类别", length = 6, canBeEmpty = false)
    private String lnBizCase;

    /**
     * 贷款入账账号
     */
    @Column(order = 74, comment = "贷款入账账号", length = 60, canBeEmpty = true)
    private String lnEnterAcctno;

    /**
     * 01 正常
     * 02 关注
     * 03 次级
     * 04 可疑
     * 05 损失
     */
    @Column(order = 75, comment = "贷款五级分类", length = 2, canBeEmpty = false)
    private String lnFivTyp;

    /**
     * 最近一次还款金额
     */
    @Column(order = 76, comment = "最近一次还款金额", length = 20, canBeEmpty = false)
    private BigDecimal ltstRfnAmt;

    /**
     * 最近一次还款日期
     */
    @Column(order = 77, comment = "最近一次还款日期", length = 8, canBeEmpty = false)
    private String ltstRfnDt;

    /**
     * 执行利率
     */
    @Column(order = 78, comment = "执行利率", length = 11, canBeEmpty = false)
    private BigDecimal excsIntr;

    /**
     * RF01 固定利率
     * RF02 浮动利率
     * RF021 浮动比利率
     * RF022 浮动点利率
     */
    @Column(order = 79, comment = "利率类型", length = 5, canBeEmpty = false)
    private String intrType;

    /**
     * 00 固定调整方式(不调整)
     * 10 机动调整方式(每天发生利率变动时当天调整)
     * 20 定期机动调整方式(发生利率变动时下次结息日起调整)
     * 30 年初调整方式(每年1月1日确定贷款利率)
     * 40 开户日（应为贷款发放日）起定期机动
     * 50 任意日起定期机动
     */
    @Column(order = 80, comment = "利率调整方式", length = 2, canBeEmpty = false)
    private String intrAdjSty;

    /**
     * 调整方式为00/10时 无效(转00),
     * 为20时等于缴息周期或缴息周期整数倍,
     * 为30时等于12 ，
     * 为40时转输入调整月数如开户日起一年一调则输12
     * 为50时一个结息周期之后调整一次
     * 00--日
     * 01--月
     * 06--半年
     * 12--年
     */
    @Column(order = 81, comment = "利率调整周期", length = 2, canBeEmpty = false)
    private String intrAdjCycl;

    /**
     * 百分比为单位，即1/100，一般为年利。
     */
    @Column(order = 82, comment = "基准利率", length = 11, canBeEmpty = false)
    private BigDecimal baseIntr;

    /**
     * 基准点为单位。
     * 如上浮1%是填100.00，下浮1%是填-100.00，精确到小数点后2位。如果利率类型是固定利率，则利率浮动填写0.00。如利率类型是浮动利率，则与利率基准结合进行计算。
     */
    @Column(order = 83, comment = "利率浮动", length = 10, canBeEmpty = false)
    private BigDecimal intrFlt;

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
    @Column(order = 84, comment = "还款方式", length = 2, canBeEmpty = false)
    private String rfnSty;

    /**
     * 00-利随本清/一次性还款
     * 01-按月，
     * 03-按季，
     * 06-按半年，
     * 12-按年，
     * 99-其他。
     */
    @Column(order = 85, comment = "还款周期", length = 2, canBeEmpty = false)
    private String rfnCycl;

    /**
     * 00-一次性还款
     * 01-按月，
     * 03-按季，
     * 06-按半年，
     * 12-按年，
     * 99-其他。
     */
    @Column(order = 86, comment = "还本频率", length = 2, canBeEmpty = false)
    private String rfnBalCycl;

    /**
     * 00-一次性还款
     * 01-按月，
     * 03-按季，
     * 06-按半年，
     * 12-按年，
     * 99-其他。
     */
    @Column(order = 87, comment = "还息频率", length = 2, canBeEmpty = false)
    private String rfnIntCycl;

    /**
     * 贷款的扣款账号
     */
    @Column(order = 88, comment = "还款账号", length = 60, canBeEmpty = false)
    private String rfnAcctNo;

    /**
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
    @Column(order = 89, comment = "还款渠道", length = 2, canBeEmpty = false)
    private String rfnChnl;

    /**
     * 1--记利息
     * 0--不记利息
     */
    @Column(order = 90, comment = "计息标志", length = 1, canBeEmpty = false)
    private String loanIntFlag;

    /**
     * 记息的此栏位必填，不记息的可为NULL值
     * 1 积数计息法
     * 2 逐笔计息法
     * 3 单利与复利计息
     * 4 分段计息计息
     */
    @Column(order = 91, comment = "计息方式", length = 1, canBeEmpty = true)
    private String loanIntTyp;

    /**
     * 记息的此栏位必填，不记息的可为NULL值
     * 00--利随本清/一次性还款
     * 01--按月结息，
     * 03--按季结息，
     * 06--按半年结息，
     * 12--按年结息，
     * 98--不定期结息
     * 99--其他
     */
    @Column(order = 92, comment = "计息频率", length = 2, canBeEmpty = false)
    private String loanIntFreq;

    /**
     * 下次还款日期
     */
    @Column(order = 93, comment = "下次还款日期", length = 8, canBeEmpty = true)
    private String lnNextRfnDt;

    /**
     * 下次还款金额
     */
    @Column(order = 94, comment = "下次还款金额", length = 20, canBeEmpty = true)
    private BigDecimal lnNextRfnAmt;

    /**
     * 信贷员姓名
     */
    @Column(order = 95, comment = "信贷员姓名", length = 120, canBeEmpty = true)
    private String custMgName;

    /**
     * 信贷员员工号
     */
    @Column(order = 96, comment = "信贷员员工号", length = 12, canBeEmpty = true)
    private String custMgNo;

    /**
     * 1-新增，2-展期，3-借新还旧，4-重组,5-其他
     */
    @Column(order = 97, comment = "贷款发放类型", length = 1, canBeEmpty = false)
    private String lnDsphTyp;

    /**
     * 例如：无--00000，欠款期数为1期--00001
     */
    @Column(order = 98, comment = "连续欠款期数", length = 5, canBeEmpty = false)
    private String contDlyTerm;

    /**
     * 例如：无--00000，欠款期数为1期--00001
     */
    @Column(order = 99, comment = "累计欠款期数", length = 5, canBeEmpty = false)
    private String accumDlyTerm;

    /**
     * 1-核销，2-未核销，3-部分核销，9-其他
     */
    @Column(order = 100, comment = "核销标志", length = 1, canBeEmpty = false)
    private String apclFlag;

    /**
     * 核销金额包括本金+利息，应该=核销本金+表内/表外利息
     */
    @Column(order = 101, comment = "核销金额", length = 20, canBeEmpty = true)
    private BigDecimal apclBalAmt;

    /**
     * 实核贷款本金
     */
    @Column(order = 102, comment = "核销本金", length = 20, canBeEmpty = true)
    private BigDecimal apclPrAmt;

    /**
     * 核销表内利息
     */
    @Column(order = 103, comment = "核销表内利息", length = 20, canBeEmpty = true)
    private BigDecimal apclInOweInt;

    /**
     * 核销表外利息
     */
    @Column(order = 104, comment = "核销表外利息", length = 20, canBeEmpty = true)
    private BigDecimal apclObsOweInt;

    /**
     * 核销日期
     */
    @Column(order = 105, comment = "核销日期", length = 8, canBeEmpty = true)
    private String apclDt;

    /**
     * 1-是，0-否。
     */
    @Column(order = 106, comment = "收回标志", length = 1, canBeEmpty = true)
    private String colbFlag;

    /**
     * 核销收回日期
     */
    @Column(order = 107, comment = "核销收回日期", length = 8, canBeEmpty = true)
    private String apclColbDt;

    /**
     * 核销收回金额
     */
    @Column(order = 108, comment = "核销收回金额", length = 20, canBeEmpty = true)
    private BigDecimal apclColbBalAmt;

    /**
     * 是指从客户处清收的本金额
     */
    @Column(order = 109, comment = "核销收回本金", length = 20, canBeEmpty = true)
    private BigDecimal apclColbPrAmt;

    /**
     * 核销收回表内利息
     */
    @Column(order = 110, comment = "核销收回表内利息", length = 20, canBeEmpty = true)
    private BigDecimal apclColbInInt;

    /**
     * 核销收回表外利息
     */
    @Column(order = 111, comment = "核销收回表外利息", length = 20, canBeEmpty = true)
    private BigDecimal apclColbObsInt;

    /**
     * 核销收回柜员号
     */
    @Column(order = 112, comment = "核销收回柜员号", length = 12, canBeEmpty = true)
    private String apclColbTlrNo;

    /**
     * 约定还款银行支付行号
     */
    @Column(order = 113, comment = "约定还款银行支付行号", length = 12, canBeEmpty = true)
    private String prdsRfnBankNo;

    /**
     * 约定还款银行名称
     */
    @Column(order = 114, comment = "约定还款银行名称", length = 120, canBeEmpty = true)
    private String prdsRfnBankName;

    /**
     * 银行出资比例
     */
    @Column(order = 115, comment = "银行出资比例", length = 5, canBeEmpty = true)
    private BigDecimal bankProportion;

    /**
     * 罚息利率
     */
    @Column(order = 116, comment = "罚息利率", length = 11, canBeEmpty = true)
    private BigDecimal penaltyRate;

    /**
     * 1-牵头行，2-参与行。
     */
    @Column(order = 117, comment = "银团贷款标识", length = 1, canBeEmpty = true)
    private String syndicLnAtion;

    /**
     * 银团编号
     */
    @Column(order = 118, comment = "银团编号", length = 20, canBeEmpty = true)
    private String syndicLnCd;

    /**
     * 多家行之间使用"|"隔开
     */
    @Column(order = 119, comment = "贷款发放人编号", length = 100, canBeEmpty = true)
    private String lnDsphBankNo;

    /**
     * 多家行之间使用"|"隔开
     */
    @Column(order = 120, comment = "贷款发放人名称", length = 200, canBeEmpty = true)
    private String lnDsphBankName;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 121, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    /**
     * 使用基准利率：L1-短期贷款6月;L2-短期贷款6至12月;L3-中长期贷款12至36月;L4-中长期贷款36至60月;L5-中长期贷款60月以上
     * 使用LPR利率：BB-1到5年期（包含一年以内，包含5年)；BF-5年期以上
     * 既不参考基准利率也不参考人行LPR利率，给空值
     */
    @Column(order = 122, comment = "利率类别", length = 2, canBeEmpty = false)
    private String lnIntrTypCd;

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

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
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

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
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

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(String borrowerType) {
        this.borrowerType = borrowerType;
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

    public BigDecimal getPartnerFee() {
        return partnerFee;
    }

    public void setPartnerFee(BigDecimal partnerFee) {
        this.partnerFee = partnerFee;
    }

    public BigDecimal getLeftPrinciple() {
        return leftPrinciple;
    }

    public void setLeftPrinciple(BigDecimal leftPrinciple) {
        this.leftPrinciple = leftPrinciple;
    }

    public BigDecimal getInhandlePrinciple() {
        return inhandlePrinciple;
    }

    public void setInhandlePrinciple(BigDecimal inhandlePrinciple) {
        this.inhandlePrinciple = inhandlePrinciple;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getLoanInvoiceStatus() {
        return loanInvoiceStatus;
    }

    public void setLoanInvoiceStatus(String loanInvoiceStatus) {
        this.loanInvoiceStatus = loanInvoiceStatus;
    }

    public String getAdvanceStatus() {
        return advanceStatus;
    }

    public void setAdvanceStatus(String advanceStatus) {
        this.advanceStatus = advanceStatus;
    }

    public String getWithholdType() {
        return withholdType;
    }

    public void setWithholdType(String withholdType) {
        this.withholdType = withholdType;
    }

    public String getWithholdSignDate() {
        return withholdSignDate;
    }

    public void setWithholdSignDate(String withholdSignDate) {
        this.withholdSignDate = withholdSignDate;
    }

    public String getWithholdAccount() {
        return withholdAccount;
    }

    public void setWithholdAccount(String withholdAccount) {
        this.withholdAccount = withholdAccount;
    }

    public String getWithholdUserName() {
        return withholdUserName;
    }

    public void setWithholdUserName(String withholdUserName) {
        this.withholdUserName = withholdUserName;
    }

    public String getWithholdUserId() {
        return withholdUserId;
    }

    public void setWithholdUserId(String withholdUserId) {
        this.withholdUserId = withholdUserId;
    }

    public String getWithholdAccountKind() {
        return withholdAccountKind;
    }

    public void setWithholdAccountKind(String withholdAccountKind) {
        this.withholdAccountKind = withholdAccountKind;
    }

    public String getWithholdMobileTel() {
        return withholdMobileTel;
    }

    public void setWithholdMobileTel(String withholdMobileTel) {
        this.withholdMobileTel = withholdMobileTel;
    }

    public String getWithholdCertificateId() {
        return withholdCertificateId;
    }

    public void setWithholdCertificateId(String withholdCertificateId) {
        this.withholdCertificateId = withholdCertificateId;
    }

    public String getWithholdCertificateKind() {
        return withholdCertificateKind;
    }

    public void setWithholdCertificateKind(String withholdCertificateKind) {
        this.withholdCertificateKind = withholdCertificateKind;
    }

    public BigDecimal getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(BigDecimal repayNum) {
        this.repayNum = repayNum;
    }

    public BigDecimal getInitRate() {
        return initRate;
    }

    public void setInitRate(BigDecimal initRate) {
        this.initRate = initRate;
    }

    public BigDecimal getExecuteRate() {
        return executeRate;
    }

    public void setExecuteRate(BigDecimal executeRate) {
        this.executeRate = executeRate;
    }

    public String getBeginProfitDate() {
        return beginProfitDate;
    }

    public void setBeginProfitDate(String beginProfitDate) {
        this.beginProfitDate = beginProfitDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getRealSettleDate() {
        return realSettleDate;
    }

    public void setRealSettleDate(String realSettleDate) {
        this.realSettleDate = realSettleDate;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(String verificationDate) {
        this.verificationDate = verificationDate;
    }

    public BigDecimal getProfitPeriod() {
        return profitPeriod;
    }

    public void setProfitPeriod(BigDecimal profitPeriod) {
        this.profitPeriod = profitPeriod;
    }

    public String getDiscountRuleId() {
        return discountRuleId;
    }

    public void setDiscountRuleId(String discountRuleId) {
        this.discountRuleId = discountRuleId;
    }

    public String getFeeRuleId() {
        return feeRuleId;
    }

    public void setFeeRuleId(String feeRuleId) {
        this.feeRuleId = feeRuleId;
    }

    public String getGuaranteeMode() {
        return guaranteeMode;
    }

    public void setGuaranteeMode(String guaranteeMode) {
        this.guaranteeMode = guaranteeMode;
    }

    public String getLoanSerialNo() {
        return loanSerialNo;
    }

    public void setLoanSerialNo(String loanSerialNo) {
        this.loanSerialNo = loanSerialNo;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFundOrg() {
        return fundOrg;
    }

    public void setFundOrg(String fundOrg) {
        this.fundOrg = fundOrg;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
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

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getTxDt() {
        return txDt;
    }

    public void setTxDt(String txDt) {
        this.txDt = txDt;
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

    public String getAclgName() {
        return aclgName;
    }

    public void setAclgName(String aclgName) {
        this.aclgName = aclgName;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public BigDecimal getLnDelayBalAmt() {
        return lnDelayBalAmt;
    }

    public void setLnDelayBalAmt(BigDecimal lnDelayBalAmt) {
        this.lnDelayBalAmt = lnDelayBalAmt;
    }

    public BigDecimal getLnOweBalAmt() {
        return lnOweBalAmt;
    }

    public void setLnOweBalAmt(BigDecimal lnOweBalAmt) {
        this.lnOweBalAmt = lnOweBalAmt;
    }

    public String getLnOweDays() {
        return lnOweDays;
    }

    public void setLnOweDays(String lnOweDays) {
        this.lnOweDays = lnOweDays;
    }

    public BigDecimal getLnOweIntAmt() {
        return lnOweIntAmt;
    }

    public void setLnOweIntAmt(BigDecimal lnOweIntAmt) {
        this.lnOweIntAmt = lnOweIntAmt;
    }

    public String getLnOweIntDays() {
        return lnOweIntDays;
    }

    public void setLnOweIntDays(String lnOweIntDays) {
        this.lnOweIntDays = lnOweIntDays;
    }

    public BigDecimal getLnCrntRfnAmt() {
        return lnCrntRfnAmt;
    }

    public void setLnCrntRfnAmt(BigDecimal lnCrntRfnAmt) {
        this.lnCrntRfnAmt = lnCrntRfnAmt;
    }

    public BigDecimal getLnDepreciationAmt() {
        return lnDepreciationAmt;
    }

    public void setLnDepreciationAmt(BigDecimal lnDepreciationAmt) {
        this.lnDepreciationAmt = lnDepreciationAmt;
    }

    public String getLnTrm() {
        return lnTrm;
    }

    public void setLnTrm(String lnTrm) {
        this.lnTrm = lnTrm;
    }

    public String getLnExtnTm() {
        return lnExtnTm;
    }

    public void setLnExtnTm(String lnExtnTm) {
        this.lnExtnTm = lnExtnTm;
    }

    public String getLnPstTrm() {
        return lnPstTrm;
    }

    public void setLnPstTrm(String lnPstTrm) {
        this.lnPstTrm = lnPstTrm;
    }

    public String getLnActDsphDt() {
        return lnActDsphDt;
    }

    public void setLnActDsphDt(String lnActDsphDt) {
        this.lnActDsphDt = lnActDsphDt;
    }

    public String getLnOrgnEndDt() {
        return lnOrgnEndDt;
    }

    public void setLnOrgnEndDt(String lnOrgnEndDt) {
        this.lnOrgnEndDt = lnOrgnEndDt;
    }

    public String getLnActEndDt() {
        return lnActEndDt;
    }

    public void setLnActEndDt(String lnActEndDt) {
        this.lnActEndDt = lnActEndDt;
    }

    public BigDecimal getLnInOweInt() {
        return lnInOweInt;
    }

    public void setLnInOweInt(BigDecimal lnInOweInt) {
        this.lnInOweInt = lnInOweInt;
    }

    public BigDecimal getLnObsOweInt() {
        return lnObsOweInt;
    }

    public void setLnObsOweInt(BigDecimal lnObsOweInt) {
        this.lnObsOweInt = lnObsOweInt;
    }

    public String getDelayDt() {
        return delayDt;
    }

    public void setDelayDt(String delayDt) {
        this.delayDt = delayDt;
    }

    public String getLnBizCase() {
        return lnBizCase;
    }

    public void setLnBizCase(String lnBizCase) {
        this.lnBizCase = lnBizCase;
    }

    public String getLnEnterAcctno() {
        return lnEnterAcctno;
    }

    public void setLnEnterAcctno(String lnEnterAcctno) {
        this.lnEnterAcctno = lnEnterAcctno;
    }

    public String getLnFivTyp() {
        return lnFivTyp;
    }

    public void setLnFivTyp(String lnFivTyp) {
        this.lnFivTyp = lnFivTyp;
    }

    public BigDecimal getLtstRfnAmt() {
        return ltstRfnAmt;
    }

    public void setLtstRfnAmt(BigDecimal ltstRfnAmt) {
        this.ltstRfnAmt = ltstRfnAmt;
    }

    public String getLtstRfnDt() {
        return ltstRfnDt;
    }

    public void setLtstRfnDt(String ltstRfnDt) {
        this.ltstRfnDt = ltstRfnDt;
    }

    public BigDecimal getExcsIntr() {
        return excsIntr;
    }

    public void setExcsIntr(BigDecimal excsIntr) {
        this.excsIntr = excsIntr;
    }

    public String getIntrType() {
        return intrType;
    }

    public void setIntrType(String intrType) {
        this.intrType = intrType;
    }

    public String getIntrAdjSty() {
        return intrAdjSty;
    }

    public void setIntrAdjSty(String intrAdjSty) {
        this.intrAdjSty = intrAdjSty;
    }

    public String getIntrAdjCycl() {
        return intrAdjCycl;
    }

    public void setIntrAdjCycl(String intrAdjCycl) {
        this.intrAdjCycl = intrAdjCycl;
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

    public String getRfnSty() {
        return rfnSty;
    }

    public void setRfnSty(String rfnSty) {
        this.rfnSty = rfnSty;
    }

    public String getRfnCycl() {
        return rfnCycl;
    }

    public void setRfnCycl(String rfnCycl) {
        this.rfnCycl = rfnCycl;
    }

    public String getRfnBalCycl() {
        return rfnBalCycl;
    }

    public void setRfnBalCycl(String rfnBalCycl) {
        this.rfnBalCycl = rfnBalCycl;
    }

    public String getRfnIntCycl() {
        return rfnIntCycl;
    }

    public void setRfnIntCycl(String rfnIntCycl) {
        this.rfnIntCycl = rfnIntCycl;
    }

    public String getRfnAcctNo() {
        return rfnAcctNo;
    }

    public void setRfnAcctNo(String rfnAcctNo) {
        this.rfnAcctNo = rfnAcctNo;
    }

    public String getRfnChnl() {
        return rfnChnl;
    }

    public void setRfnChnl(String rfnChnl) {
        this.rfnChnl = rfnChnl;
    }

    public String getLoanIntFlag() {
        return loanIntFlag;
    }

    public void setLoanIntFlag(String loanIntFlag) {
        this.loanIntFlag = loanIntFlag;
    }

    public String getLoanIntTyp() {
        return loanIntTyp;
    }

    public void setLoanIntTyp(String loanIntTyp) {
        this.loanIntTyp = loanIntTyp;
    }

    public String getLoanIntFreq() {
        return loanIntFreq;
    }

    public void setLoanIntFreq(String loanIntFreq) {
        this.loanIntFreq = loanIntFreq;
    }

    public String getLnNextRfnDt() {
        return lnNextRfnDt;
    }

    public void setLnNextRfnDt(String lnNextRfnDt) {
        this.lnNextRfnDt = lnNextRfnDt;
    }

    public BigDecimal getLnNextRfnAmt() {
        return lnNextRfnAmt;
    }

    public void setLnNextRfnAmt(BigDecimal lnNextRfnAmt) {
        this.lnNextRfnAmt = lnNextRfnAmt;
    }

    public String getCustMgName() {
        return custMgName;
    }

    public void setCustMgName(String custMgName) {
        this.custMgName = custMgName;
    }

    public String getCustMgNo() {
        return custMgNo;
    }

    public void setCustMgNo(String custMgNo) {
        this.custMgNo = custMgNo;
    }

    public String getLnDsphTyp() {
        return lnDsphTyp;
    }

    public void setLnDsphTyp(String lnDsphTyp) {
        this.lnDsphTyp = lnDsphTyp;
    }

    public String getContDlyTerm() {
        return contDlyTerm;
    }

    public void setContDlyTerm(String contDlyTerm) {
        this.contDlyTerm = contDlyTerm;
    }

    public String getAccumDlyTerm() {
        return accumDlyTerm;
    }

    public void setAccumDlyTerm(String accumDlyTerm) {
        this.accumDlyTerm = accumDlyTerm;
    }

    public String getApclFlag() {
        return apclFlag;
    }

    public void setApclFlag(String apclFlag) {
        this.apclFlag = apclFlag;
    }

    public BigDecimal getApclBalAmt() {
        return apclBalAmt;
    }

    public void setApclBalAmt(BigDecimal apclBalAmt) {
        this.apclBalAmt = apclBalAmt;
    }

    public BigDecimal getApclPrAmt() {
        return apclPrAmt;
    }

    public void setApclPrAmt(BigDecimal apclPrAmt) {
        this.apclPrAmt = apclPrAmt;
    }

    public BigDecimal getApclInOweInt() {
        return apclInOweInt;
    }

    public void setApclInOweInt(BigDecimal apclInOweInt) {
        this.apclInOweInt = apclInOweInt;
    }

    public BigDecimal getApclObsOweInt() {
        return apclObsOweInt;
    }

    public void setApclObsOweInt(BigDecimal apclObsOweInt) {
        this.apclObsOweInt = apclObsOweInt;
    }

    public String getApclDt() {
        return apclDt;
    }

    public void setApclDt(String apclDt) {
        this.apclDt = apclDt;
    }

    public String getColbFlag() {
        return colbFlag;
    }

    public void setColbFlag(String colbFlag) {
        this.colbFlag = colbFlag;
    }

    public String getApclColbDt() {
        return apclColbDt;
    }

    public void setApclColbDt(String apclColbDt) {
        this.apclColbDt = apclColbDt;
    }

    public BigDecimal getApclColbBalAmt() {
        return apclColbBalAmt;
    }

    public void setApclColbBalAmt(BigDecimal apclColbBalAmt) {
        this.apclColbBalAmt = apclColbBalAmt;
    }

    public BigDecimal getApclColbPrAmt() {
        return apclColbPrAmt;
    }

    public void setApclColbPrAmt(BigDecimal apclColbPrAmt) {
        this.apclColbPrAmt = apclColbPrAmt;
    }

    public BigDecimal getApclColbInInt() {
        return apclColbInInt;
    }

    public void setApclColbInInt(BigDecimal apclColbInInt) {
        this.apclColbInInt = apclColbInInt;
    }

    public BigDecimal getApclColbObsInt() {
        return apclColbObsInt;
    }

    public void setApclColbObsInt(BigDecimal apclColbObsInt) {
        this.apclColbObsInt = apclColbObsInt;
    }

    public String getApclColbTlrNo() {
        return apclColbTlrNo;
    }

    public void setApclColbTlrNo(String apclColbTlrNo) {
        this.apclColbTlrNo = apclColbTlrNo;
    }

    public String getPrdsRfnBankNo() {
        return prdsRfnBankNo;
    }

    public void setPrdsRfnBankNo(String prdsRfnBankNo) {
        this.prdsRfnBankNo = prdsRfnBankNo;
    }

    public String getPrdsRfnBankName() {
        return prdsRfnBankName;
    }

    public void setPrdsRfnBankName(String prdsRfnBankName) {
        this.prdsRfnBankName = prdsRfnBankName;
    }

    public BigDecimal getBankProportion() {
        return bankProportion;
    }

    public void setBankProportion(BigDecimal bankProportion) {
        this.bankProportion = bankProportion;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
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

    public String getLnDsphBankNo() {
        return lnDsphBankNo;
    }

    public void setLnDsphBankNo(String lnDsphBankNo) {
        this.lnDsphBankNo = lnDsphBankNo;
    }

    public String getLnDsphBankName() {
        return lnDsphBankName;
    }

    public void setLnDsphBankName(String lnDsphBankName) {
        this.lnDsphBankName = lnDsphBankName;
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
