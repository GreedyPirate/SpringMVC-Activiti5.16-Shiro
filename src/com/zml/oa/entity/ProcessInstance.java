package com.zml.oa.entity;

/**
 * 流程
 * @author zhao
 *
 */
public class ProcessInstance {

	private Long id;
	
	private Integer procDefId;
	
	private Integer operationType;
	
	private Integer targetRef;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getProcDefId() {
		return procDefId;
	}

	public void setProcDefId(Integer procDefId) {
		this.procDefId = procDefId;
	}

	public Integer getOperationType() {
		return operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
	}

	public Integer getTargetRef() {
		return targetRef;
	}

	public void setTargetRef(Integer targetRef) {
		this.targetRef = targetRef;
	}
	
}
