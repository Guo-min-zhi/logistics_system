package cn.logistics.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TOrder entity. @author MyEclipse Persistence Tools
 */

public class TOrder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private TUser TUser;
	private TOrderstatus TOrderstatus;
	private Double goodsSize;
	private Double goodsWeight;
	private String goodsDesc;
	private String toUserName;
	private String toUserAddress;
	private String toUserTel;
	private Double price;
	private Boolean isUrgency;
	private Timestamp orderTime;
	private String fromCity;
	private String toCity;
	private Set TOrderjointables = new HashSet(0);

	// Constructors

	/** default constructor */
	public TOrder() {
	}

	/** minimal constructor */
	public TOrder(TUser TUser, TOrderstatus TOrderstatus, Double goodsSize,
			Double goodsWeight, String goodsDesc, String toUserName,
			String toUserAddress, String toUserTel, Double price,
			Boolean isUrgency, Timestamp orderTime, String fromCity,
			String toCity) {
		this.TUser = TUser;
		this.TOrderstatus = TOrderstatus;
		this.goodsSize = goodsSize;
		this.goodsWeight = goodsWeight;
		this.goodsDesc = goodsDesc;
		this.toUserName = toUserName;
		this.toUserAddress = toUserAddress;
		this.toUserTel = toUserTel;
		this.price = price;
		this.isUrgency = isUrgency;
		this.orderTime = orderTime;
		this.fromCity = fromCity;
		this.toCity = toCity;
	}

	/** full constructor */
	public TOrder(TUser TUser, TOrderstatus TOrderstatus, Double goodsSize,
			Double goodsWeight, String goodsDesc, String toUserName,
			String toUserAddress, String toUserTel, Double price,
			Boolean isUrgency, Timestamp orderTime, String fromCity,
			String toCity, Set TOrderjointables) {
		this.TUser = TUser;
		this.TOrderstatus = TOrderstatus;
		this.goodsSize = goodsSize;
		this.goodsWeight = goodsWeight;
		this.goodsDesc = goodsDesc;
		this.toUserName = toUserName;
		this.toUserAddress = toUserAddress;
		this.toUserTel = toUserTel;
		this.price = price;
		this.isUrgency = isUrgency;
		this.orderTime = orderTime;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.TOrderjointables = TOrderjointables;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public TOrderstatus getTOrderstatus() {
		return this.TOrderstatus;
	}

	public void setTOrderstatus(TOrderstatus TOrderstatus) {
		this.TOrderstatus = TOrderstatus;
	}

	public Double getGoodsSize() {
		return this.goodsSize;
	}

	public void setGoodsSize(Double goodsSize) {
		this.goodsSize = goodsSize;
	}

	public Double getGoodsWeight() {
		return this.goodsWeight;
	}

	public void setGoodsWeight(Double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public String getGoodsDesc() {
		return this.goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getToUserAddress() {
		return this.toUserAddress;
	}

	public void setToUserAddress(String toUserAddress) {
		this.toUserAddress = toUserAddress;
	}

	public String getToUserTel() {
		return this.toUserTel;
	}

	public void setToUserTel(String toUserTel) {
		this.toUserTel = toUserTel;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsUrgency() {
		return this.isUrgency;
	}

	public void setIsUrgency(Boolean isUrgency) {
		this.isUrgency = isUrgency;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public String getFromCity() {
		return this.fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return this.toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Set getTOrderjointables() {
		return this.TOrderjointables;
	}

	public void setTOrderjointables(Set TOrderjointables) {
		this.TOrderjointables = TOrderjointables;
	}

}