package cn.logistics.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TRole entity. @author MyEclipse Persistence Tools
 */

public class TRole implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String limitDesc;
	private Set TStaffsForRoleId = new HashSet(0);
	private Set TStaffsForDistrPointId = new HashSet(0);

	// Constructors

	/** default constructor */
	public TRole() {
	}

	/** minimal constructor */
	public TRole(String limitDesc) {
		this.limitDesc = limitDesc;
	}

	/** full constructor */
	public TRole(String limitDesc, Set TStaffsForRoleId,
			Set TStaffsForDistrPointId) {
		this.limitDesc = limitDesc;
		this.TStaffsForRoleId = TStaffsForRoleId;
		this.TStaffsForDistrPointId = TStaffsForDistrPointId;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getLimitDesc() {
		return this.limitDesc;
	}

	public void setLimitDesc(String limitDesc) {
		this.limitDesc = limitDesc;
	}

	public Set getTStaffsForRoleId() {
		return this.TStaffsForRoleId;
	}

	public void setTStaffsForRoleId(Set TStaffsForRoleId) {
		this.TStaffsForRoleId = TStaffsForRoleId;
	}

	public Set getTStaffsForDistrPointId() {
		return this.TStaffsForDistrPointId;
	}

	public void setTStaffsForDistrPointId(Set TStaffsForDistrPointId) {
		this.TStaffsForDistrPointId = TStaffsForDistrPointId;
	}

}