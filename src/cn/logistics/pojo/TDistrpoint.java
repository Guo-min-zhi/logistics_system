package cn.logistics.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TDistrpoint entity. @author MyEclipse Persistence Tools
 */

public class TDistrpoint implements java.io.Serializable {

	// Fields

	private Integer distrPointId;
	private String distrPointName;
	private String distrPointProvince;
	private String distrPointCity;
	private Set TRoutediatrpoints = new HashSet(0);
	private Set TRoutesForToStationId = new HashSet(0);
	private Set TRoutesForRouteId = new HashSet(0);
	private Set TJointabledistritables = new HashSet(0);
	private Set TDpaccounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public TDistrpoint() {
	}

	/** minimal constructor */
	public TDistrpoint(String distrPointName, String distrPointProvince,
			String distrPointCity) {
		this.distrPointName = distrPointName;
		this.distrPointProvince = distrPointProvince;
		this.distrPointCity = distrPointCity;
	}

	/** full constructor */
	public TDistrpoint(String distrPointName, String distrPointProvince,
			String distrPointCity, Set TRoutediatrpoints,
			Set TRoutesForToStationId, Set TRoutesForRouteId,
			Set TJointabledistritables, Set TDpaccounts) {
		this.distrPointName = distrPointName;
		this.distrPointProvince = distrPointProvince;
		this.distrPointCity = distrPointCity;
		this.TRoutediatrpoints = TRoutediatrpoints;
		this.TRoutesForToStationId = TRoutesForToStationId;
		this.TRoutesForRouteId = TRoutesForRouteId;
		this.TJointabledistritables = TJointabledistritables;
		this.TDpaccounts = TDpaccounts;
	}

	// Property accessors

	public Integer getDistrPointId() {
		return this.distrPointId;
	}

	public void setDistrPointId(Integer distrPointId) {
		this.distrPointId = distrPointId;
	}

	public String getDistrPointName() {
		return this.distrPointName;
	}

	public void setDistrPointName(String distrPointName) {
		this.distrPointName = distrPointName;
	}

	public String getDistrPointProvince() {
		return this.distrPointProvince;
	}

	public void setDistrPointProvince(String distrPointProvince) {
		this.distrPointProvince = distrPointProvince;
	}

	public String getDistrPointCity() {
		return this.distrPointCity;
	}

	public void setDistrPointCity(String distrPointCity) {
		this.distrPointCity = distrPointCity;
	}

	public Set getTRoutediatrpoints() {
		return this.TRoutediatrpoints;
	}

	public void setTRoutediatrpoints(Set TRoutediatrpoints) {
		this.TRoutediatrpoints = TRoutediatrpoints;
	}

	public Set getTRoutesForToStationId() {
		return this.TRoutesForToStationId;
	}

	public void setTRoutesForToStationId(Set TRoutesForToStationId) {
		this.TRoutesForToStationId = TRoutesForToStationId;
	}

	public Set getTRoutesForRouteId() {
		return this.TRoutesForRouteId;
	}

	public void setTRoutesForRouteId(Set TRoutesForRouteId) {
		this.TRoutesForRouteId = TRoutesForRouteId;
	}

	public Set getTJointabledistritables() {
		return this.TJointabledistritables;
	}

	public void setTJointabledistritables(Set TJointabledistritables) {
		this.TJointabledistritables = TJointabledistritables;
	}

	public Set getTDpaccounts() {
		return this.TDpaccounts;
	}

	public void setTDpaccounts(Set TDpaccounts) {
		this.TDpaccounts = TDpaccounts;
	}

}