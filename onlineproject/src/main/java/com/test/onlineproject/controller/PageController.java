package com.test.onlineproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.shoppingbackend.dao.CategoryDao;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

//		passing list of categories
		mv.addObject("categories", categoryDao.list());

		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About Us");
		modelAndView.addObject("userClickAbout", true);
		return modelAndView;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Contact Us");
		modelAndView.addObject("userClickContact", true);
		return modelAndView;
	}

	@RequestMapping(value = "/products")

	public ModelAndView Product() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Product");
		modelAndView.addObject("userClickProduct", true);
		return modelAndView;

	}

}
