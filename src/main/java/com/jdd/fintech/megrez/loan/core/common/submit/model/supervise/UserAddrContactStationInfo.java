package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise;

import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

/**
 * 地址联系点
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Format(prefix = "\"", suffix = "\"", split = ",")
public class UserAddrContactStationInfo {

    /**
     * 联系点ID
     */
    @Column(order = 0, comment = "联系点ID", length = 32, canBeEmpty = false)
    private String stationId;

    /**
     * ("11", "注册地址"),
     * ("12", "经营地址"),
     * ("13", "行政区域"),
     * ("21", "单位地址"),
     * ("22", "住宅地址"),
     * ("23", "户籍地址"),
     * ("24", "证件地址"),
     * ("25", "学校地址"),
     * ("31", "邮政信箱"),
     * ("32", "通信地址"),
     * ("33", "其他地址"),
     * ("34", "自有房产地址
     */
    @Column(order = 1, comment = "地址分类代码", length = 32, canBeEmpty = true)
    private String addressClassCode;

    /**
     * 省
     */
    @Column(order = 2, comment = "省", length = 32, canBeEmpty = true)
    private String provinceCode;

    /**
     * 市
     */
    @Column(order = 3, comment = "市", length = 32, canBeEmpty = true)
    private String cityCode;

    /**
     * 全地址
     */
    @Column(order = 4, comment = "全地址", length = 256, canBeEmpty = true)
    private String address;

    /**
     * 经度
     */
    @Column(order = 5, comment = "经度", length = 32, canBeEmpty = true)
    private String longitude;

    /**
     * 纬度
     */
    @Column(order = 6, comment = "纬度", length = 32, canBeEmpty = true)
    private String latitude;

    /**
     * 所属名称
     */
    @Column(order = 7, comment = "所属名称", length = 32, canBeEmpty = true)
    private String ascription;

    /**
     * 邮政编码
     */
    @Column(order = 8, comment = "邮政编码", length = 32, canBeEmpty = true)
    private String zipcode;

    /**
     * 区
     */
    @Column(order = 9, comment = "区", length = 255, canBeEmpty = true)
    private String area;

    /**
     * 国家
     */
    @Column(order = 10, comment = "国家", length = 32, canBeEmpty = true)
    private String nationality;

    /**
     * 居住情况
     */
    @Column(order = 11, comment = "居住情况", length = 1, canBeEmpty = true)
    private String liveCondition;

    /**
     * 是否收货地址
     */
    @Column(order = 12, comment = "是否收货地址", length = 1, canBeEmpty = true)
    private String consigneeStationFlag;

    /**
     * 收货人信息ID
     */
    @Column(order = 13, comment = "收货人信息ID", length = 32, canBeEmpty = true)
    private String consigneeInfoId;

    /**
     * 创建日期
     */
    @Column(order = 14, comment = "创建日期", length = 26, canBeEmpty = true)
    private String createTime;

    /**
     * 创建人
     */
    @Column(order = 15, comment = "创建人", length = 32, canBeEmpty = true)
    private String creator;

    /**
     * 修改日期
     */
    @Column(order = 16, comment = "修改日期", length = 26, canBeEmpty = true)
    private String updateTime;

    /**
     * 修改人
     */
    @Column(order = 17, comment = "修改人", length = 32, canBeEmpty = true)
    private String modifier;

    /**
     * 租户ID
     */
    @Column(order = 18, comment = "租户ID", length = 32, canBeEmpty = false)
    private String tenantId;

    /**
     * 来源系统名称
     * ICCS--互联网信贷系统
     * anyRCS--零售智能贷系统
     * AMCS--北研资管平台
     */
    @Column(order = 19, comment = "源系统标识", length = 8, canBeEmpty = false)
    private String sourceId;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getAddressClassCode() {
        return addressClassCode;
    }

    public void setAddressClassCode(String addressClassCode) {
        this.addressClassCode = addressClassCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAscription() {
        return ascription;
    }

    public void setAscription(String ascription) {
        this.ascription = ascription;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLiveCondition() {
        return liveCondition;
    }

    public void setLiveCondition(String liveCondition) {
        this.liveCondition = liveCondition;
    }

    public String getConsigneeStationFlag() {
        return consigneeStationFlag;
    }

    public void setConsigneeStationFlag(String consigneeStationFlag) {
        this.consigneeStationFlag = consigneeStationFlag;
    }

    public String getConsigneeInfoId() {
        return consigneeInfoId;
    }

    public void setConsigneeInfoId(String consigneeInfoId) {
        this.consigneeInfoId = consigneeInfoId;
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

