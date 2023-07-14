package authmanager;

import java.util.HashMap;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TokenManager {
	
	public static String renewToken()
	{
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("grant_type", "refresh_token");
		param.put("refresh_token", "AQBslFy66453rBHGTJwgKNESzVk-6M6uqbQ4QZW26YoNzLwOCe8fVrnBPhxxka0dSyKDTgsnFV_JKK7ipNOCUi5be1bLMdp_Vc9ZnzFioCJSMtyMfjdWFbZjKpliBBqJkP0");
		param.put("client_id", "1b8b318883e04bdab4b8de4cb553e80a");
		param.put("client_secret", "ef0bbf5af4384c59a1fcded17878f158");
		
		RestAssured.baseURI = "https://accounts.spotify.com";
		
		Response response = given()
		
		.contentType(ContentType.URLENC)
		
		.formParams(param)
		
		
		
		.when()
		
		.post("api/token")
		
		.then()
		
		.extract()
		
		.response();
		
		if(response.statusCode()!=200)
		{
			throw new RuntimeException("Failed to create the access token");
		}
		
					
		return response.path("access_token");
		
		
	}

}
