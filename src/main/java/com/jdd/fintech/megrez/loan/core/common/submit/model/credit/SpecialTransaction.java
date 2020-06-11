package com.jdd.fintech.megrez.loan.core.common.submit.model.credit;

import com.jdd.fintech.megrez.loan.core.api.enums.RevertedTypeEnum;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Column;
import com.jdd.fintech.megrez.loan.core.common.submit.model.anno.Format;

import java.math.BigDecimal;

/**
 * 征信上报，特殊交易
 * @author xiaoqianbin
 * @date 2020/4/28
 **/
@Format(split = "$")
public class SpecialTransaction {

    /**
     * 对应信贷的借据编号、核心的贷款账号，个人征信上报的账号。唯一且不能变更。
     */
    @Column(order = 0, comment = "贷款业务号", length = 40)
    private String accountno;

    /**
     * 特殊交易行为的实际发生日期。
     * 格式为YYYY/MM/DD。
     * 当特殊交易类型为“9-其他”时，此数据项表示数据报送机构记录该笔特殊交易的日期。
     */
    @Column(order = 1, comment = "发生日期", length = 10)
    private String occuredate;

    /**
     * 代码表：
     * 1-展期（延期）；
     * 2-担保人代还；
     * 3-以资抵债；
     * 4-提前还款（部分）；
     * 5-提前还款（全部）；
     * 9-其他。
     */
    @Column(order = 2, comment = "特殊交易类型", length = 1)
    private String specbusitype;

    // 还款类型
    private String revertType;

    // 还款总额
    private BigDecimal repaymentTotal;

    // 还款本金
    private BigDecimal prplAmt;

    // 未还本金
    private BigDecimal unRepayPrplAmt;

    /**
     * 此数据项填写新的还款月数和发生此特殊交易前的还款月数的差值。用正、负数、0分别表示延长、缩短还款期限和还款期限没有变化。数值向上取整。
     */
    @Column(order = 3, comment = "变更月数", length = 3)
    private String changemonths;

    /**
     * 特殊交易类型为展期时，表示展期时的贷款余额；
     * 特殊交易类型为提前还款时，表示提前归还的本金；
     * 特殊交易类型为担保人代还时，表示担保人还款金额；
     * 特殊交易类型为以资抵债时，表示以资抵债金额；
     * 特殊交易类型为其他时，填相应发生金额。
     */
    @Column(order = 4, comment = "发生金额")
    private BigDecimal specbusisum;

    /**
     * 发生特殊交易时，给出特殊交易说明，例如：发生展期时，还款月数变更差值，发生金额等信息。此数据项不方便给出时，可以给空值。
     */
    @Column(order = 5, comment = "明细信息", length = 200)
    private String specbusidetail;

    /**
     * 1-已上报；
     * 2-未上报；
     * 3-不再上报（系统设定）；
     * 4-不再上报（人工设定）；
     */
    @Column(order = 6, comment = "上报标识", length = 1)
    private String reportflag = "2";

    public SpecialTransaction() {
    }

    public SpecialTransaction(String accountno, String specbusitype, BigDecimal prplAmt) {
        this.accountno = accountno;
        this.specbusitype = specbusitype;
        this.prplAmt = prplAmt;
    }

    public String getAccountno() {
        return "JD" + accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getOccuredate() {
        return occuredate;
    }

    public void setOccuredate(String occuredate) {
        this.occuredate = occuredate;
    }

    public String getSpecbusitype() {
        if (RevertedTypeEnum.COMPENSATE.getCode().equals(revertType)) {
            return "2";
        }
        return specbusitype;
    }

    public void setSpecbusitype(String specbusitype) {
        this.specbusitype = specbusitype;
    }

    public String getChangemonths() {
        return changemonths;
    }

    public void setChangemonths(String changemonths) {
        this.changemonths = changemonths;
    }

    public BigDecimal getSpecbusisum() {
        if (RevertedTypeEnum.COMPENSATE.getCode().equals(revertType)) {
            // 代偿时返回代偿总额度
            return repaymentTotal;
        }
        return specbusisum;
    }

    public void setSpecbusisum(BigDecimal specbusisum) {
        this.specbusisum = specbusisum;
    }

    public String getSpecbusidetail() {
        return specbusidetail;
    }

    public void setSpecbusidetail(String specbusidetail) {
        this.specbusidetail = specbusidetail;
    }

    public String getReportflag() {
        return reportflag;
    }

    public void setReportflag(String reportflag) {
        this.reportflag = reportflag;
    }

    public String getRevertType() {
        return revertType;
    }

    public void setRevertType(String revertType) {
        this.revertType = revertType;
    }

    public BigDecimal getRepaymentTotal() {
        return repaymentTotal;
    }

    public void setRepaymentTotal(BigDecimal repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }

    public BigDecimal getPrplAmt() {
        return prplAmt;
    }

    public void setPrplAmt(BigDecimal prplAmt) {
        this.prplAmt = prplAmt;
    }

    public BigDecimal getUnRepayPrplAmt() {
        return unRepayPrplAmt;
    }

    public void setUnRepayPrplAmt(BigDecimal unRepayPrplAmt) {
        this.unRepayPrplAmt = unRepayPrplAmt;
    }
}
