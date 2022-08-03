package com.labcorp.rest.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.labcorp.helpers.UserServiceHelpers;

public class CreateAndGetUser {
	
	private UserServiceHelpers userServiceHelpers;


	@BeforeClass
	public void init() {
		userServiceHelpers = new UserServiceHelpers();
	}
	
	@Test
	public void testCreateUserAndVerifyIdFetchGETRequest() {
		
		String id = userServiceHelpers.createUser().jsonPath().getString("id");
		
		assertNotNull(id, "User id is not Empty");
		assertFalse(id.isEmpty(), "User id is Empty");
		
		userServiceHelpers.getUser(id).jsonPath().getString("id");
		
	}
}
