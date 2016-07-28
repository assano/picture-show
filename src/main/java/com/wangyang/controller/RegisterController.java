package com.wangyang.controller;

import com.wangyang.mapper.model.User;
import com.wangyang.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy on 2016/7/15.
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register")
    public ModelAndView register(User user) {

        ModelAndView modelAndView = new ModelAndView();

        if (1 == registerService.register(user.getUserName(), user.getPassword())) {

            modelAndView.setViewName("forward:index");

            modelAndView.addObject("name", user.getUserName());

        } else {

            modelAndView.setViewName("forward:register");

            modelAndView.addObject("info", "该用户名已被注册!");
        }

        return modelAndView;
    }

}
