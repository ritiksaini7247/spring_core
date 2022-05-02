package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.mvc.model.StudentAddress;
import com.springboot.mvc.model.StudentModel;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("show")
	public String addOperation(@ModelAttribute StudentModel student, @ModelAttribute StudentAddress address,
			Model model) {
		student.setStudentAddress(address);
		model.addAttribute("student",student);
		return "addSuccess.jsp";
	}

}
