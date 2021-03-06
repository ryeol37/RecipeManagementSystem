package com.rms.recipemanagementsystem;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;



public class DBTest {
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	@Test 
	public void testConnection() throws Exception{ Class.forName(DRIVER);
	// 프로퍼티 파일불러오기
	String resource = "/Users/home/Java/git_clone/RecipeManagementSystem/src/main/resources/config/database.properties";
	Properties property = new Properties();
	try {
		property.load(new FileInputStream(resource));
	} catch(IOException e) {
		System.out.println("파일 불러오기 오류 -> " + e);
	}
	// 저장된 속성값 불러오기 -> getProperty("키명") , setProperty(키명, 값)
	  String url= property.getProperty("db.url"); // 대소문자 구분
	  String username= property.getProperty("db.username");
	  String password= property.getProperty("db.password");
	  System.out.println("db.url  : " + url);
	  System.out.println("db.username  : " + username);
	  System.out.println("db.password  : " + password);
	  
	  
	 // DB 연결테스트
	try(Connection con = DriverManager.getConnection(url, username, password)){ 
		System.out.println("성공"); 
	System.out.println(con); } catch (Exception e) { 
		System.out.println("에러발생"); 
		e.printStackTrace(); } }
}
