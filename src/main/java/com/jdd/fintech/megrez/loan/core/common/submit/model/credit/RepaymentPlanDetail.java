package com.jdd.fintech.megrez.loan.core.common.submit.model.credit;

import com.jdd.fintech.megrez.loan.core.common.submit.exception.SubmitBusinessException;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;
import com.jdd.fintech.megrez.loan.framework.enums.repay.RepaymentStatusEnum;
import com.jdd.fintech.megrez.loan.framework.utils.DateUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 征信报送，还款计划明细
 * @author xiaoqianbin
 * @date 2020/4/28
 **/
@Format(split = "$")
public class RepaymentPlanDetail {

    /**
     * 贷款业务号
     */
    @Column(order = 0, comment = "贷款业务号", length = 40)
    private String accountno;

    /**
     * 还款计划编码
     * @author  xiaoqianbin
     * @date    2020/4/30
     **/
    private String repaymentPlanCode;

    private String productCode;

    // 还款状态
    private String repaymentStatus;

    // 产品参数里配置的宽限天数
    private Integer graceDays;

    /**
     * 应还款日期
     */
    @Column(order = 1, comment = "应还款日期", length = 10)
    private String paydate;

    /**
     * 宽限期最后一天
     */
    @Column(order = 2, comment = "宽限期最后一天", length = 10)
    private String periodpaydate;

    /**
     * 应还本金
     */
    @Column(order = 3, comment = "应还本金")
    private BigDecimal paycorp;

    /**
     * 应还利息
     */
    @Column(order = 4, comment = "应还利息")
    private BigDecimal payinte;

    /**
     * 应还本金罚息
     */
    @Column(order = 5, comment = "应还本金罚息")
    private BigDecimal paycorpfine;

    /**
     * 应还利息罚息
     */
    @Column(order = 6, comment = "应还利息罚息")
    private BigDecimal payintefine;

    /**
     * 实际还款日期
     */
    @Column(order = 7, comment = "实际还款日期", length = 10)
    private String actualpaydate;

    /**
     * 实还本金
     */
    @Column(order = 8, comment = "实还本金")
    private BigDecimal actualcorp;

    /**
     * 实还利息
     */
    @Column(order = 9, comment = "实还利息")
    private BigDecimal actualinte;

    /**
     * 实还本金罚息
     */
    @Column(order = 10, comment = "实还本金罚息")
    private BigDecimal actualcorpfine;

    /**
     * 实还利息罚息
     */
    @Column(order = 11, comment = "实还利息罚息")
    private BigDecimal actualintefine;

    /**
     * 0-本期结清
     * 1-本期未结清
     */
    @Column(order = 12, comment = "本期结清标志", length = 1)
    private String payoffstatus;

    /**
     * 导入日期
     */
    @Column(order = 13, comment = "导入日期", length = 10)
    private String inputdate;

    /**
     * 数据修改日期
     * @author  xiaoqianbin
     * @date    2020/4/30
     **/
    private Date operateTime;

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getAccountno() {
        return "JD" + accountno;
    }

    public String getPaydate() {
        return paydate;
    }

    public String getPeriodpaydate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = dateFormat.parse(getPaydate());
            return  dateFormat.format(DateUtil.getAddNDay(date, getGraceDays()));
        } catch (ParseException e) {
            throw new SubmitBusinessException(e.getMessage());
        }
    }

    public BigDecimal getPaycorp() {
        return paycorp;
    }

    public BigDecimal getPayinte() {
        return payinte;
    }

    public BigDecimal getPaycorpfine() {
        return paycorpfine;
    }

    public BigDecimal getPayintefine() {
        return payintefine;
    }

    public String getActualpaydate() {
        return actualpaydate;
    }

    public BigDecimal getActualcorp() {
        return actualcorp;
    }

    public BigDecimal getActualinte() {
        return actualinte;
    }

    public BigDecimal getActualcorpfine() {
        return actualcorpfine;
    }

    public BigDecimal getActualintefine() {
        return actualintefine;
    }

    public String getPayoffstatus() {

        return RepaymentStatusEnum.SETTLE.name().equals(getRepaymentStatus()) ? "0" : "1";
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getRepaymentPlanCode() {
        return repaymentPlanCode;
    }

    public void setRepaymentPlanCode(String repaymentPlanCode) {
        this.repaymentPlanCode = repaymentPlanCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public void setPeriodpaydate(String periodpaydate) {
        this.periodpaydate = periodpaydate;
    }

    public void setPaycorp(BigDecimal paycorp) {
        this.paycorp = paycorp;
    }

    public void setPayinte(BigDecimal payinte) {
        this.payinte = payinte;
    }

    public void setPaycorpfine(BigDecimal paycorpfine) {
        this.paycorpfine = paycorpfine;
    }

    public void setPayintefine(BigDecimal payintefine) {
        this.payintefine = payintefine;
    }

    public void setActualpaydate(String actualpaydate) {
        this.actualpaydate = actualpaydate;
    }

    public void setActualcorp(BigDecimal actualcorp) {
        this.actualcorp = actualcorp;
    }

    public void setActualinte(BigDecimal actualinte) {
        this.actualinte = actualinte;
    }

    public void setActualcorpfine(BigDecimal actualcorpfine) {
        this.actualcorpfine = actualcorpfine;
    }

    public void setActualintefine(BigDecimal actualintefine) {
        this.actualintefine = actualintefine;
    }

    public void setPayoffstatus(String payoffstatus) {
        this.payoffstatus = payoffstatus;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }
}
