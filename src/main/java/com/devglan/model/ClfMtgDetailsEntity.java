package com.devglan.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Cacheable(value = false)
@Table(name = "clf_mtg")
public class ClfMtgDetailsEntity implements Serializable  {

    @Id
    @Column(name = "uid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger uid;

    @Column(name = "cbo_id", nullable = false)
    private BigInteger cboId;



    @Column(name = "mtg_type", nullable = false)
    private Integer mtgType;

    @Column(name = "mtg_no", nullable = false)
    private Integer mtgNo;

    @Column(name = "mtg_date")
    private Date mtgDate1;

    @Column(name = "flag_open")
    private String flagOpen;

    @Column(name = "mtg_frq")
    private String mtgFrq;

    @Column(name = "flag_dow")
    private String flagDow;

    @Column(name = "days_elapsed")
    private Integer daysElapsed;




    @Column(name = "total_meeting_held")
    private Integer totalMeetingHeld;

    @Column(name = "expected_date")
    private Timestamp expectedDate1;

    @Column(name = "approval_status")
    private Integer approvalStatus;




    @Column(name = "mnth_comp_sav")
    private Integer mnthCompSav;

    @Column(name = "total_attendance")
    private Integer totalAttendance;

    @Column(name = "sav_comp_ob")
    private Integer savCompOb;

    @Column(name = "sav_comp")
    private Integer savComp;

    @Column(name = "sav_comp_cb")
    private Integer savCompCb;

    @Column(name = "sav_comp_withdrawal")
    private Integer savCompWithdrawal;

    @Column(name = "sav_vol_ob")
    private Integer savVolOb;

    @Column(name = "sav_vol")
    private Integer savVol;

    @Column(name = "sav_vol_cb")
    private Integer savVolCb;

    @Column(name = "sav_vol_withdrawal")
    private Integer savVolWithdrawal;

    @Column(name = "mem_other_receipts")
    private Integer memOtherReceipts;

    @Column(name = "mem_other_payments")
    private Integer memOtherPayments;

    @Column(name = "no_loans_disbursed")
    private Integer noLoansDisbursed;

    @Column(name = "amt_loans_disbursed")
    private Integer amtLoansDisbursed;

    @Column(name = "amt_loans_demand")
    private Integer amtLoansDemand;

    @Column(name = "no_loans_repaid")
    private Integer noLoansRepaid;

    @Column(name = "amt_loans_repaid")
    private Integer amtLoansRepaid;

    @Column(name = "no_loan_overdue")
    private Integer noLoanOverdue;

    @Column(name = "amt_loans_overdue")
    private Integer amtLoansOverdue;

    @Column(name = "no_loans_os")
    private Integer noLoansOs;

    @Column(name = "amt_loans_os")
    private Integer amtLoansOs;

    @Column(name = "amt_interest_received")
    private Integer amtInterestReceived;

    @Column(name = "no_loans_npa")
    private Integer noLoansNpa;

    @Column(name = "amt_loans_npa")
    private Integer amtLoansNpa;

    @Column(name = "no_loans_received_ext")
    private Integer noLoansReceivedExt;

    @Column(name = "amt_loans_received_ext")
    private Integer amtLoansReceivedExt;

    @Column(name = "no_loans_repaid_ext")
    private Integer noLoansRepaidExt;

    @Column(name = "amt_loans_repaid_ext")
    private Integer amtLoansRepaidExt;

    @Column(name = "no_loan_overdue_ext")
    private Integer noLoanOverdueExt;

    @Column(name = "amt_loans_overdue_ext")
    private Integer amtLoansOverdueExt;

    @Column(name = "amt_loans_demand_ext")
    private Integer amtLoansDemandExt;

    @Column(name = "no_loans_os_ext")
    private Integer noLoansOsExt;

    @Column(name = "amt_loans_os_ext")
    private Integer amtLoansOsExt;

    @Column(name = "amt_interest_paid_ext")
    private Integer amtInterestPaidExt;

    @Column(name = "no_loans_npa_ext")
    private Integer noLoansNpaExt;

    @Column(name = "amt_loans_npa_ext")
    private Integer amtLoansNpaExt;

    @Column(name = "other_receipts")
    private Integer otherReceipts;

    @Column(name = "other_payments")
    private Integer otherPayments;

    @Column(name = "deposited_cash")
    private Integer depositedCash;

    @Column(name = "withdrawn_cash")
    private Integer withdrawnCash;

    @Column(name = "opening_balance_cash")
    private Integer openingBalanceCash;

    @Column(name = "closing_balance_cash")
    private Integer closingBalanceCash;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn1;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private Timestamp updatedOn1;

    @Column(name = "cash_in_transit_ob")
    private Integer cashInTransitOb;
    @Column(name = "cash_in_transit")
    private Integer cashInTransit;
    @Column(name = "cash_in_transit_cb")
    private Integer cashInTransitCb;




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


    public String getFlagOpen() {
        return flagOpen;
    }

    public void setFlagOpen(String flagOpen) {
        this.flagOpen = flagOpen;
    }

    public String getMtgFrq() {
        return mtgFrq;
    }

    public void setMtgFrq(String mtgFrq) {
        this.mtgFrq = mtgFrq;
    }

    public String getFlagDow() {
        return flagDow;
    }

    public void setFlagDow(String flagDow) {
        this.flagDow = flagDow;
    }

    public Integer getDaysElapsed() {
        return daysElapsed;
    }

    public void setDaysElapsed(Integer daysElapsed) {
        this.daysElapsed = daysElapsed;
    }




    public Integer getTotalMeetingHeld() {
        return totalMeetingHeld;
    }

    public void setTotalMeetingHeld(Integer totalMeetingHeld) {
        this.totalMeetingHeld = totalMeetingHeld;
    }

    public Timestamp getExpectedDate1() {
        return expectedDate1;
    }

    public void setExpectedDate1(Timestamp expectedDate1) {
        this.expectedDate1 = expectedDate1;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }




    public Integer getMnthCompSav() {
        return mnthCompSav;
    }

    public void setMnthCompSav(Integer mnthCompSav) {
        this.mnthCompSav = mnthCompSav;
    }

    public Integer getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(Integer totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    public Integer getSavCompOb() {
        return savCompOb;
    }

    public void setSavCompOb(Integer savCompOb) {
        this.savCompOb = savCompOb;
    }

    public Integer getSavComp() {
        return savComp;
    }

    public void setSavComp(Integer savComp) {
        this.savComp = savComp;
    }

    public Integer getSavCompCb() {
        return savCompCb;
    }

    public void setSavCompCb(Integer savCompCb) {
        this.savCompCb = savCompCb;
    }

    public Integer getSavCompWithdrawal() {
        return savCompWithdrawal;
    }

    public void setSavCompWithdrawal(Integer savCompWithdrawal) {
        this.savCompWithdrawal = savCompWithdrawal;
    }

    public Integer getSavVolOb() {
        return savVolOb;
    }

    public void setSavVolOb(Integer savVolOb) {
        this.savVolOb = savVolOb;
    }

    public Integer getSavVol() {
        return savVol;
    }

    public void setSavVol(Integer savVol) {
        this.savVol = savVol;
    }

    public Integer getSavVolCb() {
        return savVolCb;
    }

    public void setSavVolCb(Integer savVolCb) {
        this.savVolCb = savVolCb;
    }

    public Integer getSavVolWithdrawal() {
        return savVolWithdrawal;
    }

    public void setSavVolWithdrawal(Integer savVolWithdrawal) {
        this.savVolWithdrawal = savVolWithdrawal;
    }

    public Integer getMemOtherReceipts() {
        return memOtherReceipts;
    }

    public void setMemOtherReceipts(Integer memOtherReceipts) {
        this.memOtherReceipts = memOtherReceipts;
    }

    public Integer getMemOtherPayments() {
        return memOtherPayments;
    }

    public void setMemOtherPayments(Integer memOtherPayments) {
        this.memOtherPayments = memOtherPayments;
    }

    public Integer getNoLoansDisbursed() {
        return noLoansDisbursed;
    }

    public void setNoLoansDisbursed(Integer noLoansDisbursed) {
        this.noLoansDisbursed = noLoansDisbursed;
    }

    public Integer getAmtLoansDisbursed() {
        return amtLoansDisbursed;
    }

    public void setAmtLoansDisbursed(Integer amtLoansDisbursed) {
        this.amtLoansDisbursed = amtLoansDisbursed;
    }

    public Integer getAmtLoansDemand() {
        return amtLoansDemand;
    }

    public void setAmtLoansDemand(Integer amtLoansDemand) {
        this.amtLoansDemand = amtLoansDemand;
    }

    public Integer getNoLoansRepaid() {
        return noLoansRepaid;
    }

    public void setNoLoansRepaid(Integer noLoansRepaid) {
        this.noLoansRepaid = noLoansRepaid;
    }

    public Integer getAmtLoansRepaid() {
        return amtLoansRepaid;
    }

    public void setAmtLoansRepaid(Integer amtLoansRepaid) {
        this.amtLoansRepaid = amtLoansRepaid;
    }

    public Integer getNoLoanOverdue() {
        return noLoanOverdue;
    }

    public void setNoLoanOverdue(Integer noLoanOverdue) {
        this.noLoanOverdue = noLoanOverdue;
    }

    public Integer getAmtLoansOverdue() {
        return amtLoansOverdue;
    }

    public void setAmtLoansOverdue(Integer amtLoansOverdue) {
        this.amtLoansOverdue = amtLoansOverdue;
    }

    public Integer getNoLoansOs() {
        return noLoansOs;
    }

    public void setNoLoansOs(Integer noLoansOs) {
        this.noLoansOs = noLoansOs;
    }

    public Integer getAmtLoansOs() {
        return amtLoansOs;
    }

    public void setAmtLoansOs(Integer amtLoansOs) {
        this.amtLoansOs = amtLoansOs;
    }

    public Integer getAmtInterestReceived() {
        return amtInterestReceived;
    }

    public void setAmtInterestReceived(Integer amtInterestReceived) {
        this.amtInterestReceived = amtInterestReceived;
    }

    public Integer getNoLoansNpa() {
        return noLoansNpa;
    }

    public void setNoLoansNpa(Integer noLoansNpa) {
        this.noLoansNpa = noLoansNpa;
    }

    public Integer getAmtLoansNpa() {
        return amtLoansNpa;
    }

    public void setAmtLoansNpa(Integer amtLoansNpa) {
        this.amtLoansNpa = amtLoansNpa;
    }

    public Integer getNoLoansReceivedExt() {
        return noLoansReceivedExt;
    }

    public void setNoLoansReceivedExt(Integer noLoansReceivedExt) {
        this.noLoansReceivedExt = noLoansReceivedExt;
    }

    public Integer getAmtLoansReceivedExt() {
        return amtLoansReceivedExt;
    }

    public void setAmtLoansReceivedExt(Integer amtLoansReceivedExt) {
        this.amtLoansReceivedExt = amtLoansReceivedExt;
    }

    public Integer getNoLoansRepaidExt() {
        return noLoansRepaidExt;
    }

    public void setNoLoansRepaidExt(Integer noLoansRepaidExt) {
        this.noLoansRepaidExt = noLoansRepaidExt;
    }

    public Integer getAmtLoansRepaidExt() {
        return amtLoansRepaidExt;
    }

    public void setAmtLoansRepaidExt(Integer amtLoansRepaidExt) {
        this.amtLoansRepaidExt = amtLoansRepaidExt;
    }

    public Integer getNoLoanOverdueExt() {
        return noLoanOverdueExt;
    }

    public void setNoLoanOverdueExt(Integer noLoanOverdueExt) {
        this.noLoanOverdueExt = noLoanOverdueExt;
    }

    public Integer getAmtLoansOverdueExt() {
        return amtLoansOverdueExt;
    }

    public void setAmtLoansOverdueExt(Integer amtLoansOverdueExt) {
        this.amtLoansOverdueExt = amtLoansOverdueExt;
    }

    public Integer getAmtLoansDemandExt() {
        return amtLoansDemandExt;
    }

    public void setAmtLoansDemandExt(Integer amtLoansDemandExt) {
        this.amtLoansDemandExt = amtLoansDemandExt;
    }

    public Integer getNoLoansOsExt() {
        return noLoansOsExt;
    }

    public void setNoLoansOsExt(Integer noLoansOsExt) {
        this.noLoansOsExt = noLoansOsExt;
    }

    public Integer getAmtLoansOsExt() {
        return amtLoansOsExt;
    }

    public void setAmtLoansOsExt(Integer amtLoansOsExt) {
        this.amtLoansOsExt = amtLoansOsExt;
    }

    public Integer getAmtInterestPaidExt() {
        return amtInterestPaidExt;
    }

    public void setAmtInterestPaidExt(Integer amtInterestPaidExt) {
        this.amtInterestPaidExt = amtInterestPaidExt;
    }

    public Integer getNoLoansNpaExt() {
        return noLoansNpaExt;
    }

    public void setNoLoansNpaExt(Integer noLoansNpaExt) {
        this.noLoansNpaExt = noLoansNpaExt;
    }

    public Integer getAmtLoansNpaExt() {
        return amtLoansNpaExt;
    }

    public void setAmtLoansNpaExt(Integer amtLoansNpaExt) {
        this.amtLoansNpaExt = amtLoansNpaExt;
    }

    public Integer getOtherReceipts() {
        return otherReceipts;
    }

    public void setOtherReceipts(Integer otherReceipts) {
        this.otherReceipts = otherReceipts;
    }

    public Integer getOtherPayments() {
        return otherPayments;
    }

    public void setOtherPayments(Integer otherPayments) {
        this.otherPayments = otherPayments;
    }

    public Integer getDepositedCash() {
        return depositedCash;
    }

    public void setDepositedCash(Integer depositedCash) {
        this.depositedCash = depositedCash;
    }

    public Integer getWithdrawnCash() {
        return withdrawnCash;
    }

    public void setWithdrawnCash(Integer withdrawnCash) {
        this.withdrawnCash = withdrawnCash;
    }

    public Integer getOpeningBalanceCash() {
        return openingBalanceCash;
    }

    public void setOpeningBalanceCash(Integer openingBalanceCash) {
        this.openingBalanceCash = openingBalanceCash;
    }

    public Integer getClosingBalanceCash() {
        return closingBalanceCash;
    }

    public void setClosingBalanceCash(Integer closingBalanceCash) {
        this.closingBalanceCash = closingBalanceCash;
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


    public Integer getMtgType() {
        return mtgType;
    }

    public void setMtgType(Integer mtgType) {
        this.mtgType = mtgType;
    }

    public Date getMtgDate1() {
        return mtgDate1;
    }

    public void setMtgDate1(Date mtgDate1) {
        this.mtgDate1 = mtgDate1;
    }

    public Integer getCashInTransitOb() {
        return cashInTransitOb;
    }

    public void setCashInTransitOb(Integer cashInTransitOb) {
        this.cashInTransitOb = cashInTransitOb;
    }

    public Integer getCashInTransit() {
        return cashInTransit;
    }

    public void setCashInTransit(Integer cashInTransit) {
        this.cashInTransit = cashInTransit;
    }

    public Integer getCashInTransitCb() {
        return cashInTransitCb;
    }

    public void setCashInTransitCb(Integer cashInTransitCb) {
        this.cashInTransitCb = cashInTransitCb;
    }
}
