package com.ganzib.mapper;

import com.ganzib.model.UserBase;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 工具自动生成
 *
 * @author email:xiaoming(a)wallaw.cn
 * @version 1.0
 * @since 1.0
 * 该文件创建于 2017-08-14 05:16:45
 */

@Repository
public interface UserBaseMapper {
        void insert(UserBase userBase);

        List<UserBase> list();

}
