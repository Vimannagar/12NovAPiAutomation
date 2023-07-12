package com.spotify.oath2.testsframework;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotify.pojo.PlayList;

import api.PlaylistAPI;
import api.SpecBuilder;
import io.restassured.response.Response;

public class PlaylistAllAPIWithReusableCalls {
	
	@Test(priority = 1)
	public void createPlayList()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName(" final test songs playlist");
		requestplaylist.setDescription("collection of final test songs");
		requestplaylist.setPublic(false);
		Response response = PlaylistAPI.post(requestplaylist);
		
		PlayList responsePlaylist = response.as(PlayList.class);
				
		Assert.assertEquals(responsePlaylist.getName(), responsePlaylist.getName());
		
	}
	
	@Test(priority = 2)
	public void GetAPlaylist()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("hip hop songs playlist");
		requestplaylist.setDescription("collection of gym songs");
		requestplaylist.setPublic(false);
		
		
		Response response = PlaylistAPI.get("6zZy5dNrehgIIbYGQKEKCK");
		
		PlayList responseplaylist = response.as(PlayList.class);
				
			
		Assert.assertEquals(responseplaylist.getName(), requestplaylist.getName());
				
	}


}
