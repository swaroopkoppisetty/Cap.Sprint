package com.cap.caphbmsspringboot.Exceptions;

public class UserAlreadyExistException extends RuntimeException {

	public UserAlreadyExistException(String msg) {
		super(msg);
	}
}
