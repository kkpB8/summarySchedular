package com.devglan.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Cacheable(value = false)
@Table(name="clf_fin_txn_det_grp")
public class ClfFinTxnDetGrpEntity {

    @Id
    @Column(name = "uid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger uid;


    @Column(name = "cbo_id", nullable = false)
    private BigInteger cboId;

    @Column(name = "txn_date", nullable = false)
    private Date txnDate1;

    @Column(name = "mtg_no", nullable = false)
    private Integer mtgNo;

    @Column(name = "auid", nullable = false)
    private Integer auid;


    @Column(name = "type")
    private String type;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "date_realisation")
    private Date dateRealisation1;

    @Column(name = "mode_payment")
    private Short modePayment;

    @Column(name = "bank_code")
    private String bankCode;

    @Column(name = "voucher_number",nullable = false)
    private String voucherNumber;

    @Column(name = "voucher_date", nullable = false)
    private Date voucherDate1;

    @Column(name = "transaction_no")
    private String transactionNo;

    @Column(name = "narration", nullable = false)
    private String narration;

    @Column(name = "add_lref_date",nullable = false)
    private Date addlRefDate1;


    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn1;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private Timestamp updatedOn1;

    @Column(name = "clf_mtg_uid",nullable = false)
    private BigInteger clfMtgUid;



    @Column(name = "payee_bankid")
    private BigInteger payeeBankId;

    @Column(name = "payee_branchid")
    private BigInteger payeeBranchId;


    @Column(name = "loan_no")
    private Integer loanNo;
    @Column(name = "is_processed")
    private Integer isProcessed;

    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }


    public BigInteger getCboId() {
        return cboId;
    }

    public void setCboId(BigInteger cboId) {
        this.cboId = cboId;
    }


    public Integer getMtgNo() {
        return mtgNo;
    }

    public void setMtgNo(Integer mtgNo) {
        this.mtgNo = mtgNo;
    }

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn1() {
        return createdOn1;
    }

    public void setCreatedOn1(Timestamp createdOn1) {
        this.createdOn1 = createdOn1;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedOn1() {
        return updatedOn1;
    }

    public void setUpdatedOn1(Timestamp updatedOn1) {
        this.updatedOn1 = updatedOn1;
    }

    public BigInteger getClfMtgUid() {
        return clfMtgUid;
    }

    public void setClfMtgUid(BigInteger clfMtgUid) {
        this.clfMtgUid = clfMtgUid;
    }




    public BigInteger getPayeeBankId() {
        return payeeBankId;
    }

    public void setPayeeBankId(BigInteger payeeBankId) {
        this.payeeBankId = payeeBankId;
    }

    public BigInteger getPayeeBranchId() {
        return payeeBranchId;
    }

    public void setPayeeBranchId(BigInteger payeeBranchId) {
        this.payeeBranchId = payeeBranchId;
    }

    public Integer getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(Integer loanNo) {
        this.loanNo = loanNo;
    }

    public Integer getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(Integer isProcessed) {
        this.isProcessed = isProcessed;
    }

    public Date getTxnDate1() {
        return txnDate1;
    }

    public void setTxnDate1(Date txnDate1) {
        this.txnDate1 = txnDate1;
    }

    public Date getDateRealisation1() {
        return dateRealisation1;
    }

    public void setDateRealisation1(Date dateRealisation1) {
        this.dateRealisation1 = dateRealisation1;
    }

    public Short getModePayment() {
        return modePayment;
    }

    public void setModePayment(Short modePayment) {
        this.modePayment = modePayment;
    }

    public Date getVoucherDate1() {
        return voucherDate1;
    }

    public void setVoucherDate1(Date voucherDate1) {
        this.voucherDate1 = voucherDate1;
    }

    public Date getAddlRefDate1() {
        return addlRefDate1;
    }

    public void setAddlRefDate1(Date addlRefDate1) {
        this.addlRefDate1 = addlRefDate1;
    }
}
