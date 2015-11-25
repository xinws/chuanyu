package cn.chuanyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chuanyu.dao.UserDAO;
import cn.chuanyu.model.User;
import cn.chuanyu.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public int insertUser(User user) {
		return userDAO.insertUser(user);
	}

}
