package com.med.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.med.model.Complicant;
import com.med.model.Register;
import com.med.model.UpdateReport;
import com.med.service.ComplicantServiceImpl;
import com.med.service.RegisterService;
import com.med.service.RegisterServiceImpl;
import com.med.service.UpdateReportServiceImpl;

@Controller
public class PatientRegister {
	
	RegisterService registerServiceImpl = new RegisterServiceImpl();
	ModelAndView modelAndView;
	@RequestMapping(value="/register")
	public String createPatient() {
		return "register";
	}
	
	@RequestMapping(value="/RegisterPage", method = RequestMethod.POST)
	public ModelAndView createPatient(@ModelAttribute("patient")Register patient) {
		
		if(registerServiceImpl.createPatient(patient)) {
			modelAndView = new ModelAndView("patientPage");
		}else {
			modelAndView = new ModelAndView("register");
			modelAndView.addObject("message", "Failed Creating patient");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/PatientReport",method=RequestMethod.POST)
	public ModelAndView patientReport(HttpServletRequest request, HttpServletResponse response) {
		modelAndView = new ModelAndView("patientReport");
		return modelAndView;
	}
	
	@RequestMapping(value="/PersonalDetails",method=RequestMethod.POST)
	public ModelAndView personalDetails(HttpServletRequest request, HttpServletResponse response) {
		modelAndView = new ModelAndView("personalDetails");
		return modelAndView;
	}

	@RequestMapping(value="/complicant",method=RequestMethod.POST)
	public ModelAndView complication(HttpServletRequest request, HttpServletResponse response) {
		modelAndView = new ModelAndView("complicants");
		return modelAndView;
	}
	
	ComplicantServiceImpl complicantImpl = new ComplicantServiceImpl();
	@RequestMapping(value="/ComplicantProcess",method=RequestMethod.POST)
	public ModelAndView complicant(HttpServletRequest request, HttpServletResponse response, Complicant compli) {
		if(complicantImpl.complicant(compli))
		modelAndView = new ModelAndView("patientPage");
		return modelAndView;
	}	
	
	@RequestMapping(value="/updateReport",method=RequestMethod.POST)
	public ModelAndView updateReport(HttpServletRequest request, HttpServletResponse response) {
		modelAndView = new ModelAndView("updateReport");
		return modelAndView;
	}
	
	UpdateReportServiceImpl updateReportImpl = new UpdateReportServiceImpl();
	@RequestMapping(value="/updateProcess",method=RequestMethod.POST)
	public ModelAndView updateReport(HttpServletRequest request, HttpServletResponse response, UpdateReport report) {
		if(updateReportImpl.updateReport(report))
		modelAndView = new ModelAndView("doctorPage");
		return modelAndView;
}
	@RequestMapping(value="/viewLogs",method=RequestMethod.POST)
	public ModelAndView viewLogs(HttpServletRequest request, HttpServletResponse response) {
		modelAndView = new ModelAndView("viewLogs");
		return modelAndView;
	}
}
