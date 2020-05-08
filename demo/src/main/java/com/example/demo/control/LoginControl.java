package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.LoginModel;

@Controller
public class LoginControl {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String LoginGET(Model model,LoginModel loginModel) {

		model.addAttribute("login",loginModel);
		return "login";
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String LoginPOST(Model model,LoginModel loginModel) {
		loginModel.setUsername("testname");

		model.addAttribute("login",loginModel);
		return "login";
	}
}
