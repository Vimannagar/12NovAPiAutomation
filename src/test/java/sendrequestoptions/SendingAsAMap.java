package sendrequestoptions;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SendingAsAMap {
	
	
	@Test
	public void createWorkspaces()
	{
		
		HashMap<String, Object> mainObject = new HashMap<String, Object>();
		
		HashMap<String, String> nestedObject = new HashMap<String, String>();
		
		nestedObject.put("name", "Test Workspace");
		nestedObject.put("type", "personal");
		nestedObject.put("description", "This is test workspace");
		mainObject.put("workspace", nestedObject);
		
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					.header("x-api-key", "PMAK-649a38d12ccb0d002bc7c802-8bb60dc400918c621be95feec8dc14070f")
		
					.body(mainObject)
					.when()
		
					.post("/workspaces")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}


}
