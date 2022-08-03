package com.labcorp.rest.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.labcorp.helpers.UserServiceHelpers;

public class GetUser {

	private UserServiceHelpers userServiceHelpers;


	@BeforeClass
	public void init() {
		userServiceHelpers = new UserServiceHelpers();
	}
		
	@Test
	public void testGetUser() {
		
		String id = userServiceHelpers.getUser("237").jsonPath().getString("id");
		System.out.println(id);
	}
	
}
