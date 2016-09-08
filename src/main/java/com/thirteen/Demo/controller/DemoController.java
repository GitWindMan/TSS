package com.thirteen.Demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thirteen.Demo.pojo.User;
import com.thirteen.Demo.service.IUserService;

/**********************************************************************
*@项目名称: TSS
*@文件名称: DemoController.java
*@Author: Leonardo
*@Date: 2016年9月7日
*@Copyright: 2016 www.fengpiaosan.com Inc. All rights reserved.
***********************************************************************/
@Controller
@RequestMapping("/user")
public class DemoController {

	@Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "DemoShowUser";  
    }
}
