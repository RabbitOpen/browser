package com.jdd.fintech.megrez.loan.core.common.submit.model.credit;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * 用户信息
 * @author xiaoqianbin
 * @date 2020/4/28
 **/
@Format(split = "$")
public class UserInfo {

    /**
     * 客户编号，加前缀JD
     */
    @Column(order = 0, comment = "客户编号", length = 30)
    private String customerid;

    /**
     * 姓名
     */
    @Column(order = 1, comment = "姓名", length = 30)
    private String customerName;

    /**
     * 0-身份证；
     * 1-户口簿；
     * 2-护照；
     * 3-军官证；
     * 4-士兵证；
     * 5-港澳居民来往内地通行证；
     * 6-台湾同胞来往内地通行证；
     * 7-临时身份证；
     * 8-外国人居留证；
     * 9-警官证；
     * A-香港身份证；
     * B-澳门身份证；
     * C-台湾身份证；
     * X-其他证件。
     */
    @Column(order = 2, comment = "证件类型", length = 1)
    private String certType = "0";

    /**
     * 证件号码
     */
    @Column(order = 3, comment = "证件号码", length = 18)
    private String certNo;

    /**
     * 0-未知的性别；
     * 1-男性；
     * 2-女性；
     * 9-未说明性别
     */
    @Column(order = 4, comment = "性别", length = 1)
    private String gender;

    /**
     * 出生日期
     */
    @Column(order = 5, comment = "出生日期", length = 10)
    private String birthDay;

    /**
     * 10-未婚；
     * 20-已婚；
     * 21-初婚；
     * 22-再婚；
     * 23-复婚；
     * 30-丧偶；
     * 40-离婚；
     * 90-未说明的婚姻状况。
     */
    @Column(order = 6, comment = "婚姻状况", length = 2)
    private String marryStatus = "90";

    /**
     * 10-研究生；
     * 20-大学本科（简称“大学”）；
     * 30-大学专科和专科学校（简称“大专”）；
     * 40-中等专业学校或中等技术学校；
     * 50-技术学校；
     * 60-高中；
     * 70-初中；
     * 80-小学；
     * 90-文盲或半文盲；
     * 99-未知。
     */
    @Column(order = 7, comment = "最高学历", length = 2)
    private String hxl = "99";

    /**
     * 0-其他；
     * 1-名誉博士；
     * 2-博士；
     * 3-硕士；
     * 4-学士；
     * 9-未知。
     */
    @Column(order = 8, comment = "最高学位", length = 1)
    private String hxw = "9";

    /**
     * 住宅电话
     */
    @Column(order = 9, comment = "住宅电话", length = 25)
    private String b3115;

    /**
     * 手机号码
     */
    @Column(order = 10, comment = "手机号码", length = 16)
    private String mobile;

    /**
     * 单位电话
     */
    @Column(order = 11, comment = "单位电话", length = 25)
    private String b3119;

    /**
     * 电子邮箱
     */
    @Column(order = 12, comment = "电子邮箱", length = 30)
    private String email;

    /**
     * 包含省市县（区）等详细信息。
     */
    @Column(order = 13, comment = "通讯地址", length = 60)
    private String addr;

    /**
     * 通讯地址邮政编码
     */
    @Column(order = 14, comment = "通讯地址邮政编码", length = 6)
    private String addrCode;

    /**
     * 包含省市县（区）等详细信息。
     */
    @Column(order = 15, comment = "户籍地址", length = 60)
    private String certAddr;

    /**
     * 配偶姓名
     */
    @Column(order = 16, comment = "配偶姓名", length = 30)
    private String b5204;

    /**
     * 同上证件类型
     */
    @Column(order = 17, comment = "配偶证件类型", length = 1)
    private String b5208;

    /**
     * 配偶证件号码
     */
    @Column(order = 18, comment = "配偶证件号码", length = 18)
    private String b5210;

    /**
     * 配偶工作单位
     */
    @Column(order = 19, comment = "配偶工作单位", length = 60)
    private String b5206;

    /**
     * 配偶联系电话
     */
    @Column(order = 20, comment = "配偶联系电话", length = 25)
    private String b3111;

    /**
     * 0-国家机关、党群组织、企业、事业单位负责人；
     * 1-专业技术人员；
     * 3-办事人员和有关人员；
     * 4-商业、服务业人员；
     * 5-农、林、牧、渔、水利业生产人员；
     * 6-生产、运输设备操作人员及有关人员；
     * X-军人；
     * Y-不便分类的其他从业人员；
     * Z-未知。
     */
    @Column(order = 21, comment = "职业", length = 1)
    private String occupation = "Z";

    /**
     * 单位名称
     */
    @Column(order = 22, comment = "单位名称", length = 60)
    private String companyName;

    /**
     * A-农、林、牧、渔业；
     * B-采掘业；
     * C-制造业；
     * D-电力、燃气及水的生产和供应业；
     * E-建筑业；
     * F-交通运输、仓储和邮政业；
     * G-信息传输、计算机服务和软件业；
     * H-批发和零售业；
     * I-住宿和餐饮业；
     * J-金融业；
     * K-房地产业；
     * L-租赁和商务服务业；
     * M-科学研究、技术服务业和地质勘察业；
     * N-水利、环境和公共设施管理业；
     * O-居民服务和其他服务业；
     * P-教育；
     * Q-卫生、社会保障和社会福利业；
     * R-文化、体育和娱乐业；
     * S-公共管理和社会组织；
     * T-国际组织；
     * Z-未知。
     */
    @Column(order = 23, comment = "单位所属行业", length = 1)
    private String c6103 = "Z";

