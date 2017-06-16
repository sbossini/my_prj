package com.proof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerApp {
	
	@RequestMapping(value = "/SecondPage", method = RequestMethod.GET)
	public ModelAndView switchPage() {
		ModelAndView mav = new ModelAndView("SecondPage");
		mav.addObject("msg", "secret message");
		return mav;
	}
	
	@RequestMapping(value = "/FirstPage")
	public ModelAndView welcomePage() {
		ModelAndView mav = new ModelAndView("FirstPage");
		return mav;
	}
}
