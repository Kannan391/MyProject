package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_Reader {
	
	public static Properties p;
	
	public Config_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\HariAmmu\\eclipse-workspace\\MyProject\\src\\main\\java\\com\\MyProject\\Proj.properties");
	    FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
	    p.load(fis);   
	}
	public String getURL() throws Throwable {
    String url = p.getProperty("url");
    return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
	    return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
	    return password;
	}
}