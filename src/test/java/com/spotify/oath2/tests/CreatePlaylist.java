package com.spotify.oath2.tests;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotify.pojo.PlayList;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatePlaylist {
	
	RequestSpecification  requestSpecification;
	ResponseSpecification responseSpecification;
	@BeforeClass
	public void reqResSpec()
	{
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
		
		requestSpecBuilder.setBaseUri("https://api.spotify.com");
		requestSpecBuilder.setBasePath("/v1/users");
		requestSpecBuilder.setContentType(ContentType.JSON);
		requestSpecBuilder.addHeader("Authorization", "Bearer BQAgHL0p2yZE0FpaIISj9_XiBFtgVXtT59FW770xHClxpUFWYzLVrchcA9rqvEbEhbGEDgMLUHcJTXVnua6gVrbkwM3f8A5FJ1voC2B-ij_NwKvrzHrviJph1MBiMBLpQLNITcr4g2kkm8R1wz-Oz3DjlOvKzyazLH0toCRa9sNORneKy3SdSoboxjBWKWovi0IhIb_fK2iZ4kD_ch5DkoIQ96EE_JbJ-KDRo0ajM8e0t0K9LT-W_JMKTl3TfbDhsl_7siH_oQ2WxIsM");
		
		requestSpecification = requestSpecBuilder.build();
		
		
		ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
		
		responseSpecBuilder.expectContentType(ContentType.JSON);
		responseSpecification= responseSpecBuilder.build();
		
	}
	
	
	@Test
	public void createPlayList()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("Bal kilkari songs playlist");
		requestplaylist.setDescription("collection of baby songs");
		requestplaylist.setPublic(false);
		PlayList response = given(requestSpecification)
		.body(requestplaylist)
		.when()
		.log().all()
		
		.post("/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.log().all()
		.extract()
		
		.response()
		.as(PlayList.class);
		
		
		
		Assert.assertEquals(response.getName(), requestplaylist.getName());
		
	}

}
