package com.med.model;

public class UpdateReport {

	int patientid,doctorid;
	String prescription;
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	@Override
	public String toString() {
		return "UpdateReport [patientid=" + patientid + ", doctorid=" + doctorid + ", prescription=" + prescription
				+ "]";
	}
}
