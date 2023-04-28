package serializationanddeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.UserData;

public class ValidateGetWithPojo {

	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		
		UserData userdata = given()
		
							.when()
		
							.get("api/users?page=2")
		
							.then()
		
							.extract()
		
							.response()
					
							.as(UserData.class);
		
		int pages = userdata.getTotal_pages();
		
		System.out.println(pages);


	}
}
