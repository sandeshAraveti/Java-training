package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloContoller {
	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		return new ModelAndView("resultpage","message","welcome to spring");
		
		
	}
}
