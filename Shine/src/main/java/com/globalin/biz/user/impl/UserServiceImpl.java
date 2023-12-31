package com.globalin.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalin.biz.user.UserService;
import com.globalin.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO UserDAO;
	
	public void setUserDAO(UserDAO UserDAO) {
		this.UserDAO = UserDAO;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return UserDAO.getUser(vo);
	}

}
