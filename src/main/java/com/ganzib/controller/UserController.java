package com.ganzib.controller;

import com.ganzib.model.UserBase;
import com.ganzib.service.UserBaseService;
import com.ganzib.utils.SHA1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GanZiB on 16/12/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserBaseService userBaseService;


    /**
     * 进入登录页面
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String intoLogin(){
        return "login";
    }

    /**
     * 进入注册页面
     * @return
     */
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String intoRegister(){
        return "register";
    }

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public String saveUser(HttpServletRequest request){
        String userName = request.getParameter("user_name");
        String nickName = request.getParameter("nick_name");
        String password = request.getParameter("password");
        UserBase userBase = new UserBase();
        userBase.setUserName(userName);
        userBase.setNickName(nickName);
        userBase.setPassword(SHA1.getSHA1(password));
        userBaseService.saveUser(userBase);
        return "index";
    }
}
