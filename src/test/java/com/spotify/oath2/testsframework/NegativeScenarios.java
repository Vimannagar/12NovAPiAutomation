package com.spotify.oath2.testsframework;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.spotify.pojo.Error;

import io.restassured.RestAssured;

public class NegativeScenarios {
	
	@Test(priority = 1)
	public void shouldNotBeAbleToCreatePlayList()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists/";
		
	Error error = given()
		
		.header("Authorization", "Bearer BQAgHL0p2yZE0FpaIISj9_XiBFtgVXtT59FW770xHClxpUFWYzLVrchcA9rqvEbEhbGEDgMLUHcJTXVnua6gVrbkwM3f8A5FJ1voC2B-ij_NwKvrzHrviJph1MBiMBLpQLNITcr4g2kkm8R1wz-Oz3DjlOvKzyazLH0toCRa9sNORneKy3SdSoboxjBWKWovi0IhIb_fK2iZ4kD_ch5DkoIQ96EE_JbJ-KDRo0ajM8e0t0K9LT-W_JMKTl3TfbDhsl_7siH_oQ2WxIsM")
		
		.body("{\r\n"
				+ "    \"name\": \"\",\r\n"
				+ "    \"description\": \"2022 hit songs\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.log().all()
		
		.when()
		
		.put("/0UihwgLkrKTFiucY9lq5eS")
		
		.then()
		.assertThat()
		.statusCode(400)
		.extract()
		.response()
		.as(com.spotify.pojo.Error.class);
		
	String errormessage = error.getError().getMessage();
	
	System.out.println(errormessage);
		
				
	}
	
	@Test(priority = 1)
	public void shouldNotBeAuthorized()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists/";
		
		given()
		
		.header("Authorization", "Bearer BQDNSe8H4s9rIH8Kuup4omPn1rf1rthKfizbi63yPGhMIoFtr7yr8wm22Y9sQ4WzGt8XE0XmOo8rNQ6kcEOkCJub32EWPfJsQLf36pD2Zd0wSXbNKZSdR641IW-yBRqBRYaNc8Qx6Xny2O0MC2uISlzeD3qqLPityM0E5lPh5cJFUlY7-_3AzaKORs9wP28r7LIRx_XekWZ6XyoEOZtn-WWz4lbKTH9hS1LJ0IkuDTDmxHYHaFFFRMAIOKYCZ8tHr834j85NQZnd-wM1")
		
		.body("{\r\n"
				+ "    \"name\": \"Latest hits of Mohit Chauhan\",\r\n"
				+ "    \"description\": \"2022 super hit mohit\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.log().all()
		
		.when()	
		
		.put("/0UihwgLkrKTFiucY9lq5eS")
		
		.then()
		.assertThat()
		.statusCode(401)
		.log().all();
		
				
	}

}
