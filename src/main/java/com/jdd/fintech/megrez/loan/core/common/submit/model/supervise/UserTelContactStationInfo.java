package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 电话联系点
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserTelContactStationInfo {

    /**
     * 联系点ID
     */
    @Column(order = 0, comment = "联系点ID", length = 32, canBeEmpty = false)
    private String stationId;

    /**
     * 电话分类代码
     */
    @Column(order = 1, comment = "电话分类代码", length = 32, canBeEmpty = true)
    private String telephoneClassCode;

    /**
     * 区号
     */
    @Column(order = 2, comment = "区号", length = 32, canBeEmpty = true)
    private String areaCode;

    /**
     * 电话号
     */
    @Column(order = 3, comment = "电话号", length = 32, canBeEmpty = true)
    private String telephone;

    /**
     * 创建日期
     */
    @Column(order = 4, comment = "创建日期", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 5, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * 修改日期
     */
    @Column(order = 6, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 7, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 8, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 9, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getTelephoneClassCode() {
        return telephoneClassCode;
    }

    public void setTelephoneClassCode(String telephoneClassCode) {
        this.telephoneClassCode = telephoneClassCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
