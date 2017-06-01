package com.joker.wechat.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.joker.wechat.dao.UserDao;
import com.joker.wechat.model.entity.User;
import com.joker.wechat.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Resource
	private UserDao userDao;

	@Override
	public void addUser(String openid,String nickname,Integer sex) {
		
		int i = this.userDao.checkUser(openid);
		if(i == 0){
			User user = new User();
			user.setOpenid(openid);
			user.setNickname(nickname);
			user.setSex(sex);
			int ii = userDao.addUser(user);
			if(i>0){
				System.out.println("===================注册成功======================");
			}
		}
		
	}


}
