package com.ganzib.service;

import com.ganzib.model.User;

import java.util.List;

/**
 * Created by GanZiB on 16/12/8.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    Integer userNum();
}

