package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		/*
		 * mv.addObject("title","Home");
		 * 
		 * logger.info("Inside PageController index method - INFO");
		 * logger.debug("Inside PageController index method - DEBUG");
		 * 
		 * //passing the list of categories mv.addObject("categories",
		 * categoryDAO.list());
		 * 
		 * mv.addObject("userClickHome",true);
		 */
		return mv;				
	}
	
	@RequestMapping(value = {"/test"})
	public ModelAndView test1(@RequestParam(value="greeting", required=false)String greeting)	{		
		if(greeting == null) {
			greeting = "Hola amigos";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;				
	}
	
	@RequestMapping(value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting")String greeting)	{		
		if(greeting == null) {
			greeting = "Hola amigos";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;				
	}

}
