package serializationanddeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.RequestBody;
import pojo.ResponseBody;

public class CreateUser {
	
	
	@Test(priority = 1)
	public void createUserOfApp()
	{
		RequestBody requestbody = new RequestBody();
		
		
		requestbody.setUsername("novserialize");
		requestbody.setFirstName("Serialization");
		requestbody.setLastName("NovBatch");
		requestbody.setEmail("novbatch@morning.com");
		requestbody.setPassword("Test@12345");
		requestbody.setPhone("9876543211");
		requestbody.setUserStatus(0);
		
		
		
	
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		ResponseBody respbody = given()
							.header("Content-Type", "application/json")
							
							.body(requestbody)
							
							.log().all()
							
							.when()
		
							.post("/user")
		
							.then()
							
							.log().all()
		
							.extract()
		
							.response()
							
							.as(ResponseBody.class);
		
		
		
		int code = respbody.getCode();
		
		System.out.println(code);
		
		String message = respbody.getMessage();
		
		System.out.println(message);
		

}
}