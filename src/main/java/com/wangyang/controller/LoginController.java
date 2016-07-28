package com.wangyang.controller;

import com.wangyang.mapper.model.User;
import com.wangyang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy on 2016/7/12.
 */

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginCheck(User user) {

        ModelAndView modelAndView = new ModelAndView();

        if (loginService.checkUser(user) == 0) {

            modelAndView.setViewName("redirect:login");

        } else {

            modelAndView.setViewName("redirect:show");
        }

        return modelAndView;
    }
}
