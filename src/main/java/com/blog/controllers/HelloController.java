package com.blog.controllers;

import com.blog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liqing on 2016/5/15.
 */
@RestController
@RequestMapping(value = {"/", "/index", "", ".html", ".htm"})
public class HelloController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String world() {
        return "world";
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public User user(@PathVariable(value = "name") String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @RequestMapping("/mv")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("mv");
        return mv;
    }
}
