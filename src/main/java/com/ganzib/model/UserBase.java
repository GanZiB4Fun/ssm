package com.ganzib.model;

public class UserBase implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//alias
	public static final String TABLE_ALIAS = "UserBase";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_USER_NAME = "userName";
	public static final String ALIAS_NICK_NAME = "nickName";
	public static final String ALIAS_TOKEN = "token";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_GENDER = "gender";


	private Integer userId; //userId
	private String userName; //userName
	private String nickName; //nickName
	private String token; //token
	private String password; //password
	private String gender; //gender



	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public void setNickName(String value) {
		this.nickName = value;
	}
	
	public String getNickName() {
		return this.nickName;
	}

	public void setToken(String value) {
		this.token = value;
	}
	
	public String getToken() {
		return this.token;
	}

	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setGender(String value) {
		this.gender = value;
	}
	
	public String getGender() {
		return this.gender;
	}

	@Override
	public String toString() {
		return "UserBase{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", nickName='" + nickName + '\'' +
				", token='" + token + '\'' +
				", password='" + password + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}

