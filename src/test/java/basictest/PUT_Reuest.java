package basictest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUT_Reuest {
	
	@Test
	public void updateWorkspaces()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					.header("x-api-key", "PMAK-649247a391dd760038ebbae5-abd594c62ed5ba176b999cf4834551477d")
		
					.body("{\r\n"
							+ "    \"workspace\": {\r\n"
							+ "        \"id\": \"8e12339e-b561-4326-90db-29384205056e\",\r\n"
							+ "        \"name\": \"My Workspace\",\r\n"
							+ "        \"type\": \"team\",\r\n"
							+ "        \"description\": \"This is test api workspace FOUR\"\r\n"
							+ "         \r\n"
							+ "\r\n"
							+ "    }\r\n"
							+ "}")
					.when()
		
					.put("/workspaces/8e12339e-b561-4326-90db-29384205056e")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}

}
