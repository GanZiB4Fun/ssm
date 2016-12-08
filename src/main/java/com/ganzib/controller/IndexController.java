package com.ganzib.controller;

import com.ganzib.model.User;
import com.ganzib.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;




/**
 * Created by GanZiB on 16/12/8.
 */
@Controller
public class IndexController {

    private Logger log = Logger.getLogger(IndexController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, ModelAndView modelAndView){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        modelAndView.setViewName("user/users");
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }
}
