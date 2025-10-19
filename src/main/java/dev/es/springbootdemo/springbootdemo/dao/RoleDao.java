package dev.es.springbootdemo.springbootdemo.dao;


import dev.es.springbootdemo.springbootdemo.entity.Role;

public interface RoleDao {

	Role findRoleByName(String theRoleName);
	
}