    /**
     * 单位地址
     */
    @Column(order = 24, comment = "单位地址", length = 60)
    private String c3133;

    /**
     * 包含省市县（区）等详细信息。
     */
    @Column(order = 25, comment = "单位地址邮政编码", length = 6)
    private String c3129;

    /**
     * 四位年：YYYY
     */
    @Column(order = 26, comment = "本单位工作起始年份", length = 4)
    private String c2109;

    /**
     * 1-高级领导（行政级别局级及局级以上领导或大公司高级管理人员）；
     * 2-中级领导（行政级别局级以下领导或大公司中级管理人员）；
     * 3-一般员工；
     * 4-其他；
     * 9-未知。
     */
    @Column(order = 27, comment = "职务", length = 1)
    private String c5121 = "9";

    /**
     * 0-无；
     * 1-高级；
     * 2-中级；
     * 3-初级；
     * 9-未知。
     */
    @Column(order = 28, comment = "职称", length = 1)
    private String c5123 = "9";

    /**
     * 年收入
     */
    @Column(order = 29, comment = "年收入")
    private BigDecimal c5125;

    /**
     * 工资帐号
     */
    @Column(order = 30, comment = "工资帐号", length = 14)
    private String c7123;

    /**
     * 工资账户开户银行
     */
    @Column(order = 31, comment = "工资账户开户银行", length = 60)
    private String c6105;

    /**
     * 包含省市县（区）等详细信息
     */
    @Column(order = 32, comment = "居住地址", length = 60)
    private String homeAddr;

    /**
     * 居住地址邮政编码
     */
    @Column(order = 33, comment = "居住地址邮政编码", length = 6)
    private String d3121 = "999999";

    /**
     * 1-自置；
     * 2-按揭；
     * 3-亲属楼宇；
     * 4-集体宿舍；
     * 5-租房；
     * 6-共有住宅；
     * 7-其他；
     * 9-未知。
     */
    @Column(order = 34, comment = "居住状况", length = 1)
    private String d5127 = "9";

    /**
     * 管户人， 可为空
     */
    @Column(order = 35, comment = "管户人", length = 20)
    private String operator;

    /**
     * 管户机构， 可为空
     */
    @Column(order = 36, comment = "管户机构", length = 20)
    private String operorgid;


    public String getCustomerid() {
        return "JD" + customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
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

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(String marryStatus) {
        this.marryStatus = marryStatus;
    }

    public String getHxl() {
        return hxl;
    }

    public void setHxl(String hxl) {
        this.hxl = hxl;
    }

    public String getHxw() {
        return hxw;
    }

    public void setHxw(String hxw) {
        this.hxw = hxw;
    }

    public String getB3115() {
        return b3115;
    }

    public void setB3115(String b3115) {
        this.b3115 = b3115;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getB3119() {
        return b3119;
    }

    public void setB3119(String b3119) {
        this.b3119 = b3119;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddrCode() {
        return addrCode;
    }

    public void setAddrCode(String addrCode) {
        this.addrCode = addrCode;
    }

    public String getCertAddr() {
        return certAddr;
    }

    public void setCertAddr(String certAddr) {
        this.certAddr = certAddr;
    }

    public String getB5204() {
        return b5204;
    }

    public void setB5204(String b5204) {
        this.b5204 = b5204;
    }

    public String getB5208() {
        return b5208;
    }

    public void setB5208(String b5208) {
        this.b5208 = b5208;
    }

    public String getB5210() {
        return b5210;
    }

    public void setB5210(String b5210) {
        this.b5210 = b5210;
    }

    public String getB5206() {
        return b5206;
    }

    public void setB5206(String b5206) {
        this.b5206 = b5206;
    }

    public String getB3111() {
        return b3111;
    }

    public void setB3111(String b3111) {
        this.b3111 = b3111;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getC6103() {
        return c6103;
    }

    public void setC6103(String c6103) {
        this.c6103 = c6103;
    }

    public String getC3133() {
        return c3133;
    }

    public void setC3133(String c3133) {
        this.c3133 = c3133;
    }

    public String getC3129() {
        return c3129;
    }

    public void setC3129(String c3129) {
        this.c3129 = c3129;
    }

    public String getC2109() {
        return c2109;
    }

    public void setC2109(String c2109) {
        this.c2109 = c2109;
    }

    public String getC5121() {
        return c5121;
    }

    public void setC5121(String c5121) {
        this.c5121 = c5121;
    }

    public String getC5123() {
        return c5123;
    }

    public void setC5123(String c5123) {
        this.c5123 = c5123;
    }

    public BigDecimal getC5125() {
        return c5125;
    }

    public void setC5125(BigDecimal c5125) {
        this.c5125 = c5125;
    }

    public String getC7123() {
        return c7123;
    }

    public void setC7123(String c7123) {
        this.c7123 = c7123;
    }

    public String getC6105() {
        return c6105;
    }

    public void setC6105(String c6105) {
        this.c6105 = c6105;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getD3121() {
        return d3121;
    }

    public void setD3121(String d3121) {
        this.d3121 = d3121;
    }

    public String getD5127() {
        return d5127;
    }

    public void setD5127(String d5127) {
        this.d5127 = d5127;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperorgid() {
        return operorgid;
    }

    public void setOperorgid(String operorgid) {
        this.operorgid = operorgid;
    }
}
