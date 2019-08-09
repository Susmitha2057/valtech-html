package com.med.model;

public class Register {

	 String userName,password,email,city,state;
	 //LocalDate DOB;
	 int phoneno;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
//	public LocalDate getDOB() {
//		return DOB;
//	}
//	public void setDOB(String dOB) {
//		LocalDate date = LocalDate.parse((CharSequence) dOB);
//		DOB = date;
//	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", password=" + password + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", phoneno=" + phoneno + "]";
	}
	 
}
