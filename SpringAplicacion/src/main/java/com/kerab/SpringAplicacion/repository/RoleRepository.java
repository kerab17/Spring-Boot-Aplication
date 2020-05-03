package com.kerab.SpringAplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kerab.SpringAplicacion.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
