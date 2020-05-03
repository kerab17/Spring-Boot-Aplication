package com.kerab.SpringAplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kerab.SpringAplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
