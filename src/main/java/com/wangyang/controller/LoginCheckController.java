package com.wangyang.controller;

import com.wangyang.mapper.model.User;
import com.wangyang.service.LoginCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy on 2016/7/12.
 */

@Controller
public class LoginCheckController {

    @Autowired
    private LoginCheckService loginCheckService;

    @RequestMapping(value = "/login_check", method = RequestMethod.POST)
    public ModelAndView loginCheck(User user) {

        ModelAndView modelAndView = new ModelAndView();

        if (loginCheckService.checkUser(user) == 0) {

            modelAndView.setViewName("redirect:login");

        } else {

            modelAndView.setViewName("redirect:index");
        }

        return modelAndView;
    }
}
