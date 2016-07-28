package com.wangyang.service;

import com.wangyang.mapper.client.UserMapper;
import com.wangyang.mapper.model.User;
import com.wangyang.mapper.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by wy on 2016/7/15.
 */
@Service
public class RegisterService {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/register")
    public int register(String userName, String password) {

        UserExample userExample = new UserExample();

        userExample.createCriteria().andUserNameEqualTo(userName);

        List<User> list = userMapper.selectByExample(userExample);

        if (!list.isEmpty()) {

            return 0;   //userName exists in old user

        } else {        //register

            User user = new User();

            user.setUserName(userName);

            user.setPassword(password);

            user.setRegisterTime(new Date());

            user.setUpdateTime(new Date());

            userMapper.insertSelective(user);

            return 1;    //success
        }
    }
}
