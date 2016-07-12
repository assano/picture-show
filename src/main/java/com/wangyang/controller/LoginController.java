package com.wangyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy on 2016/7/12.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("hello");

        modelAndView.addObject("key", "this is object value");

        return modelAndView;
    }
}
