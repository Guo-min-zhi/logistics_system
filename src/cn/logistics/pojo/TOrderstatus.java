package cn.logistics.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TOrderstatus entity. @author MyEclipse Persistence Tools
 */

public class TOrderstatus implements java.io.Serializable {

	// Fields

	private Integer statusId;
	private String description;
	private Set TOrders = new HashSet(0);

	// Constructors

	/** default constructor */
	public TOrderstatus() {
	}

	/** full constructor */
	public TOrderstatus(String description, Set TOrders) {
		this.description = description;
		this.TOrders = TOrders;
	}

	// Property accessors

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getTOrders() {
		return this.TOrders;
	}

	public void setTOrders(Set TOrders) {
		this.TOrders = TOrders;
	}

}