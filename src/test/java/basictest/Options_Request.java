package basictest;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Options_Request {

	

	@Test
	public void getAllAPI()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					
					.when()
		
					.options("/workspaces/c636d825-699a-418c-ab41-6bac8c01c6c1")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();
		
		Headers headerss = response.headers();
		
		String valuew = headerss.toString();
		
		System.out.println(valuew);
		
	
		
		

		System.out.println(resp);
		
Headers head = response.headers();
		
		List<Header> value = head.asList();
		
		Header a = value.get(0);
		
			System.out.println(a.getName()+" "+a.getValue());
			
			String optionsvalue = response.getHeader("x-frame-options");
		
		System.out.println(optionsvalue);
		
		
		
	}

}

