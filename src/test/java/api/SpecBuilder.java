package api;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {
	
	

	
@Step
	public static RequestSpecification getReqSpec()
	{
		return new RequestSpecBuilder()
		
		.setBaseUri("https://api.spotify.com")
		.setContentType(ContentType.JSON)
		.addFilter(new AllureRestAssured())
		
		.log(LogDetail.ALL)
		.build();
	}

@Step
	public static ResponseSpecification getResSpec()
	{
		return new ResponseSpecBuilder()
				.log(LogDetail.ALL)
				.build();
	}
}
