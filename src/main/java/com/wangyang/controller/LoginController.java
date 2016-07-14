package com.wangyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy on 2016/7/14.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String index() {
        return "login";
    }
}
