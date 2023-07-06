package authenticationschemes;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;

public class Form_Authentication_POST {
	
	
	@BeforeClass
	public void beforeClass()
	{
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		requestspecbuilder.setRelaxedHTTPSValidation();
		requestspecbuilder.build();
	}
	
	
	
	@Test
	public void loginToApp()
	{
RestAssured.baseURI = "https://localhost:8443";
		
		
		given()
		 .config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		
		.auth()
		.form("dan", "dan123", new FormAuthConfig("/signin", "txtUsername", "txtPassword"))
				
		.log().all()
		.when()
		.get("/login")
		.then()
		.log().all()
		.extract()
		.response();

	}

}
