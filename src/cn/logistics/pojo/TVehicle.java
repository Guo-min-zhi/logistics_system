package cn.logistics.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TVehicle entity. @author MyEclipse Persistence Tools
 */

public class TVehicle implements java.io.Serializable {

	// Fields

	private Integer vehicleId;
	private TRoute TRoute;
	private String description;
	private String vehicleOwnerName;
	private Set TCarschedules = new HashSet(0);

	// Constructors

	/** default constructor */
	public TVehicle() {
	}

	/** minimal constructor */
	public TVehicle(TRoute TRoute, String description, String vehicleOwnerName) {
		this.TRoute = TRoute;
		this.description = description;
		this.vehicleOwnerName = vehicleOwnerName;
	}

	/** full constructor */
	public TVehicle(TRoute TRoute, String description, String vehicleOwnerName,
			Set TCarschedules) {
		this.TRoute = TRoute;
		this.description = description;
		this.vehicleOwnerName = vehicleOwnerName;
		this.TCarschedules = TCarschedules;
	}

	// Property accessors

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public TRoute getTRoute() {
		return this.TRoute;
	}

	public void setTRoute(TRoute TRoute) {
		this.TRoute = TRoute;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVehicleOwnerName() {
		return this.vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public Set getTCarschedules() {
		return this.TCarschedules;
	}

	public void setTCarschedules(Set TCarschedules) {
		this.TCarschedules = TCarschedules;
	}

}