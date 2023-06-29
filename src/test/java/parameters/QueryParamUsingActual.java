package parameters;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QueryParamUsingActual {
	
	@Test
	public void getUsers()
	{
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("foo1", "bar1");
		hm.put("foo2", "bar2");
		RestAssured.baseURI = "https://postman-echo.com";
		
		
					given()
//					.queryParam("queryparameter1", "value1")
//					.queryParam("queryparameter2", "value2")
					.queryParams(hm)
					
					.when()
		
					.get("/get")
		
					.then()
					.log().all()
				
					.extract()
					
					.response();
					
	}


}
