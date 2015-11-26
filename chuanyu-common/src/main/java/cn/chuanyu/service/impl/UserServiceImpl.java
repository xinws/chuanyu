package cn.chuanyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chuanyu.domain.User;
import cn.chuanyu.mapper.UserMapper;
import cn.chuanyu.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int insertUser(User user) {
		return userMapper.insertSelective(user);
	}

}
