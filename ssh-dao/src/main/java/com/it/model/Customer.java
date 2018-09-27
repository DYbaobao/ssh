package com.it.model;

public class Customer {
	private Integer  custId;
	private String custName;
	private Integer custUserId;
	private Integer custCreateId;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	private String custLinkName;
	private String custPhone;
	private String custMobile;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public Integer getCustUserId() {
		return custUserId;
	}
	public void setCustUserId(Integer custUserId) {
		this.custUserId = custUserId;
	}
	public Integer getCustCreateId() {
		return custCreateId;
	}
	public void setCustCreateId(Integer custCreateId) {
		this.custCreateId = custCreateId;
	}
	public void setCustCreateId(int custCreateId) {
		this.custCreateId = custCreateId;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustLinkName() {
		return custLinkName;
	}
	public void setCustLinkName(String custLinkName) {
		this.custLinkName = custLinkName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
}
