package cn.logistics.pojo;

/**
 * THeadaccount entity. @author MyEclipse Persistence Tools
 */

public class THeadaccount implements java.io.Serializable {

	// Fields

	private Integer headAccountId;
	private Integer month;
	private Double totalFee;
	private Double totalCost;

	// Constructors

	/** default constructor */
	public THeadaccount() {
	}

	/** full constructor */
	public THeadaccount(Integer month, Double totalFee, Double totalCost) {
		this.month = month;
		this.totalFee = totalFee;
		this.totalCost = totalCost;
	}

	// Property accessors

	public Integer getHeadAccountId() {
		return this.headAccountId;
	}

	public void setHeadAccountId(Integer headAccountId) {
		this.headAccountId = headAccountId;
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