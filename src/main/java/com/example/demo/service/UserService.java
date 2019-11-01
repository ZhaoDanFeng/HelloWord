package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

/** 
* UserService
* @author yongxi
* @E-mail yongxi@chaoxing.com
* @date   2019年10月16日 下午3:54:21 
*/
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public List<User> findAll() {
		return userMapper.findAll();
	}
}