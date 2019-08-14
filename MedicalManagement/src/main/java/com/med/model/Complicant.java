package com.med.model;

public class Complicant {

	int id,doctorId;
	
	String uname,complicant,doctorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getComplicant() {
		return complicant;
	}
	public void setComplicant(String complicant) {
		this.complicant = complicant;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "Complicant [id=" + id + ", doctorId=" + doctorId + ", uname=" + uname + ", complicant=" + complicant
				+ ", doctorName=" + doctorName + "]";
	}
	
	
	
}
