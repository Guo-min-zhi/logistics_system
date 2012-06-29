package cn.logistics.pojo;

import java.sql.Time;

/**
 * TCarschedule entity. @author MyEclipse Persistence Tools
 */

public class TCarschedule implements java.io.Serializable {

	// Fields

	private Integer carScheduleId;
	private TVehicle TVehicle;
	private Time startTime;

	// Constructors

	/** default constructor */
	public TCarschedule() {
	}

	/** full constructor */
	public TCarschedule(TVehicle TVehicle, Time startTime) {
		this.TVehicle = TVehicle;
		this.startTime = startTime;
	}

	// Property accessors

	public Integer getCarScheduleId() {
		return this.carScheduleId;
	}

	public void setCarScheduleId(Integer carScheduleId) {
		this.carScheduleId = carScheduleId;
	}

	public TVehicle getTVehicle() {
		return this.TVehicle;
	}

	public void setTVehicle(TVehicle TVehicle) {
		this.TVehicle = TVehicle;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

}