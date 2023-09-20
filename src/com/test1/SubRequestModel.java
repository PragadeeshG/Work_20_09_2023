package com.test1;

public class SubRequestModel {
	private Integer rowId;
	private Integer userId;
	private String directInter;
	private Integer projectId;
	private String projectName;
	private Integer projectBrief;
	private String consumerSystem;
	private String creation_date;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public SubRequestModel() {

	}

	public SubRequestModel(Integer rowId, Integer userId, String directInter, Integer projectId, String projectName,
			Integer projectBrief, String consumerSystem, String creation_date, String entityState, String modifiedDate,
			String remarks) {
		super();
		this.rowId = rowId;
		this.userId = userId;
		this.directInter = directInter;
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectBrief = projectBrief;
		this.consumerSystem = consumerSystem;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDirectInter() {
		return directInter;
	}

	public void setDirectInter(String directInter) {
		this.directInter = directInter;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getProjectBrief() {
		return projectBrief;
	}

	public void setProjectBrief(Integer projectBrief) {
		this.projectBrief = projectBrief;
	}

	public String getConsumerSystem() {
		return consumerSystem;
	}

	public void setConsumerSystem(String consumerSystem) {
		this.consumerSystem = consumerSystem;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
