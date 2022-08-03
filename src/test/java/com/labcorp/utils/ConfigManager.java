package com.labcorp.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	
	private static ConfigManager mgr;
	private static final Properties prop = new Properties();
	
	private ConfigManager() throws IOException {

		InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("resource/config.properties");
		prop.load(input);
		System.out.println("Input: "+input);
	}
	
	public static ConfigManager getInstance() {
		if(mgr==null) {
			synchronized (ConfigManager.class) {
				try {
					mgr = new ConfigManager();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return mgr;
	}
	
	public String getString(String key) {
		return System.getProperty(key, prop.getProperty(key));			
	}
}
