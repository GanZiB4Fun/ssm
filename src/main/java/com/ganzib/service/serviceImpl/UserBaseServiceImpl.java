package com.ganzib.service.serviceImpl;

import com.ganzib.mapper.UserBaseMapper;
import com.ganzib.model.UserBase;
import com.ganzib.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 工具自动生成
 * @author  email:xiaoming(a)wallaw.cn
 * @version 1.0
 * @since 1.0
 *  该文件创建于 2017-08-14 05:16:45
 */

@Service
@Transactional
public class UserBaseServiceImpl implements UserBaseService{

	@Autowired
	private UserBaseMapper userBaseMapper;


	@Override
	public void saveUser(UserBase userBase) {
		userBaseMapper.insert(userBase);
	}
}
