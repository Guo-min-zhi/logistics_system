package cn.logistics.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TJointable entity. @author MyEclipse Persistence Tools
 */

public class TJointable implements java.io.Serializable {

	// Fields

	private Integer joinTableId;
	private Integer fromStationId;
	private Integer toStationIdD;
	private String loadUsername;
	private Timestamp loadTime;
	private Integer carScheduleId;
	private String vehicleOwnerName;
	private Timestamp unloadTime;
	private String unloadUsername;
	private String joinTableStatus;
	private Set TOrderjointables = new HashSet(0);
	private Set TJointabledistritables = new HashSet(0);

	// Constructors

	/** default constructor */
	public TJointable() {
	}

	/** minimal constructor */
	public TJointable(Integer fromStationId, Integer toStationIdD,
			Timestamp loadTime, Integer carScheduleId, String vehicleOwnerName,
			Timestamp unloadTime, String unloadUsername, String joinTableStatus) {
		this.fromStationId = fromStationId;
		this.toStationIdD = toStationIdD;
		this.loadTime = loadTime;
		this.carScheduleId = carScheduleId;
		this.vehicleOwnerName = vehicleOwnerName;
		this.unloadTime = unloadTime;
		this.unloadUsername = unloadUsername;
		this.joinTableStatus = joinTableStatus;
	}

	/** full constructor */
	public TJointable(Integer fromStationId, Integer toStationIdD,
			String loadUsername, Timestamp loadTime, Integer carScheduleId,
			String vehicleOwnerName, Timestamp unloadTime,
			String unloadUsername, String joinTableStatus,
			Set TOrderjointables, Set TJointabledistritables) {
		this.fromStationId = fromStationId;
		this.toStationIdD = toStationIdD;
		this.loadUsername = loadUsername;
		this.loadTime = loadTime;
		this.carScheduleId = carScheduleId;
		this.vehicleOwnerName = vehicleOwnerName;
		this.unloadTime = unloadTime;
		this.unloadUsername = unloadUsername;
		this.joinTableStatus = joinTableStatus;
		this.TOrderjointables = TOrderjointables;
		this.TJointabledistritables = TJointabledistritables;
	}

	// Property accessors

	public Integer getJoinTableId() {
		return this.joinTableId;
	}

	public void setJoinTableId(Integer joinTableId) {
		this.joinTableId = joinTableId;
	}

	public Integer getFromStationId() {
		return this.fromStationId;
	}

	public void setFromStationId(Integer fromStationId) {
		this.fromStationId = fromStationId;
	}

	public Integer getToStationIdD() {
		return this.toStationIdD;
	}

	public void setToStationIdD(Integer toStationIdD) {
		this.toStationIdD = toStationIdD;
	}

	public String getLoadUsername() {
		return this.loadUsername;
	}

	public void setLoadUsername(String loadUsername) {
		this.loadUsername = loadUsername;
	}

	public Timestamp getLoadTime() {
		return this.loadTime;
	}

	public void setLoadTime(Timestamp loadTime) {
		this.loadTime = loadTime;
	}

	public Integer getCarScheduleId() {
		return this.carScheduleId;
	}

	public void setCarScheduleId(Integer carScheduleId) {
		this.carScheduleId = carScheduleId;
	}

	public String getVehicleOwnerName() {
		return this.vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public Timestamp getUnloadTime() {
		return this.unloadTime;
	}

	public void setUnloadTime(Timestamp unloadTime) {
		this.unloadTime = unloadTime;
	}

	public String getUnloadUsername() {
		return this.unloadUsername;
	}

	public void setUnloadUsername(String unloadUsername) {
		this.unloadUsername = unloadUsername;
	}

	public String getJoinTableStatus() {
		return this.joinTableStatus;
	}

	public void setJoinTableStatus(String joinTableStatus) {
		this.joinTableStatus = joinTableStatus;
	}

	public Set getTOrderjointables() {
		return this.TOrderjointables;
	}

	public void setTOrderjointables(Set TOrderjointables) {
		this.TOrderjointables = TOrderjointables;
	}

	public Set getTJointabledistritables() {
		return this.TJointabledistritables;
	}

	public void setTJointabledistritables(Set TJointabledistritables) {
		this.TJointabledistritables = TJointabledistritables;
	}

}