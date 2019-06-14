package com.sf.Olingo;

public class ONBCandidateInfo {
	
	String applicantId;
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	String managerId;
	String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCust_W4OnToEC() {
		return cust_W4OnToEC;
	}
	public void setCust_W4OnToEC(String cust_W4OnToEC) {
		this.cust_W4OnToEC = cust_W4OnToEC;
	}
	public String getCust_W4OnToECState() {
		return cust_W4OnToECState;
	}
	public void setCust_W4OnToECState(String cust_W4OnToECState) {
		this.cust_W4OnToECState = cust_W4OnToECState;
	}
	String cust_W4OnToEC;
	String cust_W4OnToECState;
	
	public ONBCandidateInfo(String userId,String cust_W4OnToEC,String cust_W4OnToECState,String applicantId,String ManagerId) {
		
		this.userId = userId;
		this.cust_W4OnToEC =cust_W4OnToEC;
		this.cust_W4OnToECState = cust_W4OnToECState;
		this.managerId=ManagerId;
		this.applicantId=applicantId;
		
	}
	

}
