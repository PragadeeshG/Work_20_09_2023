package com.test1;

public class SubRequestModelInfo {
	private Integer rowId;
	private String countryCode;
	private String bizUser;
	private String techUser;
	private String systemUser;
	private String sitDate;
	private String uatDate;
	private String goLiveDate;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SubRequestModelInfo() {

	}

	public SubRequestModelInfo(Integer rowId, String countryCode, String bizUser, String techUser, String systemUser,
			String sitDate, String uatDate, String goLiveDate, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.rowId = rowId;
		this.countryCode = countryCode;
		this.bizUser = bizUser;
		this.techUser = techUser;
		this.systemUser = systemUser;
		this.sitDate = sitDate;
		this.uatDate = uatDate;
		this.goLiveDate = goLiveDate;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getBizUser() {
		return bizUser;
	}

	public void setBizUser(String bizUser) {
		this.bizUser = bizUser;
	}

	public String getTechUser() {
		return techUser;
	}

	public void setTechUser(String techUser) {
		this.techUser = techUser;
	}

	public String getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(String systemUser) {
		this.systemUser = systemUser;
	}

	public String getSitDate() {
		return sitDate;
	}

	public void setSitDate(String sitDate) {
		this.sitDate = sitDate;
	}

	public String getUatDate() {
		return uatDate;
	}

	public void setUatDate(String uatDate) {
		this.uatDate = uatDate;
	}

	public String getGoLiveDate() {
		return goLiveDate;
	}

	public void setGoLiveDate(String goLiveDate) {
		this.goLiveDate = goLiveDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
