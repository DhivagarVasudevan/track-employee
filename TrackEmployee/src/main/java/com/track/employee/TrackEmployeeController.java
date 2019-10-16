package com.track.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackEmployeeController {

	@RequestMapping("home")
	public String home() {
		System.out.println("Home method called");
		return "home.jsp";
	}
}
