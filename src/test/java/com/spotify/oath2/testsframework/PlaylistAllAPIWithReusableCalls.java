package com.spotify.oath2.testsframework;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotify.pojo.PlayList;

import api.PlaylistAPI;
import api.SpecBuilder;
import authmanager.TokenManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PlaylistAllAPIWithReusableCalls {
	
	@Test(priority = 1)
	public void createPlayList()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName(" final test songs playlist");
		requestplaylist.setDescription("collection of final test songs");
		requestplaylist.setPublic(false);
		Response response = PlaylistAPI.post(requestplaylist, TokenManager.renewToken());
		
		PlayList responsePlaylist = response.as(PlayList.class);
				
		Assert.assertEquals(responsePlaylist.getName(), responsePlaylist.getName());
		
	}
	
	@Test(priority = 3)
	public void GetAPlaylist()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("Balle Balle songs playlist");
		requestplaylist.setDescription("collection of gym songs");
		requestplaylist.setPublic(false);
		
		
		Response response = PlaylistAPI.get("6zZy5dNrehgIIbYGQKEKCK",TokenManager.renewToken() );
		
		PlayList responseplaylist = response.as(PlayList.class);
				
			
		Assert.assertEquals(responseplaylist.getName(), requestplaylist.getName());
				
	}
	

	@Test(priority = 2)
	public void updatePlaylist()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("Balle Balle songs playlist");
		requestplaylist.setDescription("collection of punjabi songs");
		requestplaylist.setPublic(false);
		

		Response updateresponse = PlaylistAPI.update("6zZy5dNrehgIIbYGQKEKCK", requestplaylist, TokenManager.renewToken());
		
		int statuscode = updateresponse.statusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		
		
				
	}
	
	


}
