package com.hib.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ETH_MA_ACCOUNT")
public class Accounts implements Serializable{

	@Id
	@Column(name="ACCT_CODE")
	private String acctCode;
	@Column(name="ACCT_NAME")
	private String acctName;
	@Column(name="ACCT_NO")
	private String acctNo;
	
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="branchCode",column=@Column(name="ACCT_BRANCH_CODE")),
		@AttributeOverride(name="auditDate",column=@Column(name="ACCT_AUDDT")),
		@AttributeOverride(name="moduleId",column=@Column(name="ACCT_MODID"))
	})
	private CommonModel commonModel;

	public String getAcctCode() {
		return acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public CommonModel getCommonModel() {
		return commonModel;
	}

	public void setCommonModel(CommonModel commonModel) {
		this.commonModel = commonModel;
	}
}
