package spotifyapis;

import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class GET_PlayList {
	
	@Test(priority = 1)
	public void fetchUserID()
	{
		RestAssured.baseURI = "https://api.spotify.com";
		
		given()
		
		.header("Authorization", "Bearer BQD6f8VZBqwoUaAdeAvahY3Jmlg9Pptb-jdRFFTzGPNAn73hLeYIXHXgtctoWgQHns3Y0ZNgo261Yv-j27p2Cdjw9RoeiFcd44rqehLmXa4cUQctzd8sv0uii9npljGwAAYg5xUmSCt-0sCaH_V-YMeByOKY5XcRQdx6ReuhDaN-H87Qi9S8Aq8fkwAP8BRO6xP5fxwJG5Lae6rnRDHRFIYCJ9j5hwHR0xoGHC1GpcebDUw26LDAqBm5k8ZmEaDDazaf_YVvRM8nFdNW")
		
		.log().all()
		
		.when()
		
		.get("v1/me")
		
		.then()
		
		.log().all();
		
				
	}
	
	@Test(priority = 2)
	public void GetAPlaylist()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists/";
		
		given()
		
		.header("Authorization", "Bearer BQD6f8VZBqwoUaAdeAvahY3Jmlg9Pptb-jdRFFTzGPNAn73hLeYIXHXgtctoWgQHns3Y0ZNgo261Yv-j27p2Cdjw9RoeiFcd44rqehLmXa4cUQctzd8sv0uii9npljGwAAYg5xUmSCt-0sCaH_V-YMeByOKY5XcRQdx6ReuhDaN-H87Qi9S8Aq8fkwAP8BRO6xP5fxwJG5Lae6rnRDHRFIYCJ9j5hwHR0xoGHC1GpcebDUw26LDAqBm5k8ZmEaDDazaf_YVvRM8nFdNW")
		
		.log().all()
		
		.when()
		
		.get("/0UihwgLkrKTFiucY9lq5eS")
		
		.then()
		
		.log().all();
		
				
	}
	

}
