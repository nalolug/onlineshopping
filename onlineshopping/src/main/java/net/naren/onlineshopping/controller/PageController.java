package net.naren.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping( value = {"/", "/home", "/index"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting", "welcome to spring tut");
		return mv;
	}
	/*
	@RequestMapping( value = {"/test"})
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		ModelAndView mv = new ModelAndView("page");
		if(greeting == null) {
			greeting = "hello world";
		}
		mv.addObject("greeting", greeting);
		return mv;	
	}*/
	/*
	@RequestMapping( value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable(value="greeting", required=false) String greeting) {
		ModelAndView mv = new ModelAndView("page");
		if(greeting == null) {
			greeting = "hello world";
		}
		mv.addObject("greeting", greeting);
		return mv;	
	}*/
}
