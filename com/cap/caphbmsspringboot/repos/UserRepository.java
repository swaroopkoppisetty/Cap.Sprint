package com.cap.caphbmsspringboot.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.caphbmsspringboot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public Optional<User> findByUsername(String username);
	public User findByRole(String role);
}
