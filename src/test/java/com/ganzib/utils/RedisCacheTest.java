package com.ganzib.utils;

import com.ganzib.model.User;
import com.ganzib.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by GanZiB on 16/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:configuration.xml")
public class RedisCacheTest {
    private static final Logger logger = LoggerFactory.getLogger(RedisCacheTest.class);
    private UserService userService;
    private UserService service;
    private Jedis jedis = new Jedis("localhost");

    @Test
    public void connect(){

        System.out.println("Connect to server successfully");
        System.out.println("Server is running :"+ jedis.ping());
    }
    @Test
    public void testCache2() {
        logger.info("查询所有用户信息");
        List<User> page1 = service.getAllUser();
        logger.info(page1.get(1).getUserEmail());

        List<User> page2 = service.getAllUser();
        logger.info(page2.get(0).getUserEmail());

        List<User> page3 = service.getAllUser();
        logger.info(page3.get(0).getUserEmail());
    }
}
