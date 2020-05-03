package com.kerab.SpringAplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerab.SpringAplicacion.entity.User;
import com.kerab.SpringAplicacion.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepository repoUser;
	
	@Override
	public Iterable<User> getAllUsers() {
		return repoUser.findAll();
		
	}

}
