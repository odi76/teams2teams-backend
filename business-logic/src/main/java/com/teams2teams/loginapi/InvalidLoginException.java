package com.teams2teams.loginapi;

public class InvalidLoginException extends RuntimeException {

	InvalidLoginException(String userName) {
		super("'" + userName + "' name or password is wrong");
	}
}