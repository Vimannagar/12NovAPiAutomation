package api;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {
	
	
static String accessToken = "BQDIaoKFpS07xiiD-duiZulfHVUt3z4zLsftFRyxUIuDO5LBahPW-J4g0h957eXnpAlY1Zl7NnoBerNn5YQEE8o_halpOq5fXBHIsQBKT7i35kbJA7jraE8RPt4Fix94pb8JvfbF80gWf57PsirTKcUeBKOE-j0xnyKA4YFMlR2P4fw1TFSk3iHbpUOirhUP3_y8J0yV87z5age3o6mi7d-5YAoLBzSeaBYCh3nKbTDYV5tFcbU0HtZxGvAQ0HPg27zWNNI7SqJJtsxS";
	

	public static RequestSpecification getReqSpec()
	{
		return new RequestSpecBuilder()
		
		.setBaseUri("https://api.spotify.com")
		.setContentType(ContentType.JSON)
		.addHeader("Authorization", "Bearer "+accessToken)
		.log(LogDetail.ALL)
		.build();
	}

	
	public static ResponseSpecification getResSpec()
	{
		return new ResponseSpecBuilder()
				.log(LogDetail.ALL)
				.build();
	}
}
