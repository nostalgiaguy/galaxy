package com.nostalgiaguy.json;

import java.util.Date;

public class User {

	private String userId;
	private UserName userName;
	private Date dob;
	
	public String getUserId(){
		return userId;
	}
	
	public void setUserId(String userId){
		this.userId=userId;
	}
	
	public UserName getUserName(){
		return userName;
	}
	
	public void setUserName(UserName userName){
		this.userName=userName;
	}
	
	public Date getDob(){
		return dob;
	}
	
	public void setDob(Date dob){
		this.dob=dob;
	}
	
	public String toString(){
		return "User [ dob=" + dob + ", userId=" + userId + ", userName=" + userName +"]";
	}
}
