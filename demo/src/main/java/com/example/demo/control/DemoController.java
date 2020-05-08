package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		home();
		return "home";
	}

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
		return "home";
	}

}
