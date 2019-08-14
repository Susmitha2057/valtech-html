package com.med.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerJavaClass {
	@RequestMapping("/patient")
	String loginPatient() {
		return "patient";
	}
	
	@RequestMapping("/doctor")
	String loginDoctor() {
		return "doctor";
	}
	
	@RequestMapping("/admin")
	String loginAdmin() {
		return "admin";
	}
	
	@RequestMapping("/logout")
	String logout() {
		return "patient";
	}
	
	@RequestMapping("/doctorLogout")
	String doctorLogout() {
		return "doctor";
	}
	
	@RequestMapping("/adminLogout")
	String adminLogout() {
		return "admin";
	}
}
