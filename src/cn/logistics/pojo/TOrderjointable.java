package cn.logistics.pojo;

/**
 * TOrderjointable entity. @author MyEclipse Persistence Tools
 */

public class TOrderjointable implements java.io.Serializable {

	// Fields

	private Integer orderJointableId;
	private TJointable TJointable;
	private TOrder TOrder;

	// Constructors

	/** default constructor */
	public TOrderjointable() {
	}

	/** full constructor */
	public TOrderjointable(TJointable TJointable, TOrder TOrder) {
		this.TJointable = TJointable;
		this.TOrder = TOrder;
	}

	// Property accessors

	public Integer getOrderJointableId() {
		return this.orderJointableId;
	}

	public void setOrderJointableId(Integer orderJointableId) {
		this.orderJointableId = orderJointableId;
	}

	public TJointable getTJointable() {
		return this.TJointable;
	}

	public void setTJointable(TJointable TJointable) {
		this.TJointable = TJointable;
	}

	public TOrder getTOrder() {
		return this.TOrder;
	}

	public void setTOrder(TOrder TOrder) {
		this.TOrder = TOrder;
	}

}