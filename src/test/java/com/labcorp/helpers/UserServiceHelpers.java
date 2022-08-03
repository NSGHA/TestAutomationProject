package com.labcorp.helpers;

import org.apache.http.HttpStatus;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.labcorp.constants.EndPoints;
import com.labcorp.model.User;
import com.labcorp.utils.ConfigManager;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UserServiceHelpers {
	
	private static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
	
	public UserServiceHelpers() {	
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();
	}
	
	
	public Response createUser() {
		
		User user = new User();
		user.setCreatedAt((long) 1631825833);
	    user.setEmployeeFirstname("TestData12345Tn2");
	    user.setEmployeeLastname("TestData12345Tn2");
	    user.setEmployeePhonenumbe("264-783-9453");
	    user.setAdemployeeEmaildress("ademployee_emaildress TN2");
	    user.setCitemployeeAddressy("citemployee_addressy TN2");
	    user.setStateemployeeDevLevel("stateemployee_dev_level TN2");
	    user.setEmployeeGender("employee_gender 1");
	    user.setEmployeeHireDate("2025-10-31T16:35:45.426Z");
	    user.setEmployeeOnleave(true);
	    user.setTechStack(null);
	    user.setProject(null);

		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when().body(user)
				.post(EndPoints.CREATE_USERS)
				.andReturn();
		
		System.out.println("StatusCode:"+response.getStatusCode());
		assertEquals(response.getStatusCode(),HttpStatus.SC_CREATED, "Created");
		
		ResponseBody body = response.getBody();
		body.prettyPrint();

		return response;
	}
	
	public Response getUser(String id){
		
		User user = new User();

		Response response = RestAssured
				.given().pathParam("id", id).when().body(user)
				.get(EndPoints.GET_USER)
				.andReturn();
		
		System.out.println("StatusCode:"+response.getStatusCode());
		
		assertEquals(response.getStatusCode( ),HttpStatus.SC_OK, "OK");
		
		ResponseBody body = response.getBody();
		body.prettyPrint();
		
		String responseBodayAsString = body.asString();
		assertTrue(responseBodayAsString.contains("id"));
	

		return response;
	
	}

}
