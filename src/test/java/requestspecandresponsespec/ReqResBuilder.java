package requestspecandresponsespec;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReqResBuilder {
	RequestSpecification requestspecification;
	
	ResponseSpecification responsespecification;
	
	@BeforeClass
	public void prerequisite()
	{
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		
		requestspecbuilder.setBaseUri("https://api.postman.com");
		requestspecbuilder.addHeader("x-api-key", "PMAK-649a38d12ccb0d002bc7c802-8bb60dc400918c621be95feec8dc14070f");
		requestspecbuilder.log(LogDetail.ALL);
		requestspecification = requestspecbuilder.build();
		
		
		ResponseSpecBuilder responsespecbuilder = new ResponseSpecBuilder()
		.expectStatusCode(201)
		.expectContentType(ContentType.JSON)
		.log(LogDetail.ALL);
		
		responsespecification = responsespecbuilder.build();
		
	}
	
	@Test
	public void getUsers()
	{
			Response response = given(requestspecification)
					.when()
		
					.get("/workspaces")
		
					.then()
					
					.spec(responsespecification)
					.extract()
					.response();

//		String resp = response.asPrettyString();
//
//		System.out.println(resp);
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		
		Headers head = response.headers();
		
		List<Header> value = head.asList();
		
		Header a = value.get(0);
		
			System.out.println(a.getName()+" "+a.getValue());
			
			
			System.out.println("****************************");
			
		
			
			
		
		
	}


}
