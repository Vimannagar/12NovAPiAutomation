package com.spotify.oath2.testsframework;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotify.pojo.PlayList;

import api.SpecBuilder;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatePlaylist {
	
	
	
	
	@Test(priority = 1)
	public void createPlayList()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName(" hop songs playlist");
		requestplaylist.setDescription("collection of gymkhanna songs");
		requestplaylist.setPublic(false);
		PlayList response = given(SpecBuilder.getReqSpec())
				
		.body(requestplaylist)
		.when()
		.log().all()
		
		.post("/v1/users/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.spec(SpecBuilder.getResSpec())
		.extract()
		
		.response()
		.as(PlayList.class);
		
		
		
		Assert.assertEquals(response.getName(), requestplaylist.getName());
		
	}
	
	@Test(priority = 2)
	public void GetAPlaylist()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("hip hop songs playlist");
		requestplaylist.setDescription("collection of gym songs");
		requestplaylist.setPublic(false);
		
		PlayList playlist = given(SpecBuilder.getReqSpec())
				
		.when()
		
		.get("v1/playlists/6zZy5dNrehgIIbYGQKEKCK")
		
		.then()
		
		.spec(SpecBuilder.getResSpec())
		
		.extract()
		
		.response()
		
		.as(PlayList.class);
		
		
		Assert.assertEquals(playlist.getName(), requestplaylist.getName());
				
	}

}
