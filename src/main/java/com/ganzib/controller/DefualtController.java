package com.ganzib.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GanZiB on 16/12/14.
 */
@Controller
@RequestMapping(value = {"/default"})
public class DefualtController {
    private static final Logger LOG = LoggerFactory.getLogger(DefualtController.class);

    @RequestMapping(value = "{url}")
    public String index(@PathVariable String url, HttpServletRequest request){
        return "default/"+url;
    }
}
