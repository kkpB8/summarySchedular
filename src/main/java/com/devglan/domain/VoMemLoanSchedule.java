package com.devglan.domain;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

public class VoMemLoanSchedule {
    //@NotNull(message = "Cbo Id cannot be null")
    private Integer cboId;
    private BigInteger uid;
    //@NotNull(message = "Member Id cannot be null")
    private BigInteger memId;
	//@Size(max=50,message="Meeting guid can be max of 50 chars long")
	private String mtgGuid;
    private Integer principalDemand;
    private Integer loanDemandOs;
    private Integer loanOs;
    private Integer loanPaid;
    //@NotNull(message = "Installment No cannot be null")
    private Integer installmentNo;
    //@NotNull(message = "SubInstallment No cannot be null")
    private Integer subInstallmentNo;
    private Long installmentDate;
    private Boolean repaid;
    private Long lastPaidDate;
	private Integer mtgNo;
    private Long createdOn;
    //@Size(max=30,message="Created by can be max of 30 chars long")
    private String createdBy;
    private Long updatedOn;
    //@Size(max=30,message="Updated by can be max of 30 chars long")
    private String updatedBy;
    private Integer loanNo;
    
    private Integer interestDemand ;
    private Integer originalPrincipalDemand;
    private Integer status  ;
    private Integer  orgInstallmentNo;

    public Integer getInterestDemand() {
		return interestDemand;
	}

	public void setInterestDemand(Integer interestDemand) {
		this.interestDemand = interestDemand;
	}

	public Integer getRescheduledOverdue() {
		return rescheduledOverdue;
	}

	public void setRescheduledOverdue(Integer rescheduledOverdue) {
		this.rescheduledOverdue = rescheduledOverdue;
	}

	private Integer rescheduledOverdue;

    public Integer getCboId() {
        return cboId;
    }

    public void setCboId(Integer cboId) {
        this.cboId = cboId;
    }

    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }

    public BigInteger getMemId() {
        return memId;
    }

    public void setMemId(BigInteger memId) {
        this.memId = memId;
    }

    public String getMtgGuid() {
        return mtgGuid;
    }

    public void setMtgGuid(String mtgGuid) {
        this.mtgGuid = mtgGuid;
    }

    public Integer getPrincipalDemand() {
        return principalDemand;
    }

    public void setPrincipalDemand(Integer principalDemand) {
        this.principalDemand = principalDemand;
    }

    public Integer getLoanDemandOs() {
        return loanDemandOs;
    }

    public void setLoanDemandOs(Integer loanDemandOs) {
        this.loanDemandOs = loanDemandOs;
    }

    public Integer getLoanOs() {
        return loanOs;
    }

    public void setLoanOs(Integer loanOs) {
        this.loanOs = loanOs;
    }

    public Integer getLoanPaid() {
        return loanPaid;
    }

    public void setLoanPaid(Integer loanPaid) {
        this.loanPaid = loanPaid;
    }

    public Integer getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(Integer installmentNo) {
        this.installmentNo = installmentNo;
    }

    public Integer getSubInstallmentNo() {
        return subInstallmentNo;
    }

    public void setSubInstallmentNo(Integer subInstallmentNo) {
        this.subInstallmentNo = subInstallmentNo;
    }

    public Long getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(Long installmentDate) {
        this.installmentDate = installmentDate;
    }

    public Boolean getRepaid() {
        return repaid;
    }

    public void setRepaid(Boolean repaid) {
        this.repaid = repaid;
    }

    public Long getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(Long lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public Integer getMtgNo() {
        return mtgNo;
    }

    public void setMtgNo(Integer mtgNo) {
        this.mtgNo = mtgNo;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

	public Integer getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
	}

	public Integer getOriginalPrincipalDemand() {
		return originalPrincipalDemand;
	}

	public void setOriginalPrincipalDemand(Integer originalPrincipalDemand) {
		this.originalPrincipalDemand = originalPrincipalDemand;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrgInstallmentNo() {
		return orgInstallmentNo;
	}

	public void setOrgInstallmentNo(Integer orgInstallmentNo) {
		this.orgInstallmentNo = orgInstallmentNo;
	}
    
    
}
