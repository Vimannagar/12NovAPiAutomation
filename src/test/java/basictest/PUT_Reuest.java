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
					.header("x-api-key", "PMAK-649247a391dd760038ebbae5-207f6011b82179ae656d83cded68e7a595")
		
					.body("{\r\n"
							+ "    \"workspace\": {\r\n"
							+ "        \"name\": \"My Workspace teen\",\r\n"
							+ "        \"type\": \"team\",\r\n"
							+ "        \"description\": \"This is test api workspace three\"\r\n"
							+ "         \r\n"
							+ "\r\n"
							+ "    }\r\n"
							+ "}")
					.when()
		
					.put("/workspaces/9fd6ef95-ed36-4c52-9ba2-309797345b8c")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}

}
