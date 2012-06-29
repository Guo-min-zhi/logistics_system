package cn.logistics.pojo;

/**
 * TJointabledistritable entity. @author MyEclipse Persistence Tools
 */

public class TJointabledistritable implements java.io.Serializable {

	// Fields

	private Integer jointableDistripointId;
	private TJointable TJointable;
	private TDistrpoint TDistrpoint;

	// Constructors

	/** default constructor */
	public TJointabledistritable() {
	}

	/** full constructor */
	public TJointabledistritable(TJointable TJointable, TDistrpoint TDistrpoint) {
		this.TJointable = TJointable;
		this.TDistrpoint = TDistrpoint;
	}

	// Property accessors

	public Integer getJointableDistripointId() {
		return this.jointableDistripointId;
	}

	public void setJointableDistripointId(Integer jointableDistripointId) {
		this.jointableDistripointId = jointableDistripointId;
	}

	public TJointable getTJointable() {
		return this.TJointable;
	}

	public void setTJointable(TJointable TJointable) {
		this.TJointable = TJointable;
	}

	public TDistrpoint getTDistrpoint() {
		return this.TDistrpoint;
	}

	public void setTDistrpoint(TDistrpoint TDistrpoint) {
		this.TDistrpoint = TDistrpoint;
	}

}