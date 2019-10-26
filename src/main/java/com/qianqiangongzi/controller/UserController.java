package com.qianqiangongzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qianqiangongzi.entity.User;
import com.qianqiangongzi.service.UserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("getUser/{id}")
	public String getUser(@PathVariable int id) {
		return userService.findById(id).toString();
	}

	@RequestMapping("getAllUser")
	public String getAllUser() {
		return userService.findAllUser().toString();
	}

	@RequestMapping("insert")
	public String insert(User user) {
		userService.insert(user);
		return "插入成功";
	}

	@RequestMapping("update")
	public String update(@RequestParam int id, @RequestParam String name) {
		userService.update(id, name);
		return "修改成功";
	}

	@RequestMapping("deleteById")
	public String deleteById(@RequestParam int id) {
		userService.deleteById(id);
		return "删除成功";
	}
}
