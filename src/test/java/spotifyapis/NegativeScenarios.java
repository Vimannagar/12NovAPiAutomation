package spotifyapis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NegativeScenarios {
	
	@Test(priority = 1)
	public void shouldNotBeAbleToCreatePlayList()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists/";
		
		given()
		
		.header("Authorization", "Bearer BQAvwkeH3zl-tYBRCZ7HE5KeftF3x55EL2IWsmaqd7r1A3i4iPXadV3M_lRtdrTiTT4FmLc1SSUrBv1WAlw3B5YuJO5HB7ICQkqq9qKYcZM3qsmjOQO7HNAYVC99p2UN7v5gb8HNqxlVywKH8wlxsN4qvNDG8TpGDCq53EzapL6MtcKO9NSP_xFTJnVOFkdXqXlkoptv7jE66wkjX6YgGD81n3p2oSQMkRW-ALwK6zpq_5QZFRUMsfRwyIrzxRL-XTbk_BbZuRYibJ2U")
		
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
		.log().all();
		
				
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
