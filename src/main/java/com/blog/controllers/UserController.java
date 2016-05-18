package com.blog.controllers;

import com.blog.models.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by neusoft on 2016/5/16.
 * This class is ...
 *
 * https://spring.io/guides/gs/handling-form-submission/
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String world() {
		return "index";
	}

	@RequestMapping(value = "/user/id/{id}")
	public User getUserById(
			@RequestParam(value = "csrfToken", defaultValue = "1L", required = false) long csrfToken,
			@PathVariable(value = "id") long id) {
		return userService.byId(id);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String create(@ModelAttribute User user, Model model){
		model.addAttribute("user", user);
		return "result";
	}
}
