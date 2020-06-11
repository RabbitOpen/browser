package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 用户证件信息
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserCertificateInfo {

    /**
     * 存储什么内容，生成规则
     */
    @Column(order = 0, comment = "资源项ID", length = 32, canBeEmpty = false)
    private String resourceId;

    /**
     * 存储什么内容，生成规则
     */
    @Column(order = 1, comment = "登记ID", length = 32, canBeEmpty = true)
    private String registerId;

    /**
     * 证件名称
     */
    @Column(order = 2, comment = "名称", length = 32, canBeEmpty = true)
    private String certificateName;

    /**
     * 编号
     */
    @Column(order = 3, comment = "编号", length = 32, canBeEmpty = false)
    private String certificateNo;

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
    @Column(order = 4, comment = "证件项类型", length = 2, canBeEmpty = false)
    private String certificateKind;

    /**
     * 发证日期
     */
    @Column(order = 5, comment = "发证日期", length = 26, canBeEmpty = true)
    private String publishDate;

    /**
     * 结束有效日期
     */
    @Column(order = 6, comment = "结束有效日期", length = 26, canBeEmpty = true)
    private String invalidDate;

    /**
     * 证件状态 ：[参考枚举：EnumResourceStatus]
     */
    @Column(order = 7, comment = "证件状态", length = 1, canBeEmpty = true)
    private String certificateStatus;

    /**
     * 发证机构
     */
    @Column(order = 8, comment = "发证机构", length = 32, canBeEmpty = true)
    private String issuanceOrg;

    /**
     * 32->400
     */
    @Column(order = 9, comment = "证件地址", length = 400, canBeEmpty = true)
    private String certificateAddress;

    /**
     * 年检日期
     */
    @Column(order = 10, comment = "年检日期", length = 26, canBeEmpty = true)
    private String certificateCheckValidDate;

    /**
     * 创建日期
     */
    @Column(order = 11, comment = "创建日期", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 12, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * 修改日期
     */
    @Column(order = 13, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 14, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 15, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 16, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getCertificateKind() {
        return certificateKind;
    }

    public void setCertificateKind(String certificateKind) {
        this.certificateKind = certificateKind;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public String getIssuanceOrg() {
        return issuanceOrg;
    }

    public void setIssuanceOrg(String issuanceOrg) {
        this.issuanceOrg = issuanceOrg;
    }

    public String getCertificateAddress() {
        return certificateAddress;
    }

    public void setCertificateAddress(String certificateAddress) {
        this.certificateAddress = certificateAddress;
    }

    public String getCertificateCheckValidDate() {
        return certificateCheckValidDate;
    }

    public void setCertificateCheckValidDate(String certificateCheckValidDate) {
        this.certificateCheckValidDate = certificateCheckValidDate;
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

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
