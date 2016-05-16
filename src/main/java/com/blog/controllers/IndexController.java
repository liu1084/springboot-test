package com.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/", "/index", "", ".html", ".htm"}, method = RequestMethod.GET)
public class IndexController {
	public String index(){
		return "index";
	}
}