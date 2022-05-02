package com.springboot.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hello..");
		return "index.jsp";
	}

	@RequestMapping("add")
	public String addOperation(HttpServletRequest req) {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = num1 + num2;
		HttpSession s = req.getSession();
		s.setAttribute("result", num3);
		return "addSuccess.jsp";
	}

}
