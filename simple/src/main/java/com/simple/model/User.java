package com.simple.model;

import java.io.Serializable;

public class User  implements Serializable{
	private Integer id;

	private String account;

	private String password;

	private String nickname;

	private Integer age;

	private Integer sex;

	public User() {
		super();
	}

	public User(Integer id, String account, String password, String nickname, Integer age, Integer sex) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.nickname = nickname;
		this.age = age;
		this.sex = sex;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
