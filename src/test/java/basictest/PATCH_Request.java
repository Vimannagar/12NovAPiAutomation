package basictest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class PATCH_Request {
	
	@Test
	public void getAllAPI()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		
Response response = given()
					
					.when()
					
					.body("{\r\n"
							+ "    \"job\": \"QA Engineer\"\r\n"
							+ "}")
		
					.patch("/api/users/3")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();
		
		System.out.println(resp);
		
		
		
		
	}

}
