package com.springframework.springmvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.springmvc.DTO.Employee;

@Controller
public class EmployeeObjectController {

	@RequestMapping("/employeeObj")
	public ModelAndView sendEmployeeObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employeeObjectView");
		Employee employee = new Employee();
		employee.setEmployeeId(999);
		employee.setEmployeeName("Mir Mustehsan Jameel");
		employee.setEmployeeSalery(9999.99);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
	
	@RequestMapping("/employeeListModelAndView")
	public ModelAndView sendEmployeeList(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employeeListView");
		
		Employee employee = new Employee();
		employee.setEmployeeId(999);
		employee.setEmployeeName("Mir Mustehsan Jameel");
		employee.setEmployeeSalery(9999.99);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(888);
		employee1.setEmployeeName("Mir Mustehsan Jameel");
		employee1.setEmployeeSalery(9999.99);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(777);
		employee2.setEmployeeName("Mir Mustehsan Jameel");
		employee2.setEmployeeSalery(9999.99);
		
		List<Employee> employeList = new ArrayList<Employee>(); 
		employeList.add(employee);
		employeList.add(employee1);
		employeList.add(employee2);
		
		modelAndView.addObject("employeeList", employeList);
		return modelAndView;
	}
}
