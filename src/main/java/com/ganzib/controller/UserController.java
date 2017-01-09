package com.ganzib.controller;

import com.ganzib.model.User;
import com.ganzib.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GanZiB on 16/12/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "user/users";
    }

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
    public ModelAndView intoRegister(){
        ModelAndView modelAndView = new ModelAndView();
        String html = "<html>\n" +
                "<head>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <a href='www.baidu.com'>百度</a>\n" +
                "</body>\n" +
                "</html>\n";
        modelAndView.addObject("html",html);
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping(value = "attest")
    public String attest(){
        return "attest";
    }

    @RequestMapping(value = "getData",method = RequestMethod.POST)
    public ModelAndView getData(HttpServletRequest request){
        ModelAndView modelAndView =new ModelAndView();

        request.getParameter("identity");
        modelAndView.setViewName("login");
        return modelAndView;
    }

}
