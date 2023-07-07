package spotifyapis;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PUT_UpdatePlayList {
	
	@Test(priority = 2)
	public void updateAPlayList()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists/";
		
		given()
		
		.header("Authorization", "Bearer BQDNSe8H4s9rIH8Kuup4omPn1rf1rthKfizbi63yPGhMIoFtr7yr8wm22Y9sQ4WzGt8XE0XmOo8rNQ6kcEOkCJub32EWPfJsQLf36pD2Zd0wSXbNKZSdR641IW-yBRqBRYaNc8Qx6Xny2O0MC2uISlzeD3qqLPityM0E5lPh5cJFUlY7-_3AzaKORs9wP28r7LIRx_XekWZ6XyoEOZtn-WWz4lbKTH9hS1LJ0IkuDTDmxHYHaFFFRMAIOKYCZ8tHr834j85NQZnd-wM1")
		
		.body("{\r\n"
				+ "    \"name\": \"Autmation Playlist created on 16th Dec\",\r\n"
				+ "    \"description\": \"Classic songs\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.log().all()
		
		.when()
		
		.put("/0UihwgLkrKTFiucY9lq5eS")
		
		.then()
		
		.log().all();
		
				
	}
	

}
