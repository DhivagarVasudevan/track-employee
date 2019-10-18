package com.demo.sample;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.sample.modal.Employee;
import com.demo.sample.repository.SampleRepo;

@Controller
public class TrackEmployeeController {

	@Autowired
	SampleRepo sampleRepo;

	@RequestMapping("/")
	public String initialMethod() {
		System.out.println("Home method called");
		return "initial.jsp";
	}

	@RequestMapping("insertEmployee")
	public String insertEmployee(Employee emp) {
		System.out.println("Insert Employee method called");
		System.out.println(emp);
		if(emp.getId()!=0) {
			sampleRepo.save(emp);
		}
		return "insert.jsp";
	}

	@RequestMapping("deleteEmployee")
	public ModelAndView deleteEmployee(ModelAndView model) {
		System.out.println("Insert Employee method called");
		List<Employee> listEmp = sampleRepo.findAll();
		System.out.println(listEmp);
		model.addObject("listEmp", listEmp);
		model.setViewName("delete.jsp");
		return model;
	}

	@GetMapping("viewEmployeeDetails")
	public ModelAndView viewEmployeeDetails(ModelAndView model) throws IOException{
		System.out.println("Insert Employee method called");
		List<Employee> listEmp = sampleRepo.findAll();
		System.out.println(listEmp);
		model.addObject("listEmp", listEmp);
		model.setViewName("view.jsp");
		return model;
	}
}
