package com.thirteen.Demo.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thirteen.Demo.dao.IUserDao;
import com.thirteen.Demo.pojo.User;
import com.thirteen.Demo.service.IUserService;

/**********************************************************************
*@项目名称: TSS
*@文件名称: UserServiceImpl.java
*@Author: Leonardo
*@Date: 2016年9月7日
*@Copyright: 2016 www.fengpiaosan.com Inc. All rights reserved.
***********************************************************************/
@Service("UserService")
public class UserServiceImpl implements IUserService{
	@Resource  
    private IUserDao userDao; 
	@Override
	public User getUserById(int userId) {
    	return this.userDao.selectByPrimaryKey(userId);
	}
}
