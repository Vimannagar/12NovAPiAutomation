package basictest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Request {
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					.header("x-api-key", "PMAK-649247a391dd760038ebbae5-abd594c62ed5ba176b999cf4834551477d")
		
					.when()
		
					.get("/workspaces/52baa379-4b6a-4992-86a3-467cd73febf9")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}

}
