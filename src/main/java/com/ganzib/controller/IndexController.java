package com.ganzib.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * 用户控制器
 * Created by GanZiB on 16/12/8.
 */
@Controller
@ContextConfiguration(locations = {"classpath:configuration.xml"})
public class IndexController {

    private Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, ModelAndView modelAndView) throws Exception{
        log.info("进入首页");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
