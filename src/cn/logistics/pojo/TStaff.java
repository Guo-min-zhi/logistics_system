package cn.logistics.pojo;

/**
 * TStaff entity. @author MyEclipse Persistence Tools
 */

public class TStaff implements java.io.Serializable {

	// Fields

	private Integer staffId;
	private TRole TRoleByDistrPointId;
	private TRole TRoleByRoleId;
	private String username;
	private String password;
	private String tel;

	// Constructors

	/** default constructor */
	public TStaff() {
	}

	/** full constructor */
	public TStaff(TRole TRoleByDistrPointId, TRole TRoleByRoleId,
			String username, String password, String tel) {
		this.TRoleByDistrPointId = TRoleByDistrPointId;
		this.TRoleByRoleId = TRoleByRoleId;
		this.username = username;
		this.password = password;
		this.tel = tel;
	}

	// Property accessors

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public TRole getTRoleByDistrPointId() {
		return this.TRoleByDistrPointId;
	}

	public void setTRoleByDistrPointId(TRole TRoleByDistrPointId) {
		this.TRoleByDistrPointId = TRoleByDistrPointId;
	}

	public TRole getTRoleByRoleId() {
		return this.TRoleByRoleId;
	}

	public void setTRoleByRoleId(TRole TRoleByRoleId) {
		this.TRoleByRoleId = TRoleByRoleId;
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

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}