package com.cap.caphbmsspringboot.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.caphbmsspringboot.entities.User;
import com.cap.caphbmsspringboot.repos.UserRepository;
import com.cap.caphbmsspringboot.service.UserService;
@SpringBootTest
class TestUser {
	@Autowired
	UserService iuserServive;
    @Autowired
    UserRepository userRepository;
	@Test
	public void testAddUser() {
		User user = new User( "Mohan", "xyz@hotmail", "user1", "Guest", "987654", "Bangalore");
		userRepository.save(user);
	}

}

