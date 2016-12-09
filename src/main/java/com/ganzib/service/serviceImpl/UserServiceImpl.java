package com.ganzib.service.serviceImpl;

import com.ganzib.mapper.UserMapper;
import com.ganzib.model.User;
import com.ganzib.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GanZiB on 16/12/8.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User getUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }


    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userMapper.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}
