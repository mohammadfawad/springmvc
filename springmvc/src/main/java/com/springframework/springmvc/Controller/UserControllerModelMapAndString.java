package com.springframework.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.springmvc.DTO.User;


@Controller
public class UserControllerModelMapAndString {

	
	@RequestMapping("userRegistration")
	public String displayUserRegisterationForm() {
		return "userRegistration";
	}
	
	@RequestMapping(value = "RegisteredUser", method =RequestMethod.POST)
	public String registeredUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		System.out.print(user);
		modelMap.addAttribute("user",user);
		return "userRegistration";
	}
	
	@RequestMapping("userRegistrationModelMapString")
	public String displayUserRegisterationFormModelMapString() {
		return "userRegistrationModelMapString";
	}
	
	@RequestMapping(value = "registeredUserModelMapString", method =RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		System.out.print(user);
		modelMap.addAttribute("user",user);
		return "userRegistrationModelMapString";
	}
}
