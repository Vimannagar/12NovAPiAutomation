package basictest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Options_Request {

	

	@Test
	public void getAllAPI()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					
					.when()
		
					.options("/workspaces")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();
		
		Headers headerss = response.headers();
		
		String value = headerss.toString();
		
		System.out.println(value);
		
		

		System.out.println(resp);
		
		
		
		
	}

}

