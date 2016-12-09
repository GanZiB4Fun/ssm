package com.ganzib.utils

import com.ganzib.model.User
import com.ganzib.service.UserService
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by GanZiB on 16/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:configuration.xml")
public class RedisCacheTest {
    private static final Logger logger = LoggerFactory.getLogger(RedisCacheTest.class);


    private  UserService service;
    private  UserService userService;

    /*
     * 二级缓存测试
     */
    @Test
    public void testCache2() {
        logger.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        List<User> page1 = service.getAllUser();
        logger.info(page1.get(1).userEmail);

        List<User> page2 = service.getAllUser();
        logger.info(page2.get(0).userEmail);

        List<User> page3 = service.getAllUser();
        logger.info(page3.get(0).userEmail);
    }
}
