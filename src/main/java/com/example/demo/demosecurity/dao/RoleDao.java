package com.example.demo.demosecurity.dao;


import com.example.demo.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
