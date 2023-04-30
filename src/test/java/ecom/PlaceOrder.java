package ecom;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PlaceOrder extends BaseData {
	
	
	@Test
	public void placingOrderTest()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		given()
		
		.header("Authorization", token)
		
		.header("Content-Type", "application/json")
		
		.body(JsonBody.getOrdersBody(productId))
		
		.log().all()
		
		.when()
		
		.post("api/ecom/order/create-order")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
		
	}

}
