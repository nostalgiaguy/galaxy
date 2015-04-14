package com.nostalgiaguy.json;

public class UserName {
	
	
	private String firstname;
	private String lastname;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	private String middlename;

	public String toString(){
		return "UserName [ firstname="+firstname+", lastname=" + lastname + ", middlename=" + middlename +"]";
	}

}
