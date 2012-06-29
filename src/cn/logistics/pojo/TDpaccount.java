package cn.logistics.pojo;

/**
 * TDpaccount entity. @author MyEclipse Persistence Tools
 */

public class TDpaccount implements java.io.Serializable {

	// Fields

	private Integer dpAccountId;
	private TDistrpoint TDistrpoint;
	private Integer month;
	private Double totalFee;
	private Double totalCost;

	// Constructors

	/** default constructor */
	public TDpaccount() {
	}

	/** full constructor */
	public TDpaccount(TDistrpoint TDistrpoint, Integer month, Double totalFee,
			Double totalCost) {
		this.TDistrpoint = TDistrpoint;
		this.month = month;
		this.totalFee = totalFee;
		this.totalCost = totalCost;
	}

	// Property accessors

	public Integer getDpAccountId() {
		return this.dpAccountId;
	}

	public void setDpAccountId(Integer dpAccountId) {
		this.dpAccountId = dpAccountId;
	}

	public TDistrpoint getTDistrpoint() {
		return this.TDistrpoint;
	}

	public void setTDistrpoint(TDistrpoint TDistrpoint) {
		this.TDistrpoint = TDistrpoint;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Double getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

}