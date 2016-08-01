package com.wangyang.service;

import com.wangyang.mapper.client.LoginMapper;
import com.wangyang.mapper.client.UserMapper;
import com.wangyang.mapper.model.Login;
import com.wangyang.mapper.model.User;
import com.wangyang.mapper.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wy on 2016/7/14.
 */
@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginMapper loginMapper;

    public int checkUser(User user) {

        UserExample userExample = new UserExample();

        userExample.createCriteria().andUserNameEqualTo(user.getUserName()).andPasswordEqualTo(user.getPassword());

        List<User> l = userMapper.selectByExample(userExample);

        if (!l.isEmpty()) {

            return 1;

        } else {

            return 0;
        }
    }

    //存储sid标识登录用户
    public void addSid(String sid) {

        Login login = new Login();

        login.setSid(sid);

        loginMapper.insert(login);
    }

    //查找sid
    public Boolean findSid(String sid) {

        if (loginMapper.selectByPrimaryKey(sid) != null) {

            return true;

        } else {

            return false;
        }
    }
}
