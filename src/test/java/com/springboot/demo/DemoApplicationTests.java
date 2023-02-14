package com.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void DB테스트() {
		try (
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/d_platform?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul",
						"root",
						"1234"
				))
		{
			System.out.println("con "+con);
		}
		catch(Exception e) {
			System.out.println("e=> "+e.getMessage());
		}
	}

}
