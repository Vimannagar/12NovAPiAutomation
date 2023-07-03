package authenticationschemes;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerToken {
	
	
	@Test
	public void basicAuthForPostman()
	{
		RestAssured.baseURI = "https://api.github.com/user";
		
		
		given()
//		.auth()
//		.basic("postman", "password")
		.header("Authorization", "Bearer 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")
		.body("{\r\n"
				+ "  \"name\": \"Test Repo\",\r\n"
				+ "  \"description\": \"Test is test repo\",\r\n"
				+ "  \"homepage\": \"https://github.com\",\r\n"
				+ "  \"private\": true,\r\n"
				+ "  \"is_template\": true\r\n"
				+ "}")
		.log().all()
		.when()
		.post("/repos")
		.then()
		.log().all()
		.extract()
		.response();

		
	}

}
