package com.demo.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.sample.modal.Employee;
import com.demo.sample.repository.SampleRepo;

@Controller
public class TrackEmployeeController {

	@Autowired
	SampleRepo sampleRepo;

	String deleteMessage ="";

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
	public ModelAndView deleteEmployee(ModelAndView model,HttpServletRequest request, HttpServletResponse response,@RequestParam(value="searchTerm",required=false) Integer searchTerm) {
		System.out.println("Delete Employee method called");
		List<Employee> listEmp = sampleRepo.findAll();
		System.out.println(listEmp);
		String[] values = request.getParameterValues("checkboxGroup");
		if(Objects.nonNull(values)) {
			for(int i=0; i<values.length; i++) {
				sampleRepo.deleteById(Integer.parseInt(values[i]));
			}
			deleteMessage = "Your selected records are deleted successfully";
		}else {

			deleteMessage = "";
		}
		List<Employee> listEmp1 = sampleRepo.findAll();
		model.addObject("listEmp", listEmp1);
		model.addObject("deleteMessage",deleteMessage);
		//		model.addObject("listEmp", listEmp);
		if(Objects.nonNull(searchTerm)) {
			List<Employee> emp = new ArrayList<Employee>();
			emp.add(sampleRepo.findById(searchTerm).orElse(new Employee()));
			model.addObject("listEmp", emp);
			if(emp.get(0).getId()==0){
				String msg="This Employee ID does not exist";
				model.addObject("msg",msg);
				//model.addObject("listEmp", listEmp);

			}else {
				model.addObject("msg","");
			}
		}else {
			model.addObject("listEmp", listEmp1);
		}
		model.setViewName("delete.jsp");
		return model;
	}

	@GetMapping("viewEmployeeDetails")
	public ModelAndView viewEmployeeDetails(ModelAndView model,@RequestParam(value="searchTerm",required=false) Integer searchTerm) throws IOException{
		System.out.println("View Employee method called");
		List<Employee> listEmp = sampleRepo.findAll();
		if(Objects.nonNull(searchTerm)) {
			List<Employee> emp = new ArrayList<Employee>();
			emp.add(sampleRepo.findById(searchTerm).orElse(new Employee()));
			model.addObject("listEmp", emp);
			if(emp.get(0).getId()==0){
				String msg="This Employee ID does not exist";
				model.addObject("msg",msg);
				//model.addObject("listEmp", listEmp);

			}else {
				model.addObject("msg","");
			}
		}else {
			model.addObject("listEmp", listEmp);
		}
		model.setViewName("view.jsp");
		return model;
	}
	@GetMapping("updateEmployee")
	public ModelAndView updateEmployee(@RequestParam(value="searchTerm",required=false) Integer searchTerm) throws IOException{
		ModelAndView model=new ModelAndView();
		System.out.println("Update Employee method called");
		List<Employee> listEmp = sampleRepo.findAll();
		System.out.println(searchTerm);
		if(Objects.nonNull(searchTerm)) {
			List<Employee> emp = new ArrayList<Employee>();
			emp.add(sampleRepo.findById(searchTerm).orElse(new Employee()));
			model.addObject("listEmp", emp);
			if(emp.get(0).getId()==0){
				String msg="This Employee ID does not exist";
				model.addObject("msg",msg);
				//model.addObject("listEmp", listEmp);

			}else {
				model.addObject("msg","");
			}
		}else {
			model.addObject("listEmp", listEmp);
		}
		model.setViewName("update.jsp");
		return model;
	}
}
