package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 联系点表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserContactStationInfo {

    /**
     * 联系点ID
     */
    @Column(order = 0, comment = "联系点ID", length = 32, canBeEmpty = false)
    private String stationId;

    /**
     * 客户角色ID
     */
    @Column(order = 1, comment = "客户角色ID", length = 32, canBeEmpty = true)
    private String custRoleId;

    /**
     * 客户ID
     */
    @Column(order = 2, comment = "客户ID", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 联系点类型
     */
    @Column(order = 3, comment = "联系点类型", length = 1, canBeEmpty = true)
    private String contactStationType;

    /**
     * 联系点状态
     */
    @Column(order = 4, comment = "联系点状态", length = 1, canBeEmpty = true)
    private String contactStationStatus;

    /**
     * 是否默认联系点
     */
    @Column(order = 5, comment = "是否默认联系点", length = 1, canBeEmpty = true)
    private String defaultStationFlag;

    /**
     * 是否验证
     */
    @Column(order = 6, comment = "是否验证", length = 1, canBeEmpty = true)
    private String validateFlag;

    /**
     * COMMENT
     */
    @Column(order = 7, comment = "COMMENT", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 8, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * COMMENT
     */
    @Column(order = 9, comment = "COMMENT", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 10, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 11, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 12, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getCustRoleId() {
        return custRoleId;
    }

    public void setCustRoleId(String custRoleId) {
        this.custRoleId = custRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContactStationType() {
        return contactStationType;
    }

    public void setContactStationType(String contactStationType) {
        this.contactStationType = contactStationType;
    }

    public String getContactStationStatus() {
        return contactStationStatus;
    }

    public void setContactStationStatus(String contactStationStatus) {
        this.contactStationStatus = contactStationStatus;
    }

    public String getDefaultStationFlag() {
        return defaultStationFlag;
    }

    public void setDefaultStationFlag(String defaultStationFlag) {
        this.defaultStationFlag = defaultStationFlag;
    }

    public String getValidateFlag() {
        return validateFlag;
    }

    public void setValidateFlag(String validateFlag) {
        this.validateFlag = validateFlag;
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
