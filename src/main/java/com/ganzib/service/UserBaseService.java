package com.ganzib.service;

import com.ganzib.model.UserBase;
import org.springframework.stereotype.Service;

/**
 * Created by GanZiBの智障 on 2017/8/14.
 */
@Service
public interface UserBaseService {
    void saveUser(UserBase userBase);
}
