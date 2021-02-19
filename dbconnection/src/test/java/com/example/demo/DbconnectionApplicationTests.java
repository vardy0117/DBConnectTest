package com.example.demo;

import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysql.jdbc.Connection;

@SpringBootTest
public class DbconnectionApplicationTests {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306?useSSL=false&serverTimezone=Asia/Seoul";
	String user="root";
	String password="1234";
	
	@Test
	public void contextLoads() throws Exception{
		Class.forName(driver);
		try (java.sql.Connection conn = DriverManager.getConnection(url, user, password)){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@ : "+conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
