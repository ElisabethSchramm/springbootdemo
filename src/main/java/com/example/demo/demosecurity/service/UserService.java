package com.example.demo.demosecurity.service;

import com.example.demo.demosecurity.entity.User;
import com.example.demo.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
