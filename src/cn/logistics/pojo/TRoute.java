package cn.logistics.pojo;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * TRoute entity. @author MyEclipse Persistence Tools
 */

public class TRoute implements java.io.Serializable {

	// Fields

	private Integer routeId;
	private TDistrpoint TDistrpointByToStationId;
	private TDistrpoint TDistrpointByRouteId;
	private Integer fromStationId;
	private Double price;
	private Time time;
	private Set TRoutediatrpoints = new HashSet(0);
	private Set TVehicles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TRoute() {
	}

	/** minimal constructor */
	public TRoute(TDistrpoint TDistrpointByToStationId,
			TDistrpoint TDistrpointByRouteId, Integer fromStationId,
			Double price, Time time) {
		this.TDistrpointByToStationId = TDistrpointByToStationId;
		this.TDistrpointByRouteId = TDistrpointByRouteId;
		this.fromStationId = fromStationId;
		this.price = price;
		this.time = time;
	}

	/** full constructor */
	public TRoute(TDistrpoint TDistrpointByToStationId,
			TDistrpoint TDistrpointByRouteId, Integer fromStationId,
			Double price, Time time, Set TRoutediatrpoints, Set TVehicles) {
		this.TDistrpointByToStationId = TDistrpointByToStationId;
		this.TDistrpointByRouteId = TDistrpointByRouteId;
		this.fromStationId = fromStationId;
		this.price = price;
		this.time = time;
		this.TRoutediatrpoints = TRoutediatrpoints;
		this.TVehicles = TVehicles;
	}

	// Property accessors

	public Integer getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public TDistrpoint getTDistrpointByToStationId() {
		return this.TDistrpointByToStationId;
	}

	public void setTDistrpointByToStationId(TDistrpoint TDistrpointByToStationId) {
		this.TDistrpointByToStationId = TDistrpointByToStationId;
	}

	public TDistrpoint getTDistrpointByRouteId() {
		return this.TDistrpointByRouteId;
	}

	public void setTDistrpointByRouteId(TDistrpoint TDistrpointByRouteId) {
		this.TDistrpointByRouteId = TDistrpointByRouteId;
	}

	public Integer getFromStationId() {
		return this.fromStationId;
	}

	public void setFromStationId(Integer fromStationId) {
		this.fromStationId = fromStationId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Set getTRoutediatrpoints() {
		return this.TRoutediatrpoints;
	}

	public void setTRoutediatrpoints(Set TRoutediatrpoints) {
		this.TRoutediatrpoints = TRoutediatrpoints;
	}

	public Set getTVehicles() {
		return this.TVehicles;
	}

	public void setTVehicles(Set TVehicles) {
		this.TVehicles = TVehicles;
	}

}