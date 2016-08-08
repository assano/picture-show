package com.wangyang.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wangyang on 2016/8/8.
 */
public class LoginAuth {

    public static boolean loginAuth(HttpServletRequest request) {

        HttpSession session = request.getSession(true);

        if (session.getAttribute("userName") != null) {

            return true;

        } else {

            return false;
        }
    }
}
