package githubrepo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllRepo {
	@Test
	public void basicAuthForPostman()
	{
		RestAssured.baseURI = "https://api.github.com/user/";
		
		
		given()
//		.auth()
//		.basic("postman", "password")
		.header("Authorization", "Bearer token")
		.log().all()
		.when()
		.get("repos")
		.then()
		.log().all()
		.extract()
		.response();

		
	}



}
