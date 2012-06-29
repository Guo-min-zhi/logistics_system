package cn.logistics.pojo;

/**
 * TRoutediatrpoint entity. @author MyEclipse Persistence Tools
 */

public class TRoutediatrpoint implements java.io.Serializable {

	// Fields

	private Integer routeDistripointId;
	private TRoute TRoute;
	private TDistrpoint TDistrpoint;

	// Constructors

	/** default constructor */
	public TRoutediatrpoint() {
	}

	/** full constructor */
	public TRoutediatrpoint(TRoute TRoute, TDistrpoint TDistrpoint) {
		this.TRoute = TRoute;
		this.TDistrpoint = TDistrpoint;
	}

	// Property accessors

	public Integer getRouteDistripointId() {
		return this.routeDistripointId;
	}

	public void setRouteDistripointId(Integer routeDistripointId) {
		this.routeDistripointId = routeDistripointId;
	}

	public TRoute getTRoute() {
		return this.TRoute;
	}

	public void setTRoute(TRoute TRoute) {
		this.TRoute = TRoute;
	}

	public TDistrpoint getTDistrpoint() {
		return this.TDistrpoint;
	}

	public void setTDistrpoint(TDistrpoint TDistrpoint) {
		this.TDistrpoint = TDistrpoint;
	}

}