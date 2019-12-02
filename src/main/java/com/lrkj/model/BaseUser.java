package com.lrkj.model;


import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户表
 *
 * @author lwc
 * @email 212425333@qq.com
 * @date 2019-12-02 18:52:46
 */
@Getter
@Setter
public class BaseUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;	// 标识列

	private String nickname;	// 用户姓名

	private String account;	// 登陆账号

	private String password;	// 密码

	private Integer roleId;	// 角色id 1.信管学生 2.计算机学生 3.教师  4.超级管理员

	private String email;	// 邮箱地址

	private String phone;	// 手机号码

	private Integer isDel;	// 0未删除 1.删除


}
