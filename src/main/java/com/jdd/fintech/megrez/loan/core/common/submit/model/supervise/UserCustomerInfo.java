package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 客户信息表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserCustomerInfo {

    /**
     * 客户ID
     */
    @Column(order = 0, comment = "客户ID", length = 32, canBeEmpty = false)
    private String userId;

    /**
     * 客户类型
     */
    @Column(order = 1, comment = "客户类型", length = 3, canBeEmpty = false)
    private String clientCategory;

    /**
     * 激活状态
     */
    @Column(order = 2, comment = "激活状态", length = 1, canBeEmpty = true)
    private String activeStatus;

    /**
     * 记录状态
     */
    @Column(order = 3, comment = "记录状态", length = 1, canBeEmpty = true)
    private String recordStatus;

    /**
     * 是否关系人客户
     */
    @Column(order = 4, comment = "是否关系人客户", length = 1, canBeEmpty = true)
    private String custPartnerFlag;

    /**
     * 名单状态
     */
    @Column(order = 5, comment = "名单状态", length = 1, canBeEmpty = true)
    private String listStatus;

    /**
     * 客户经理ID
     */
    @Column(order = 6, comment = "客户经理ID", length = 32, canBeEmpty = false)
    private String custManagerId;

    /**
     * 客户经理类型
     */
    @Column(order = 7, comment = "客户经理类型", length = 1, canBeEmpty = true)
    private String managerType;

    /**
     * 信用等级
     */
    @Column(order = 8, comment = "信用等级", length = 16, canBeEmpty = true)
    private String creditLevel;

    /**
     * 实名认证标志
     */
    @Column(order = 9, comment = "实名认证标志", length = 1, canBeEmpty = true)
    private String realnameFlag;

    /**
     * 创建日期
     */
    @Column(order = 10, comment = "创建日期", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 11, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * 修改日期
     */
    @Column(order = 12, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 13, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 14, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 源系统的来源表名
     */
    @Column(order = 15, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getCustPartnerFlag() {
        return custPartnerFlag;
    }

    public void setCustPartnerFlag(String custPartnerFlag) {
        this.custPartnerFlag = custPartnerFlag;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public String getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(String custManagerId) {
        this.custManagerId = custManagerId;
    }

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    public String getRealnameFlag() {
        return realnameFlag;
    }

    public void setRealnameFlag(String realnameFlag) {
        this.realnameFlag = realnameFlag;
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
