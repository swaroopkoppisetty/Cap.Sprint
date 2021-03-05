package com.cap.caphbmsspringboot.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cap.caphbmsspringboot.entities.User;
//import com.cap.caphbmsspringboot.repos.UserRepository;
	//import com.cap.caphbmsspringboot.entities.User;
//	@RequestMapping
	@Repository
	public interface IUserService extends JpaRepository<User, Integer>{
		
		
		public void addUser(User u);
		
		public void deleteUser(String s);
		
		public void updatePasssword(String s2, String s3);
		
		public List <User> getAllUsers();
}
