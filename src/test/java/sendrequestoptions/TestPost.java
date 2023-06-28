package sendrequestoptions;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPost {
	
	@Test
	public void createWorkspaces()
	{
		RestAssured.baseURI = "https://5d65d56f-c3b6-4c37-b136-c76268809400.mock.pstmn.io";
		
		
Response response = given()
					.header("Content-Type", "application/json")
					.header("x-mock-match-request-body", "true")
		
					.body("[\r\n"
							+ "{\"id\" : \"5001\", \"type\": \"None\"},\r\n"
							+ "{\"id\" : \"5002\", \"type\": \"Glazed\"}\r\n"
							+ "\r\n"
							+ "]")
					.when()
		
					.post()
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		
		
		
	}


}
