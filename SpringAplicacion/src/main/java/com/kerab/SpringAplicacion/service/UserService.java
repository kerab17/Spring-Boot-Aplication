package com.kerab.SpringAplicacion.service;



import com.kerab.SpringAplicacion.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
}
