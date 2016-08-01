package com.wangyang.controller;

import com.wangyang.mapper.model.Picture;
import com.wangyang.service.LoginService;
import com.wangyang.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wy on 2016/7/29.
 */
@Controller
public class ShowController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private ShowService showService;

    @RequestMapping(value = "/show.do")
    public ModelAndView show(@RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                             @RequestParam(value = "limit", required = false, defaultValue = "8") int limit,
                             HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();

        //判断是否登录
        boolean flag = false;

        for (Cookie cookie : request.getCookies()) {

            if ("sid".equals(cookie.getName())) {

                String tmpSid = cookie.getValue();

                //匹配
                if (loginService.findSid(tmpSid)) {

                    flag = true;

                    break;
                }
            }
        }

        //返回相册首页
        if (flag) {

            //查找相片
            List<Picture> pictures = showService.findPictures(offset, limit);

            modelAndView.addObject("pictures", pictures);

            modelAndView.setViewName("show");

        } else {  //返回登录页面

            modelAndView.setViewName("redirect:/login.html");
        }

        return modelAndView;
    }
}
