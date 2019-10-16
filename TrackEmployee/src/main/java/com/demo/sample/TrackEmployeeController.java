package com.demo.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrackEmployeeController {

	@RequestMapping("/")
	public String initialMethod() {
		System.out.println("Home method called");
		return "initial.jsp";
	}
	
	@RequestMapping("insertEmployee")
	public String insertEmployee() {
		System.out.println("Insert Employee method called");
		return "insert.jsp";
	}
	
	@RequestMapping("deleteEmployee")
	public String deleteEmployee() {
		System.out.println("Insert Employee method called");
		return "delete.jsp";
	}
	
	@RequestMapping("viewEmployeeDetails")
	public String viewEmployeeDetails() {
		System.out.println("Insert Employee method called");
		return "view.jsp";
	}
}
