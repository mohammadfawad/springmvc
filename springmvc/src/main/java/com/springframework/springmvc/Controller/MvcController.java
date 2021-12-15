package com.springframework.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

	@RequestMapping("/hello")
	public ModelAndView helloModelAndView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloView");
		modelAndView.addObject("employeeId" , 111);
		modelAndView.addObject("employeeName" , "Raja Latif Chown");
		modelAndView.addObject("employeeSalery" , 10000);
		return modelAndView;
	}
}
