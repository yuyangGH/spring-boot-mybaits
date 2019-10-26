package com.qianqiangongzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianqiangongzi.entity.User;
import com.qianqiangongzi.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User findById(int id) {
		return userMapper.findById(id);
	}

	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

	public void insert(User user) {
		userMapper.insert(user);
	}

	public void update(int id, String name) {
		userMapper.update(id, name);
	}

	public void deleteById(int id) {
		userMapper.deleteById(id);
	}
}
