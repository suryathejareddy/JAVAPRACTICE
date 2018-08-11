package com.cmrapp.model;

public class UserMaster {
	private int id;
    private String userName;
    private String password;
    private String name;
    private String mobile;
    private String emailid;
    UserMaster(){}
	public UserMaster(String userName, String password, String name, String mobile, String emailid) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
  
}
