package cn.logistics.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String username;
	private String password;
	private String email;
	private String address;
	private String tel;
	private Set TOrders = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String username, String password, String email,
			String address, String tel) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.tel = tel;
	}

	/** full constructor */
	public TUser(String username, String password, String email,
			String address, String tel, Set TOrders) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.tel = tel;
		this.TOrders = TOrders;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set getTOrders() {
		return this.TOrders;
	}

	public void setTOrders(Set TOrders) {
		this.TOrders = TOrders;
	}

}