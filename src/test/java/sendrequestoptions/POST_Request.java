package sendrequestoptions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class POST_Request {
	RequestSpecification requestspecification;
	
	ResponseSpecification responsespecification;
	
	@BeforeClass
	public void prerequisite()
	{
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		
		requestspecbuilder.setBaseUri("https://5d65d56f-c3b6-4c37-b136-c76268809400.mock.pstmn.io");
		requestspecbuilder.addHeader("Content-Type", "application/json");
		requestspecbuilder.addHeader("x-mock-match-request-body", "true");
		
		requestspecbuilder.log(LogDetail.ALL);
		requestspecification = requestspecbuilder.build();
		
		
		ResponseSpecBuilder responsespecbuilder = new ResponseSpecBuilder()
		.expectStatusCode(201)
		.expectContentType(ContentType.JSON)
		.log(LogDetail.ALL);
		
		responsespecification = responsespecbuilder.build();
		
	}

	
	
	@Test
	public void sendPostReq()
	{
		HashMap<String, String> obj5001 = new HashMap<String, String>();
		obj5001.put("id", "5001");
		obj5001.put("type", "None");
		
		HashMap<String, String> obj5002	 = new HashMap<String, String>();
		obj5002.put("id", "5002");
		obj5002.put("type", "Glazed");
		
		List<Map<String, String>> jsonObject = new ArrayList<Map<String, String>>();
		
		jsonObject.add(obj5001);
		jsonObject.add(obj5002);
		
		given()
		
		.spec(requestspecification)
		
		.body(jsonObject)
		
		.when()
		
		.post()
		
		.then()
		
		.spec(responsespecification)
		
		.extract()
		
		.response();
		
		
		
		
	}
	
	
}
