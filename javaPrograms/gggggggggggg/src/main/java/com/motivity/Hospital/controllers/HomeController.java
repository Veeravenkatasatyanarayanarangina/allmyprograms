package com.motivity.Hospital.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.motivity.Hospital.repositorys.AppointmentsRepo;
import com.motivity.Hospital.repositorys.DoctorRepo;
import com.motivity.Hospital.repositorys.PatientRepo;
import com.motivity.Hospital.service.DoctorService;

@RestController
public class HomeController {

	@Autowired
	HttpSession session;
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	DoctorRepo doctorRepo;
	
	@Autowired
	AppointmentsRepo appointmentsRepo;
	
	@Autowired
	PatientRepo patientRepo;
	@RequestMapping("/")
	ModelAndView showHomePage()
	{
		session.setAttribute("doctorrepo", doctorRepo);
		session.setAttribute("appointmentsrepo", appointmentsRepo);
		return new ModelAndView("index");
	}
	@RequestMapping("/home")
	ModelAndView showHomeePage()
	{
		session.setAttribute("doctorrepo", doctorRepo);
		session.setAttribute("appointmentsrepo", appointmentsRepo);
		return new ModelAndView("index");
	}
	
	@RequestMapping("/login")
	ModelAndView showSecurityPage()
	{
	
		return new ModelAndView("login");
	}
	@RequestMapping("/accessdeniedpage")
	ModelAndView showErrorPage()
	{
	
		return new ModelAndView("accessdeniedpage");
	}
}
