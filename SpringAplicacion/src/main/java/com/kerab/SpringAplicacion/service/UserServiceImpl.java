package com.kerab.SpringAplicacion.service;

import java.util.Optional;

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
	
	private boolean checkUsernameAvailable(User user) throws Exception {
		Optional<User> userFound = repoUser.findByUsername(user.getUsername());
		if (userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}
	
	private boolean checkPasswordValid(User user) throws Exception {
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("Password y confirm Password no son iguales");
		}
		return true;
	}

	@Override
	public User createUser(User user) throws Exception {
		if (checkUsernameAvailable(user) && checkPasswordValid(user)) {
			user = repoUser.save(user);
		}
		return user;
	}

}
