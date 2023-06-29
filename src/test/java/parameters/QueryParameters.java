package parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QueryParameters {
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		
					given()
					.queryParam("page", "2")
					.log().all()
		
					.when()
		
					.get("/api/users")
					
		
					.then()
					.log().all()
				
					.extract()
					
					.response();
					
	}

}
