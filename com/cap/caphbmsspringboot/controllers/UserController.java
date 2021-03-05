package com.cap.caphbmsspringboot.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.caphbmsspringboot.Exceptions.NameAlreadyExistsException;
import com.cap.caphbmsspringboot.entities.User;
import com.cap.caphbmsspringboot.repos.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	// Add User
	@PostMapping("/users")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addUser(@RequestBody User u) {
		
		Optional<User> user = userRepository.findByUsername(u.getUsername());
		if(user==null)
			userRepository.save(u);
		else throw new NameAlreadyExistsException("user with this name" + u.getUsername() + "already exists");
	}

	// Update User
	
//	@RequestMapping(value="/users" , method = RequestMethod.PUT)
//	@Transactional
//	public ResponseEntity<Void> updateUser(@RequestBody User u) {
//		ResponseEntity<Void>  re;
//	//@RequestMapping(value="/users" , method = RequestMethod.PUT)
//	
//
//		
//		Optional<User> user1 = userRepository.findByUsername(u.getUsername());
//		user1.setEmail(u.getEmail());
//		re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		return re;
//	}

//		
//		User user3 = userRepository.findByUsername(u.getUsername());
//		user3.setMobile(u.getMobile());
//		re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		return re;
//		
//		User user4 = userRepository.findByUsername(u.getUsername());
//		user4.setAddress(u.getAddress());
//		re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		return re;
//	}

//@PutMapping("/users/{id}")
//ResponseEntity<?> replaceUser(@RequestBody User newUser, @PathVariable Long id) {
//	  
//	  User updatedUser = userRepository.findById(id)
//			.map(user -> {
//	        user.setUsername(newUser.getUsername());
//	        user.setEmail(newUser.getEmail());
//	        user.setMobile(newUser.getMobile());
//	        user.setAddress(newUser.getAddress());
//	    
//	        return repository.save(user);}) //
//	      .orElseGet(() -> {
//	        newUser.setId(id);
//	        return repository.save(newUser);
//	      });
	
	// Remove User
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		Optional <User> user= userRepository.findById(id);
		User u= null;
		if(user.isPresent()) {
			u = user.get();
			userRepository.delete(u);
		}
	}
	// Show all Users
	
	@GetMapping("/users")
	public List<User> findAllUsers(){
		System.out.println("Method mapped to Http....");
		return userRepository.findAll();
	}
	
	//Show User
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> findUser(@PathVariable("id") int id) {
		
		ResponseEntity<User> re = null;
		
		Optional<User> user = userRepository.findById(id);
		User u = null;
		if(user.isPresent()) {
			u = user.get();
			re = new ResponseEntity<>(u, HttpStatus.OK);
		}
		else {
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
	}
	
	
}


