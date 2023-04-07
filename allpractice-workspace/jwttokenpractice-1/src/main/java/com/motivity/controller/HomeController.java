package com.motivity.controller;
//
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.motivity.repository.UserRepository;
import com.motivity.utility.JWTUtility;
import com.motivity.model.JwtResponse;
//import com.motivity.service.UserData;
import com.motivity.model.LoginCreadentials;
import com.motivity.model.RegisterUser;
//import com.motivity.model.User;
//
//
@RestController
public class HomeController {
	@Autowired
	private PasswordEncoder passwordEncoders;

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JWTUtility jwtUtility;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserDetailsService userData;
	ModelAndView mv=new ModelAndView();
	@GetMapping("/home")
	public String  gethome() {
		return "HOME:";
	}
	@GetMapping("/user")
	public String  getadmin() {
		return "user:";
	}
	
	@GetMapping("/mycustomlogin")
	public ModelAndView getLoginPage() {
		mv.setViewName("login");
		return mv;
	}
	
	@GetMapping("/registration")
	public ModelAndView getRegisterpage() {
		
		mv.setViewName("registration");
		
		return mv;
	}
	@PostMapping("/savedata")
	public ModelAndView saveData( RegisterUser registerUser) {
		registerUser.setPassword(passwordEncoders.encode(registerUser.getPassword()));
		registerUser.setRole("user");
		registerUser.setDepartment("public");
		registerUser.setEnabled(1);
		RegisterUser r= userRepository.save(registerUser);
		if(r!=null) {
		System.out.println("success");
		mv.setViewName("/login");
		return mv;
		}
		else {
			mv.setViewName("registration");
			return mv;
		}
	}
	@PostMapping("/checklogin")
	public JwtResponse checkLogin(LoginCreadentials loginCreadentials) throws Exception {
		try {
			authenticationManager
			.authenticate(new UsernamePasswordAuthenticationToken
					(loginCreadentials.getUsername(), loginCreadentials.getPassword()));
		
		}
	catch (BadCredentialsException e) {
		throw new Exception("INVALID_CREDENTIALS",e);
	}
	final UserDetails	userDetails
	=userData.loadUserByUsername(loginCreadentials.getUsername());
	final String token=jwtUtility.generateToken(userDetails);
	return new JwtResponse(token);
	}	

	@GetMapping("doctorregister")
	public ModelAndView getDoctorRegistrationPage() {
		mv.setViewName("doctorregistration");
		return mv;
	}
	@PostMapping("/doctordata")
	public ModelAndView doctorData( RegisterUser registerUser) {
		registerUser.setPassword(passwordEncoders.encode(registerUser.getPassword()));
		registerUser.setRole("doctor");
		registerUser.setEnabled(1);
		RegisterUser r= userRepository.save(registerUser);
		if(r!=null) {
		System.out.println("success");
		mv.setViewName("/login");
		return mv;
		}
		else {
			mv.setViewName("registration");
			return mv;
		}
	}
}
