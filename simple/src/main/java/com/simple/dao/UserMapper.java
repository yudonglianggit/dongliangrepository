package com.simple.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.simple.common.dao.MyMapper;
import com.simple.model.User;
@Component
public interface UserMapper  extends MyMapper<User>{
	/**
	 * 是否存在
	 * @param account
	 * @return
	 */
	int isHaveByAccount(@Param("account") String account);
	/**
	 * 得到登入账号
	 * @param account
	 * @param password
	 * @return
	 */
	User getLoginUser(@Param("account") String account , @Param("password") String password);
}
