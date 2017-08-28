package com.simple.service;

import com.simple.model.User;

public interface IUserService {
	/**
	 * 是否存在
	 * @param account
	 * @return
	 */
	int isHaveByAccount(String account);
	/**
	 * 得到登入账号
	 * @param account
	 * @param password
	 * @return
	 */
	User getLoginUser(String account ,String password);
}
