package com.springboot.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hello..");
		return "index.jsp";
	}

	@RequestMapping("add")
	public String addOperation(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession s) {
		int num3 = num1 + num2;
		s.setAttribute("result", num3);
		return "addSuccess.jsp";
	}

}
