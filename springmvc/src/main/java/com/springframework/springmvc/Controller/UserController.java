package com.springframework.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.springmvc.DTO.User;

@Controller
public class UserController {
	
	@RequestMapping("userRegister")
	public ModelAndView displayUserRegisterationForm() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("userRegistration");
		return modelandView;
	}
	
	@RequestMapping(value = "registerUser", method =RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.print(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegistration");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
