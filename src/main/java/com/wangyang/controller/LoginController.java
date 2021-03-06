package com.wangyang.controller;

import com.wangyang.mapper.model.User;
import com.wangyang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.UUID;

/**
 * Created by wy on 2016/7/12.
 */

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView loginCheck(User user, HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView();

        if (loginService.checkUser(user) == 0) {

            modelAndView.setViewName("redirect:/login.html");

        } else {

            modelAndView.setViewName("redirect:/show.do");

            //登陆成功，保存session
            HttpSession session = request.getSession(true);
            session.setAttribute("userName", user.getUserName());
        }

        return modelAndView;
    }
}
