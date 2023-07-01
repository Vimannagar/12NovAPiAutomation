package multipart;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DownloadFile {

	@Test
	public void uploadImage() throws IOException
	{
		RestAssured.baseURI = "https://github.com/";
		
		byte[] bytearray = given()
		
		
		.when()
		
		.get("/Vimannagar/12NovAPiAutomation/raw/master/src/test/resources/testimages/Levis Jeans.png")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response()
		
		.asByteArray();
		
		OutputStream os = new FileOutputStream(new File("F:\\Desktop\\VimanNagar\\ATT\\Levis Jeans1.png"));
		
		os.write(bytearray);
		
		os.close();
	}
	
}
