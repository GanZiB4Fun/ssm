package com.ganzib.controller;

import com.ganzib.model.User;
import com.ganzib.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GanZiB on 16/12/9.
 */
public class IndexControllerTest {

    private Logger log = Logger.getLogger(IndexControllerTest.class);
    @Resource
    private UserService userService;

    @Test
    public void getUsers(){
        List<User> users = userService.getAllUser();
        for (User user : users){
            System.out.println(user.getUserEmail());
        }
    }
}