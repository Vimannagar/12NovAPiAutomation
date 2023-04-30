package ecom;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteProduct extends BaseData {
	
	
	@Test
	public void deletingProduct()
	{
RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		given()
		
		.header("Authorization", token)
		
		.pathParam("prdid", productId)
		
		.log().all()
		
		.when()
		
		.delete("/api/ecom/product/delete-product/{prdid}")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
		
		
		
		
	}

}
