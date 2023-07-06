package githubrepo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Create_Repo_POST {
	
	
	@Test
	public void basicAuthForPostman()
	{
		RestAssured.baseURI = "https://api.github.com/user/";
		
		
		given()
//		.auth()
//		.basic("postman", "password")
		.header("Authorization", "Bearer token")
		.body("{\r\n"
				+ "  \"name\": \"Repo_DEC_22\",\r\n"
				+ "  \"description\": \"Test repo\",\r\n"
				+ "  \"homepage\": \"https://github.com\",\r\n"
				+ "  \"private\": true,\r\n"
				+ "  \"is_template\": true\r\n"
				+ "}")
		
		.log().all()
		.when()
		.post("repos")
		.then()
		.log().all()
		.extract()
		.response();

		
	}






}
