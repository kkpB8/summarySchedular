package com.devglan.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ShgMemLoanSchedule {
    //@NotNull(message = "Cbo Id cannot be null")
    //  private Integer cboId;
    private BigInteger uid;
    private BigInteger memId;

    private Integer loanNo;
    private Integer principalDemand;
    private Integer loanDemandOs;
    private Integer loanOs;
    private Integer loanPaid;
    private Integer installmentNo;
    private Integer subInstallmentNo;
    private Long installmentDate;
    private Boolean repaid;
    private Long lastPaidDate;

    private Long createdOn;
    private String createdBy;
    private Long updatedOn;
    private String updatedBy;

  //@mohit 061221
    private String mtgGuid;
    private Integer mtgNo;
    private Integer interestDemand ;
    private Integer rescheduledOverdue;
    private Integer status  ;
    private Integer  orgInstallmentNo;
    public Integer getOriginalPrincipalDemand() {
		return originalPrincipalDemand;
	}

	public void setOriginalPrincipalDemand(Integer originalPrincipalDemand) {
		this.originalPrincipalDemand = originalPrincipalDemand;
	}

	private Integer originalPrincipalDemand;

    public String getMtgGuid() {
        return mtgGuid;
    }

    public void setMtgGuid(String mtgGuid) {
        this.mtgGuid = mtgGuid;
    }

    public Integer getMtgNo() {
        return mtgNo;
    }

    public void setMtgNo(Integer mtgNo) {
        this.mtgNo = mtgNo;
    }
    
    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }


    public Integer getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(Integer loanNo) {
        this.loanNo = loanNo;
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

    public Boolean getRepaid() {
        return repaid;
    }

    public void setRepaid(Boolean repaid) {
        this.repaid = repaid;
    }

    public BigInteger getMemId() {
        return memId;
    }

    public void setMemId(BigInteger memId) {
        this.memId = memId;
    }

    public Long getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(Long installmentDate) {
        this.installmentDate = installmentDate;
    }

    public Long getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(Long lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
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
