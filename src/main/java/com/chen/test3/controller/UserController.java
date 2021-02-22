package com.chen.test3.controller;

import com.chen.test3.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 淡
 * @version 1.0
 * @description
 * @create 2021-02-23 0:56
 */
@Controller
public class UserController {

    @GetMapping("/users")
    public ModelAndView users(){
        //创建数据源
        List<User> users = new ArrayList<>();
        User u1 = new User("1","小明1",
                "123456","1234567890123","111","222");

        User u2 = new User("2","小明2",
                "123456","1234567890123","111","222");

        User u3 = new User("3","小明3",
                "123456","1234567890123","111","222");

        User u4 = new User("4","小明4",
                "123456","1234567890123","111","222");

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        //23-39行：构建返回数据
        //43-47行：创建返回ModelAndView，并设置视图名为users，返回数据为所创建的List集合
        //创建视图
        ModelAndView mv = new ModelAndView();
        //装填视图：路径、数据
        mv.addObject("users",users);
        mv.setViewName("users");
        return mv;
    }
}
