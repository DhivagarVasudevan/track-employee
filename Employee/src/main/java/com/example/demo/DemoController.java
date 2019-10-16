package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.repository.SampleRepo;

@Controller
public class DemoController {

	@Autowired
	private SampleRepo sampleRepo;
	
	@RequestMapping("home")
	public String home(String name, HttpSession session) {
		System.out.println("Controller");
//		ModelAndView mvobj = new ModelAndView("home.jsp");
		System.out.println(name);
		session.setAttribute("name", name);
		return "home.jsp";
	}
	
	@RequestMapping("submit")
	public String submit(String username, String password) {
		System.out.println(password);
//		ModelAndView mvobj = new ModelAndView("home.jsp");
		System.out.println(username);
//		session.setAttribute("name", name);
		return "home.jsp";
	}
	
	@RequestMapping("usingmv")
	public ModelAndView usingMv(Employee emp,String sub) {
		System.out.println("Controller");
		ModelAndView mvobj = new ModelAndView("home.jsp");
		mvobj.addObject("name",emp.getId());
		System.out.println(sub);
//		mvobj.setViewName("home.jsp");
		return mvobj;
	}
	
	@PostMapping("addStudent")
	public String addStudent(@ModelAttribute Student emp) {
		System.out.println(emp);
		Employee empObject = new Employee();
//		System.out.println(emp);
		empObject.setId(emp.getId());
		empObject.setName(emp.getName());
		sampleRepo.save(empObject);
		return "home.jsp";
	}
	
	@GetMapping("/getStudent/{id}")
	@ResponseBody
	public Employee getStudent(@PathVariable("id") int ID) {
		System.out.println(ID);
		Employee empObject = sampleRepo.findById(ID).orElse(new Employee());
		System.out.println(empObject);
		return empObject;
	}
}
