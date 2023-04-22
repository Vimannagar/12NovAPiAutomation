package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get_ListUsers {
	
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		
Response response = given()
		
		.when()
		
		.get("api/users?page=2")
		
		.then()
		
		.extract()
		
		.response();

		String resp = response.asPrettyString();

System.out.println(resp);
		
	}

}
