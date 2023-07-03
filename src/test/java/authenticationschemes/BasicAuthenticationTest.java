package authenticationschemes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicAuthenticationTest {
	
	
	
	@Test
	public void basicAuthForPostman()
	{
		RestAssured.baseURI = "https://postman-echo.com/";
		
		
		given()
//		.auth()
//		.basic("postman", "password")
		.header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==")
		.log().all()
		.when()
		.get("/basic-auth")
		.then()
		.log().all()
		.extract()
		.response();

		
	}

}
