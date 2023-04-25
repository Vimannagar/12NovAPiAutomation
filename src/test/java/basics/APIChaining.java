package basics;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIChaining {
	
static	String messagevalue;

	@Test(priority = 1)
	public void createUserOfApp()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		Response response = given()
							.header("Content-Type", "application/json")
							
							.body(JsonBody.getBody())
							
							.log().all()
							
							.when()
		
							.post("/user")
		
							.then()
							
							.log().all()
		
							.extract()
		
							.response();
		
		
		JsonPath jp = response.jsonPath();
		
		 messagevalue = jp.getString("message");
		
		
		
		
			
	}

	
	
	@Test(priority = 2)
	public void GetUserDetails()
	{
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		Response getresponse = given()
				
								.log().all()
		
								.when()
		
								.get("/user/raventest")
		
								.then()
								
								.log().all()
		
								.extract()
		
								.response();
		
		JsonPath js = getresponse.jsonPath();
		
		
		String idvalue	=	js.getString("id");
		
		Assert.assertEquals(messagevalue, idvalue);


		
		
	}
}
