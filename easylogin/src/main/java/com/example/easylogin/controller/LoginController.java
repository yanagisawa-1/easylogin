package com.example.easylogin.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.easylogin.model.dao.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository userRepos;
	
	@RequestMapping("/")
	@ResponseBody
	public String showUsers() {
		List<com.example.easylogin.model.entity.User> users = userRepos.findAll();
		
		com.example.easylogin.model.entity.User user = users.get(0);
		String info = user.getUserName() + " " + user.getPassword();
		
		return info;
	}
	
	
	
	

}
