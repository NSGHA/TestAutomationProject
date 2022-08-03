package com.labcorp.rest.tests;

import java.io.InputStream;


public class ReadFile {

	public static void main(String[] args) {
		InputStream input = ReadFile.class.getClassLoader().getResourceAsStream("resource/config.properties");
		System.out.println("inputStream:"+input);
	}

}
