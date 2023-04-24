package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_CreateUser {
	
	
	@Test
	public void createUserOfApp()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		Response response = given()
							.header("Content-Type", "application/json")
							.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"novmorningbatch\",\r\n"
				+ "  \"firstName\": \"Nov\",\r\n"
				+ "  \"lastName\": \"Batch\",\r\n"
				+ "  \"email\": \"novmorning.batch@velocity.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9876543211\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
							.when()
		
							.post("/user")
		
							.then()
		
							.extract()
		
							.response();
		
		
		String stringresponse = response.asPrettyString();
		
		System.out.println(stringresponse);
		
		
			
	}
	
	

}
