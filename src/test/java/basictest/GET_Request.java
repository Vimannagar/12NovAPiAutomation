package basictest;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GET_Request {
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
Response response = given()
					.header("x-api-key", "PMAK-64963ca667fcb200320322ac-9a8e59a6f683d54be2b23fae86f1ab1f57")
		
					.when()
		
					.get("/workspaces")
		
					.then()
					.log().all()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		
		Headers head = response.headers();
		
		List<Header> value = head.asList();
		
		Header a = value.get(0);
		
			System.out.println(a.getName()+" "+a.getValue());
			
			
			System.out.println("****************************");
			
		
			
			
		
		
	}

}
