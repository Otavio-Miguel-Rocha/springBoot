package com.psin.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psin.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
