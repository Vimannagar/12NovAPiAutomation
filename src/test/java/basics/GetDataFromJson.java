package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetDataFromJson {

	
	
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
		
		JsonPath jp = response.jsonPath();
		
		int totalvalue = jp.getInt("total");
		
		System.out.println(totalvalue);
		
		String textvalue = jp.getString("support.text");
		
		System.out.println(textvalue);
		
		for(int i =0; i<6; i++)
		{
			String emailaddress = jp.getString("data["+i+"].email");
			
			System.out.println(emailaddress);
		}
		
		
		
}
}
