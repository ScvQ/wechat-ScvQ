package com.joker.wechat.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.joker.wechat.model.entity.User;

@Repository("userDao")
public interface UserDao {
	
	int addUser(User user);
	
	int checkUser(@Param("openid")String openid);

}
