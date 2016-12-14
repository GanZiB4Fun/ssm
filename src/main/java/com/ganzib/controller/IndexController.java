package com.ganzib.controller;

import com.ganzib.model.BaiDuMeiNv;
import com.ganzib.model.Joke;
import com.ganzib.model.User;
import com.ganzib.service.UserService;

import com.ganzib.utils.BaiduUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;




/**
 * 用户控制器
 * Created by GanZiB on 16/12/8.
 */
@Controller
@ContextConfiguration(locations = {"classpath:configuration.xml"})
public class IndexController {

    private Logger log = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, ModelAndView modelAndView){
        log.info("进入首页");
        Integer userNum = userService.userNum();
        modelAndView.addObject("userNum",userNum);
        Joke joke = BaiduUtil.resultJoke();
        modelAndView.addObject("joke",joke.getNewslist().get(0));
        BaiDuMeiNv baiDuMeiNv = BaiduUtil.resultMeiNv();
        modelAndView.addObject("images",baiDuMeiNv.getNewslist());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
