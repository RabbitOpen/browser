package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 客户资源项关系表
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserCustomerResourceRelation {

    /**
     * 资源项ID
     */
    @Column(order = 0, comment = "资源项ID", length = 32, canBeEmpty = false)
    private String resourceId;

    /**
     * 客户ID
     */
    @Column(order = 1, comment = "客户ID", length = 32, canBeEmpty = true)
    private String userId;

    /**
     * 资源项类型
     */
    @Column(order = 2, comment = "资源项类型", length = 2, canBeEmpty = true)
    private String resourceType;

    /**
     * 客户资源状态
     */
    @Column(order = 3, comment = "客户资源状态", length = 1, canBeEmpty = true)
    private String clientResourceStatus;

    /**
     * 资源项来源
     */
    @Column(order = 4, comment = "资源项来源", length = 32, canBeEmpty = true)
    private String resourceSource;

    /**
     * 创建日期
     */
    @Column(order = 5, comment = "创建日期", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 6, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * 修改日期
     */
    @Column(order = 7, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 8, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 9, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 10, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getClientResourceStatus() {
        return clientResourceStatus;
    }

    public void setClientResourceStatus(String clientResourceStatus) {
        this.clientResourceStatus = clientResourceStatus;
    }

    public String getResourceSource() {
        return resourceSource;
    }

    public void setResourceSource(String resourceSource) {
        this.resourceSource = resourceSource;
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
