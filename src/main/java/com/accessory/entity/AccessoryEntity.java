package com.accessory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCESSORY")
public class AccessoryEntity {

	@Id
	@Column(name="ACCESSORY_ID")
	private Integer AccessoryId;
	
	@Column(name="ACCESSORY_NAME")
	private String AccessoryName;
	
	@Column(name="MODEL_ID")
	private Integer modelId;
	
	@Column(name="PRICE")
	private double Price;

	
	public AccessoryEntity(Integer accessoryId, String accessoryName, Integer modelId, Double price) {
		super();
		AccessoryId = accessoryId;
		AccessoryName = accessoryName;
		this.modelId = modelId;
		Price = price;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public Integer getAccessoryId() {
		return AccessoryId;
	}

	public void setAccessoryId(Integer accessoryId) {
		AccessoryId = accessoryId;
	}

	public String getAccessoryName() {
		return AccessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		AccessoryName = accessoryName;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}


	public AccessoryEntity() {
		super();
	}
	
	
}
