package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * 监管报送客户信息
 *
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserPersonalBasicInfo {

    /**
     * 调用核心的ECIF回传，返回记账日期。（不调用核心接口的，客户号用：网贷产品缩写加客户证件号）
     */
    @Column(order = 0, comment = "客户ID", length = 32, canBeEmpty = false)
    private String userId;

    /**
     *
     */
    @Column(order = 1, comment = "客户姓名", length = 60, canBeEmpty = false)
    private String clientName;

    /**
     *
     */
    @Column(order = 2, comment = "英文名称", length = 64, canBeEmpty = true)
    private String englishName;

    /**
     *
     */
    @Column(order = 3, comment = "简称", length = 40, canBeEmpty = true)
    private String shortName;

    /**
     * 《个人基本信息分类与代码类》GB/T2261.1-2003
     * 1-男性
     * 2-女性
     * 9-未说明的性别 未提供相关信息
     * 0-未知的性别
     */
    @Column(order = 4, comment = "性别", length = 1, canBeEmpty = false)
    private String sex;

    /**
     * 《学历代码》GB/T4658-2006
     * 10 研究生教育
     * 11 博士研究生毕业
     * 12 博士研究生结业
     * 13 博士研究生肄业
     * 14 硕士研究生毕业
     * 15 硕士研究生结业
     * 16 硕士研究生肄业
     * 17 研究生班毕业毕业
     * 18 研究生班毕业结业
     * 19 研究生班肄业
     * 20  大学本科
     * 21 大学本科毕业
     * 22 大学本科结业
     * 23 大学本科肄业
     * 28 大学普通班毕业
     * 30  专科教育
     * 31 大学专科毕业
     * 32 大学专科结业
     * 33 大学专科肄业
     * 40 中等职业教育
     * 41 中等专科毕业
     * 42 中等专科结业
     * 43 中等专科肄业
     * 44 职业高中毕业
     * 45 职业高中结业
     * 46 职业高中肄业
     * 47 技工学校毕业
     * 48 技工学校结业
     * 49 技工学院肄业
     * 60 普通高级中学教育
     * 61 普通高中毕业
     * 62 普通高中结业
     * 63 普通高中肄业
     * 70 初级中学教育
     * 71 初中毕业
     * 73 初中肄业
     * 80 小学教育
     * 81 小学毕业
     * 83 小学肄业
     * 90 其他
     */
    @Column(order = 5, comment = "学历", length = 2, canBeEmpty = true)
    private String eduLevel;

    /**
     * 政治面貌，表明了一个在政治上的归属，是一个人的政治身份最直接的反映
     * 01-中产党员
     * 02-中共预备党员
     * 03-共青团员
     * 04-民革党员
     * 05-民盟盟员
     * 06-民建会员
     * 07-民进会员
     * 08-农工党党员
     * 09-致公党党员
     * 10-九三学社社员
     * 11-台盟盟员
     * 12-无党派人士
     * 13-群众(普通居民)
     * 90-未知
     * 99-其他
     */
    @Column(order = 6, comment = "政治面貌", length = 20, canBeEmpty = false)
    private String politicalStatus;

    /**
     * 描述客户属于某一个国家的法律资格。
     * 《GB/T 2659-2000世界各国和地区名称代码》
     */
    @Column(order = 7, comment = "国籍地区", length = 3, canBeEmpty = true)
    private String nationality;

    /**
     * 国家认可的在公安户籍管理部门正式登记注册的客户所属民族的名称。
     * 《中国各民族名称的罗马字母拼写法和代码类》GB 3304-91
     * 01 汉族
     * 02 蒙古族
     * 03 回族
     * 04 藏族
     * 05 维吾尔族
     * 06 苗族
     * 07 彝族
     * 08 壮族
     * 09 布依族
     * 10 朝鲜族
     * 11 满族
     * 12 侗族
     * 13 瑶族
     * 14 白族
     * 15 土家族
     * 16 哈尼族
     * 17 哈萨克族
     * 18 傣族
     * 19 黎族
     * 20 傈僳族
     * 21 佤族
     * 22 畲族
     * 23 高山族
     * 24 拉祜族
     * 25 水族
     * 26 东乡族
     * 27 纳西族
     * 28 景颇族
     * 29 柯尔克孜族
     * 30 土族
     * 31 达斡尔族
     * 32 仫佬族
     * 33 羌族
     * 34 布朗族
     * 35 撒拉族
     * 36 毛南族
     * 37 仡佬族
     * 38 锡伯族
     * 39 阿昌族
     * 40 普米族
     * 41 塔吉克族
     * 42 怒族
     * 43 乌孜别克族
     * 44 俄罗斯族
     * 45 鄂温克族
     * 46 德昂族
     * 47 保安族
     * 48 裕固族
     * 49 京族
     * 50 塔塔尔族
     * 51 独龙族
     * 52 鄂伦春族
     * 53 赫哲族
     * 54 门巴族
     * 55 珞巴族
     * 56 基诺族
     */
    @Column(order = 8, comment = "民族", length = 18, canBeEmpty = false)
    private String idNation;

    /**
     *
     */
    @Column(order = 9, comment = "宗教", length = 60, canBeEmpty = true)
    private String religion;

    /**
     *
     */
    @Column(order = 10, comment = "年龄", length = 11, canBeEmpty = true)
    private BigDecimal clientAgeNum;

    /**
     * 《个人基本信息分类与代码类》GB/T2261.1-2003
     * 10 未婚
     * 20 已婚
     * 21 初婚
     * 22 再婚
     * 23 复婚
     * 30 丧偶
     * 40 离婚
     * 90 未说明婚姻关系
     */
    @Column(order = 11, comment = "婚姻状况", length = 2, canBeEmpty = false)
    private String marriageStatus;

    /**
     * "YYYYMMDD"或"YYYYMMDDHHMMSSmmm"
     */
    @Column(order = 12, comment = "创建日期", length = 26, canBeEmpty = false)
    private String createTime;

    /**
     *
     */
    @Column(order = 13, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     *
     */
    @Column(order = 14, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     *
     */
    @Column(order = 15, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 联盟定义的用于我们系统区分的成员行号
     */
    @Column(order = 16, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 该笔业务所属机构，对应的为行方的内部机构号，且要在报送的机构表中存在
     */
    @Column(order = 17, comment = "业务办理机构", length = 9, canBeEmpty = false)
    private String busnDealInstn;

    /**
     *
     */
    @Column(order = 18, comment = "核心客户编号", length = 20, canBeEmpty = true)
    private String cbusCustNo;

    /**
     *
     */
    @Column(order = 19, comment = "发证机关代码", length = 8, canBeEmpty = true)
    private String issuingAuthorityNo;

    /**
     * 1、居民；2、非居民。（默认为1）。
     */
    @Column(order = 20, comment = "居民标志", length = 1, canBeEmpty = false)
    private String nativeFlag;

    /**
     * 1、境内；2、境外（默认为1）。
     */
    @Column(order = 21, comment = "境内/境外标志", length = 1, canBeEmpty = false)
    private String domsOversFlg;

    /**
     * 人民银行《征信数据元个人征信数据元》
     * YYYYMMDD
     */
    @Column(order = 22, comment = "出生日期", length = 8, canBeEmpty = false)
    private String birthDay;

    /**
     * GB/T 6864-2003 中华人民共和国学位代码
     * 1 名誉博士
     * 2 博士
     * 201 哲学博士学位
     * 202 经济学博士学位
     * 203 法学博士学位
     * 204 教育学博士学位
     * 205 文学博士学位
     * 206 历史学博士学位
     * 207 理学博士学位
     * 208 工学博士学位
     * 209 农学博士学位
     * 210 医学博士学位
     * 211 军事学博士学位
     * 212 管理学博士学位
     * 245 临床医学博士专业学位
     * 248 兽医博士专业学位
     * 250 口腔医学博士专业学位
     * 3 硕士
     * 301 哲学硕士学位
     * 302 经济学硕士学位
     * 303 法学硕士学位
     * 304 教育学硕士学位
     * 305 文学硕士学位
     * 306 历史学硕士学位
     * 307 理学硕士学位
     * 308 工学硕士学位
     * 309 农学硕士学位
     * 310 医学硕士学位
     * 311 军事学硕士学位
     * 312 管理学硕士学位
     * 341 法律硕士专业学位
     * 342 教育硕士专业学位
     * 343 工程硕士专业学位
     * 344 建筑学硕士专业学位
     * 345 临床医学硕士专业学位
     * 346 工商管理硕士专业学位
     * 347 农业推广硕士专业学位
     * 348 兽医硕士专业学位
     * 349 公共管理硕士专业学位
     * 350 口腔医学硕士专业学位
     * 351 公共卫生硕士专业学位
     * 352 军事硕士专业学位
     * 4 学士
     * 401 哲学学士学位
     * 402 经济学学士学位
     * 403 法学学士学位
     * 404 教育学学士学位
     * 405 文学学士学位
     * 406 历史学学士学位
     * 407 理学学士学位
     * 408 工学学士学位
     * 409 农学学士学位
     * 410 医学学士学位
     * 411 军事学学士学位
     * 412 管理学学士学位
     * 444 建筑学学士专业学位
     * 998 无学位
     * 999 其他
     */
    @Column(order = 23, comment = "最高学位", length = 3, canBeEmpty = false)
    private String maxDegree;

    /**
     *
     */
    @Column(order = 24, comment = "配偶", length = 120, canBeEmpty = true)
    private String couName;

    /**
     *
     */
    @Column(order = 25, comment = "配偶联系电话", length = 50, canBeEmpty = true)
    private String couConnTel;

    /**
     *
     */
    @Column(order = 26, comment = "配偶移动电话", length = 50, canBeEmpty = true)
    private String couMoble;

    /**
     * 《JR/T 0014-2005 银行信息化通用代码集》
     * 10 居民身份证
     * 20 军人身份证
     * 21 士兵证
     * 22 军官证
     * 23 文职干部证
     * 24 军官退休证
     * 25 文职干部退休证
     * 30 武警身份证件
     * 31 武警士兵证
     * 32 警官证
     * 33 武警文职干部证
     * 34 武警军官退休证
     * 35 武警文职干部退休证
     * 40 户口簿
     * 50 护照
     * 60 香港、澳门、台湾居民有效身份证件
     */
    @Column(order = 27, comment = "配偶证件类型", length = 2, canBeEmpty = true)
    private String couCertType;

    /**
     *
     */
    @Column(order = 28, comment = "配偶证件号码", length = 60, canBeEmpty = true)
    private String couCertNo;

    /**
     *
     */
    @Column(order = 29, comment = "配偶客户号", length = 120, canBeEmpty = true)
    private String couCustNo;

    /**
     *
     */
    @Column(order = 30, comment = "配偶工作单位名称", length = 120, canBeEmpty = true)
    private String couWokgUnitNm;

    /**
     *
     */
    @Column(order = 31, comment = "配偶工作单位地址", length = 400, canBeEmpty = true)
    private String couWokgUnitAddr;

    /**
     *
     */
    @Column(order = 32, comment = "配偶工作单位电话", length = 50, canBeEmpty = true)
    private String couWokgUnitTel;

    /**
     * 客户所属国民经济部门具体请参考《贷款统计分类及编码》（银发[2016]164号）。（默认为D01）
     * A01 中央政府
     * A02 地方政府
     * A03 社会保障基金
     * A04 机关团体
     * A05 部队
     * A06 住房公积金
     * B01 货币当局
     * B02 监管当局
     * B03 银行业存款类金融机构
     * B04 银行业非存款类金融机构
     * B05 证券业金融机构
     * B06 保险业金融机构
     * B07 交易及结算类金融机构
     * B08 金融控股公司
     * B09 特定目的载体
     * B99 其他
     * C01 公司
     * C02 非公司企业
     * C99 其他非金融企业部门
     * D01 住户
     * D02 为住户服务的非营利机构
     * E01 国际组织
     * E02 外国政府
     * E03 国外金融机构
     * E04 国外非金融企业
     * E05 外国居民
     */
    @Column(order = 33, comment = "国民经济部门", length = 3, canBeEmpty = false)
    private String ntEconSec;

    /**
     * 借款人为境内个人，填写“100”；借款人为非居民填写“200”。
     */
    @Column(order = 34, comment = "行业类别", length = 5, canBeEmpty = false)
    private String occCode;

    /**
     * 2017年统计用区划代码和城乡划分代码(截止2017年10月31日)（默认身份证号码前6位）
     * GB/T2260
     */
    @Column(order = 35, comment = "行政区划", length = 6, canBeEmpty = false)
    private String origPlace;

    /**
     * QQ、微信、支付宝等编号
     */
    @Column(order = 36, comment = "即时通讯号", length = 46, canBeEmpty = true)
    private String indivComNo;

    /**
     *
     */
    @Column(order = 37, comment = "居住地邮政编码", length = 12, canBeEmpty = true)
    private String indivZipCode;

    /**
     * 人民银行《征信数据元个人征信数据元》（默认7）
     * 1 无按揭自置
     * 2 按揭自置
     * 3 亲属产权
     * 4 集体宿舍
     * 5 租房
     * 6 共有住宅
     * 7 其他
     * 9 未知
     */
    @Column(order = 38, comment = "居住状况", length = 1, canBeEmpty = false)
    private String rsdCond;

    /**
     * GB/T 6565-2015职业分类与代码 （默认其他对应码值）
     */
    @Column(order = 39, comment = "职业", length = 5, canBeEmpty = false)
    private String occuType;

    /**
     * 01--高级；02--中级；03--初级；04--无；99--其他（默认99）
     */
    @Column(order = 40, comment = "职称", length = 2, canBeEmpty = false)
    private String techLevel;

    /**
     * 描述个人客户所担职位的称呼，主要介绍做何种工作。（默认90）
     * 01--（副）厅/局级以上
     * 02--（副）处级
     * 03--科级
     * 04--科员
     * 10--企业负责人/高管
     * 11--个人服务工作者
     * 12--中层管理人员
     * 13--一般管理人员
     * 14--一般员工
     * 90--其他
     * 99--未知
     */
    @Column(order = 41, comment = "职务", length = 2, canBeEmpty = false)
    private String jobPosn;

    /**
     * 填写工作单位的全称。在单位名称中，字符一律采用半角，字母一律大写，如：“建模科技（武汉）有限公司”、“ABC CORP.”。
     * 。其中，汉字之间不应有空格，英文名字中，英文字母一律大写，分隔符一律采用半角空格，英文字母上面加有其他字符的只填入英文字母，省略字母上的其他字符，如："MICHAEL JóRDAN"，应该写成“MICHAEL JORDAN”。
     */
    @Column(order = 42, comment = "工作单位名称", length = 320, canBeEmpty = true)
    private String indivComName;

    /**
     * 记录个人工作单位的联系电话号码。
     */
    @Column(order = 43, comment = "工作单位电话", length = 200, canBeEmpty = true)
    private String indivComTel;

    /**
     * 单位性质分为行政类、公益类、经营类
     * 行政类主要指具有行政执法等职能的事业单位，比如城市监察、环境监测等
     * 公益类指为社会提供无偿服务的全额拨款事业单位，其承担公益性职能，国家保证经费，不再从事经营活动
     * 经营类指为社会提供有偿服务获得收入的自收自支单位，按企业模式，参与社会竞争，自负盈亏。（默认10）
     * 01--国家行政企业、政府机关
     * 02--公私合作企业
     * 03--中外合资企业
     * 04--社会组织机构
     * 05--国际组织机构
     * 06--外资企业
     * 07--私营企业
     * 08--集体企业
     * 09--国防军事企业
     * 10--其他
     */
    @Column(order = 44, comment = "工作单位性质", length = 2, canBeEmpty = true)
    private String indivComChara;

    /**
     * 个人当前的工作单位地址信息，
     * 包括行政区划(省、市、县)、街道(乡、镇)、门牌号(村、组)等信息。
     */
    @Column(order = 45, comment = "工作单位地址", length = 400, canBeEmpty = true)
    private String indivComAddr;

    /**
     * 单位元
     */
    @Column(order = 46, comment = "个人年收入", length = 20, canBeEmpty = true)
    private BigDecimal inuvYrRev;

    /**
     * 单位元
     */
    @Column(order = 47, comment = "月收入", length = 20, canBeEmpty = true)
    private BigDecimal prsnMonIncom;

    /**
     * 单位元
     */
    @Column(order = 48, comment = "家庭月收入", length = 20, canBeEmpty = true)
    private BigDecimal fmlyMonIncom;

    /**
     * 1-是，0-否。（默认为0）
     */
    @Column(order = 49, comment = "是否农户", length = 1, canBeEmpty = false)
    private String whthFarmer;

    /**
     *
     */
    @Column(order = 50, comment = "开户日期", length = 8, canBeEmpty = true)
    private String openDate;

    /**
     * （默认98）
     * 01 AAA级
     * 02 AA级
     * 03 A级
     * 04 BBB级
     * 05 BB级
     * 06 B级
     * 07 CCC级
     * 08 CC级
     * 09 C级
     * 10 D级
     * 11 F级
     * 12 未通过
     * 13 待审定
     * 90 未审定
     * 98 其他
     * 99 未知
     */
    @Column(order = 51, comment = "信用级别", length = 2, canBeEmpty = false)
    private String ciEntpCrdg;

    /**
     * 贷款人内部评级系统中对客户评定的信用等级的级别划分数量。举例说明，某金融机构对借款人的信用评级从高到低分为A、B、C1、C2、C3、D1、D2、D3、E1、E2共10个级别，则借款人信用级别总等级数为10。
     */
    @Column(order = 52, comment = "信用级别总等级数", length = 2, canBeEmpty = true)
    private String ciEntpCrdgLevelcount;

    /**
     * 指未来一段时间内借款人发生违约的可能性。
     */
    @Column(order = 53, comment = "违约概率（PD）", length = 5, canBeEmpty = true)
    private BigDecimal lnPd;

    /**
     * 指借款人一旦违约将给债权人造成的损失数额，即损失的严重程度
     */
    @Column(order = 54, comment = "违约损失率（LGD）", length = 5, canBeEmpty = true)
    private BigDecimal lnLgd;

    /**
     * 指借款人违约时该笔贷款的风险暴露总额
     */
    @Column(order = 55, comment = "违约风险暴露（EAD）", length = 17, canBeEmpty = true)
    private BigDecimal lnEad;

    /**
     * 指一定持有期内超出预期损失的潜在损失
     */
    @Column(order = 56, comment = "非预期损失（UL）", length = 17, canBeEmpty = true)
    private BigDecimal lnUl;

    /**
     * 卡号
     */
    @Column(order = 57, comment = "绑定银行卡卡号", length = 21, canBeEmpty = true)
    private String cardNo;

    /**
     * 人行支付行号
     */
    @Column(order = 58, comment = "绑定银行卡开户行号", length = 12, canBeEmpty = true)
    private String cardBankNo;

    /**
     * 1、正常2、休眠3、销户9、其他（默认9）
     */
    @Column(order = 59, comment = "客户状态", length = 1, canBeEmpty = false)
    private String custSts;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 60, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNation() {
        return idNation;
    }

    public void setIdNation(String idNation) {
        this.idNation = idNation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public BigDecimal getClientAgeNum() {
        return clientAgeNum;
    }

    public void setClientAgeNum(BigDecimal clientAgeNum) {
        this.clientAgeNum = clientAgeNum;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getBusnDealInstn() {
        return busnDealInstn;
    }

    public void setBusnDealInstn(String busnDealInstn) {
        this.busnDealInstn = busnDealInstn;
    }

    public String getCbusCustNo() {
        return cbusCustNo;
    }

    public void setCbusCustNo(String cbusCustNo) {
        this.cbusCustNo = cbusCustNo;
    }

    public String getIssuingAuthorityNo() {
        return issuingAuthorityNo;
    }

    public void setIssuingAuthorityNo(String issuingAuthorityNo) {
        this.issuingAuthorityNo = issuingAuthorityNo;
    }

    public String getNativeFlag() {
        return nativeFlag;
    }

    public void setNativeFlag(String nativeFlag) {
        this.nativeFlag = nativeFlag;
    }

    public String getDomsOversFlg() {
        return domsOversFlg;
    }

    public void setDomsOversFlg(String domsOversFlg) {
        this.domsOversFlg = domsOversFlg;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getMaxDegree() {
        return maxDegree;
    }

    public void setMaxDegree(String maxDegree) {
        this.maxDegree = maxDegree;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public String getCouConnTel() {
        return couConnTel;
    }

    public void setCouConnTel(String couConnTel) {
        this.couConnTel = couConnTel;
    }

    public String getCouMoble() {
        return couMoble;
    }

    public void setCouMoble(String couMoble) {
        this.couMoble = couMoble;
    }

    public String getCouCertType() {
        return couCertType;
    }

    public void setCouCertType(String couCertType) {
        this.couCertType = couCertType;
    }

    public String getCouCertNo() {
        return couCertNo;
    }

    public void setCouCertNo(String couCertNo) {
        this.couCertNo = couCertNo;
    }

    public String getCouCustNo() {
        return couCustNo;
    }

    public void setCouCustNo(String couCustNo) {
        this.couCustNo = couCustNo;
    }

    public String getCouWokgUnitNm() {
        return couWokgUnitNm;
    }

    public void setCouWokgUnitNm(String couWokgUnitNm) {
        this.couWokgUnitNm = couWokgUnitNm;
    }

    public String getCouWokgUnitAddr() {
        return couWokgUnitAddr;
    }

    public void setCouWokgUnitAddr(String couWokgUnitAddr) {
        this.couWokgUnitAddr = couWokgUnitAddr;
    }

    public String getCouWokgUnitTel() {
        return couWokgUnitTel;
    }

    public void setCouWokgUnitTel(String couWokgUnitTel) {
        this.couWokgUnitTel = couWokgUnitTel;
    }

    public String getNtEconSec() {
        return ntEconSec;
    }

    public void setNtEconSec(String ntEconSec) {
        this.ntEconSec = ntEconSec;
    }

    public String getOccCode() {
        return occCode;
    }

    public void setOccCode(String occCode) {
        this.occCode = occCode;
    }

    public String getOrigPlace() {
        return origPlace;
    }

    public void setOrigPlace(String origPlace) {
        this.origPlace = origPlace;
    }

    public String getIndivComNo() {
        return indivComNo;
    }

    public void setIndivComNo(String indivComNo) {
        this.indivComNo = indivComNo;
    }

    public String getIndivZipCode() {
        return indivZipCode;
    }

    public void setIndivZipCode(String indivZipCode) {
        this.indivZipCode = indivZipCode;
    }

    public String getRsdCond() {
        return rsdCond;
    }

    public void setRsdCond(String rsdCond) {
        this.rsdCond = rsdCond;
    }

    public String getOccuType() {
        return occuType;
    }

    public void setOccuType(String occuType) {
        this.occuType = occuType;
    }

    public String getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(String techLevel) {
        this.techLevel = techLevel;
    }

    public String getJobPosn() {
        return jobPosn;
    }

    public void setJobPosn(String jobPosn) {
        this.jobPosn = jobPosn;
    }

    public String getIndivComName() {
        return indivComName;
    }

    public void setIndivComName(String indivComName) {
        this.indivComName = indivComName;
    }

    public String getIndivComTel() {
        return indivComTel;
    }

    public void setIndivComTel(String indivComTel) {
        this.indivComTel = indivComTel;
    }

    public String getIndivComChara() {
        return indivComChara;
    }

    public void setIndivComChara(String indivComChara) {
        this.indivComChara = indivComChara;
    }

    public String getIndivComAddr() {
        return indivComAddr;
    }

    public void setIndivComAddr(String indivComAddr) {
        this.indivComAddr = indivComAddr;
    }

    public BigDecimal getInuvYrRev() {
        return inuvYrRev;
    }

    public void setInuvYrRev(BigDecimal inuvYrRev) {
        this.inuvYrRev = inuvYrRev;
    }

    public BigDecimal getPrsnMonIncom() {
        return prsnMonIncom;
    }

    public void setPrsnMonIncom(BigDecimal prsnMonIncom) {
        this.prsnMonIncom = prsnMonIncom;
    }

    public BigDecimal getFmlyMonIncom() {
        return fmlyMonIncom;
    }

    public void setFmlyMonIncom(BigDecimal fmlyMonIncom) {
        this.fmlyMonIncom = fmlyMonIncom;
    }

    public String getWhthFarmer() {
        return whthFarmer;
    }

    public void setWhthFarmer(String whthFarmer) {
        this.whthFarmer = whthFarmer;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCiEntpCrdg() {
        return ciEntpCrdg;
    }

    public void setCiEntpCrdg(String ciEntpCrdg) {
        this.ciEntpCrdg = ciEntpCrdg;
    }

    public String getCiEntpCrdgLevelcount() {
        return ciEntpCrdgLevelcount;
    }

    public void setCiEntpCrdgLevelcount(String ciEntpCrdgLevelcount) {
        this.ciEntpCrdgLevelcount = ciEntpCrdgLevelcount;
    }

    public BigDecimal getLnPd() {
        return lnPd;
    }

    public void setLnPd(BigDecimal lnPd) {
        this.lnPd = lnPd;
    }

    public BigDecimal getLnLgd() {
        return lnLgd;
    }

    public void setLnLgd(BigDecimal lnLgd) {
        this.lnLgd = lnLgd;
    }

    public BigDecimal getLnEad() {
        return lnEad;
    }

    public void setLnEad(BigDecimal lnEad) {
        this.lnEad = lnEad;
    }

    public BigDecimal getLnUl() {
        return lnUl;
    }

    public void setLnUl(BigDecimal lnUl) {
        this.lnUl = lnUl;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardBankNo() {
        return cardBankNo;
    }

    public void setCardBankNo(String cardBankNo) {
        this.cardBankNo = cardBankNo;
    }

    public String getCustSts() {
        return custSts;
    }

    public void setCustSts(String custSts) {
        this.custSts = custSts;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}

