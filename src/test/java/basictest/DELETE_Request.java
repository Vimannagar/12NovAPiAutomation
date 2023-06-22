package basictest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_Request {
	
	
	
	
	@Test
	public void deleteWorkspaces()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					.header("x-api-key", "PMAK-649247a391dd760038ebbae5-abd594c62ed5ba176b999cf4834551477d")
	
					.when()
		
					.delete("/workspaces/fa541c22-8ab3-43c2-9128-d5c00f2a1583")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}

}
