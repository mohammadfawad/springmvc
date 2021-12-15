package com.springframework.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.springmvc.DTO.Employee;

@Controller
public class RequestParameterController {

	@RequestMapping("/urlRequestParameter")
	public ModelAndView requestParameter(@RequestParam(value = "employeeId", required = false) int id,
			@RequestParam(value = "employeeName", required = false) String Name,
			@RequestParam(value = "employeeSalery", required = false, defaultValue = "75") double salery) {

		ModelAndView modelAndView = new ModelAndView("userRegistration");

		System.out.println("employeeId = " + id);
		System.out.println("employeeName = " + Name);
		System.out.println("employeeSalery = " + salery);

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(Name);
		employee.setEmployeeSalery(salery);
		modelAndView.addObject("employee", employee);

		return modelAndView;
	}// http://localhost:8082/springmvc/urlRequestParameter?employeeId=23232&employeeName=Jhon+Methew&employeeSalery=10800.75
}
