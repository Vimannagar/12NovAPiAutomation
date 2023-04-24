package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FetchDataFromJsonPAthClass {
	
	@Test
	public void getValue()
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
						
			JsonPath jp = new JsonPath(resp);
			
			int totalvalue = jp.getInt("total");
			
			System.out.println(totalvalue);//12
			
			
	}

}
