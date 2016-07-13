package com.wangyang.controller;

import com.wangyang.model.Person;
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

        Person person = new Person();

        person.setName("张三");

        person.setHobby("打篮球");

        modelAndView.setViewName("fm");

        modelAndView.addObject("key", "this is object value");

        modelAndView.addObject("person", person);

        return modelAndView;
    }
}
