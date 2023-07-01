package multipart;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;

public class UploadFie {
	
	
	
	@Test
	public void uploadImage()
	{
		RestAssured.baseURI = "https://the-internet.herokuapp.com/";
		
		given()
		
		.multiPart("file", new File("C:\\Users\\DELL\\Desktop\\Test product image.png"))
		
		.when()
		
		.post("/upload")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
	}

}
