package dev.es.springbootdemo.springbootdemo.service;


import dev.es.springbootdemo.springbootdemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);

}
