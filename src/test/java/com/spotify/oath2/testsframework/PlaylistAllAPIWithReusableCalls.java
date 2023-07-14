package com.spotify.oath2.testsframework;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotify.pojo.PlayList;

import api.PlaylistAPI;
import api.SpecBuilder;
import authmanager.TokenManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.ConfigLoader;

@Epic("Spotify OAth 2.0")
@Feature("Playlist API")
public class PlaylistAllAPIWithReusableCalls {
	
static	String playlistID;
	@Story("Create Playlist")
	@Description("Creating the playlist for spiritual songs")
	@Test(priority = 1, description = "Creation of playlist")
	public void createPlayList() throws IOException
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName(ConfigLoader.getPropData("name"));
		requestplaylist.setDescription(ConfigLoader.getPropData("description"));
		requestplaylist.setPublic(false);
		Response response = PlaylistAPI.post(requestplaylist, TokenManager.renewToken());
		
		PlayList responsePlaylist = response.as(PlayList.class);
		
		 playlistID= responsePlaylist.getId();
				
		Assert.assertEquals(responsePlaylist.getName(), responsePlaylist.getName());
		
	}
	@Description("Getting the playlist information for created playlist")
	@Test(priority = 2, description = "fetch the information of created playlist")
	public void GetAPlaylist() throws IOException
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName(ConfigLoader.getPropData("name"));
		requestplaylist.setDescription(ConfigLoader.getPropData("description"));
		requestplaylist.setPublic(false);
		
		
		Response response = PlaylistAPI.get(playlistID,TokenManager.renewToken() );
		
		PlayList responseplaylist = response.as(PlayList.class);
				
			
		Assert.assertEquals(responseplaylist.getName(), requestplaylist.getName());
				
	}
	@Story("update Playlist")
	@Description("Updating playlist for created playlist")
	@Test(priority =3 , description = "Updation of created playlist")
	public void updatePlaylist()
	{
		PlayList requestplaylist = new PlayList();
		requestplaylist.setName("Balle Balle songs playlist");
		requestplaylist.setDescription("collection of punjabi songs");
		requestplaylist.setPublic(false);
		

		Response updateresponse = PlaylistAPI.update(playlistID, requestplaylist, TokenManager.renewToken());
		
		int statuscode = updateresponse.statusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		
		
				
	}
	
	


}
