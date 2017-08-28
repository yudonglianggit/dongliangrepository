package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simple.model.User;
import com.simple.service.IUserService;

@Controller("userController")
@RequestMapping("/userController")
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	public @ResponseBody String login(String account , String password){
		int result = userService.isHaveByAccount(account);
		if(result == 0){
			return "账号不存在";
		}
		
		User user = userService.getLoginUser(account, password);
		if(user == null){
			return "密码错误";
		}
		
		return "ok";
	}
}
