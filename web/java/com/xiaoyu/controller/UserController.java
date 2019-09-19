package com.xiaoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query")
    public ModelAndView query(){
        ModelAndView modelAndView = new ModelAndView("user/html/user");
        modelAndView.addObject("title", "Spring MVC And Freemarker");
        return modelAndView;
    }

}
