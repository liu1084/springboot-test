package com.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liqing on 2016/5/15.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String world(){
        return "world";
    }
}
