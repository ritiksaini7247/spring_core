package com.springboot.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

//	@RequestMapping("add")
//	public ModelAndView addOperation(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("addSuccess.jsp");
//		int num3 = num1 + num2;
//		modelAndView.addObject("result", num3);
//		return modelAndView;
//	}

	@RequestMapping("add")
	public String addOperation(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
		int num3 = num1 + num2;
		model.addAttribute("result", num3);
		return "addSuccess.jsp";
	}

}
