package ecom;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AddProduct extends BaseData {
	
	@Test
	public void addProductToApp()
	{
		
		String path = System.getProperty("user.dir");
	
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		Response productresp = given()
				
				
		
		.header("Authorization", token)
		
		.param("productName", "Casual jeans")
		.param("productAddedBy", userid)
		.param("productCategory", "fashion")
		.param("productSubCategory", "Trouser")
		.param("productPrice", "1500")
		.param("productDescription", "Levis")
		.param("productFor", "Women")
		
		
		.multiPart("productImage", new File(path+"\\src\\test\\resources\\testimages\\Levis Jeans.png"))
		
		.log().all()
		
		.when()
		
		.post("api/ecom/product/add-product")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		JsonPath js = productresp.jsonPath();
		
		productId = js.getString("productId");
		
		
		
	}

}
