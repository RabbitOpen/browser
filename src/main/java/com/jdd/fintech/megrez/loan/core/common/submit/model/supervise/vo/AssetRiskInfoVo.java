package com.jdd.fintech.megrez.loan.core.common.submit.model.supervise.vo;

/**
 * @auther yuanjingshen
 * @date 2020/5/2 15:37
 * @desc 风险信息实体
 */
public class AssetRiskInfoVo {
    private Long id;
    //借据号
    private String iouCode;
    //用户id
    private String userId;
    //产品编号
    private String productCode;
    //风险等级
    private String riskLevel;
    //认定时间
    private String tradeTime;
    //四级分类标识
    private String fourLevelType;
    //认定类型（0.系统  1.人工）
    private String tradeType;
    //是否已结清（0.否  1.是）
    private String isSettled;
    //原五级形态
    private String oldRiskLevel;
    //新五级形态
    private String newRiskLevel;
    //变动方式（0.自动  1.人工）
    private String changeType;

    public String getFourLevelType() {
        return fourLevelType;
    }

    public void setFourLevelType(String fourLevelType) {
        this.fourLevelType = fourLevelType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(String isSettled) {
        this.isSettled = isSettled;
    }

    public String getOldRiskLevel() {
        return oldRiskLevel;
    }

    public void setOldRiskLevel(String oldRiskLevel) {
        this.oldRiskLevel = oldRiskLevel;
    }

    public String getNewRiskLevel() {
        return newRiskLevel;
    }

    public void setNewRiskLevel(String newRiskLevel) {
        this.newRiskLevel = newRiskLevel;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }
}
