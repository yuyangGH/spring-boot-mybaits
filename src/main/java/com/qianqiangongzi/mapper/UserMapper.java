package com.qianqiangongzi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qianqiangongzi.entity.User;

@Repository
public interface UserMapper {
	/**
	 * 通过id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	User findById(int id);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> findAllUser();

	/**
	 * 插入数据
	 * 
	 * @param id
	 * @param name
	 * @param age
	 */
	void insert(User user);

	/**
	 * 通过id修改name属性
	 * 
	 * @param id
	 * @param name
	 */
	void update(int id, String name);

	/**
	 * 通过id删除数据
	 * 
	 * @param id
	 */
	void deleteById(int id);
}
