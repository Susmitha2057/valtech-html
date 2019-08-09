package com.med.model;

public class Complicant {

	int id;
	String name,complicant,doctorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Complicant [id=" + id + ", name=" + name + ", complicant=" + complicant + ", doctorName=" + doctorName
				+ "]";
	}
	
}
