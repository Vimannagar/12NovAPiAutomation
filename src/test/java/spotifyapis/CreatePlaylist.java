package spotifyapis;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatePlaylist {
	
	RequestSpecification  requestSpecification;
	ResponseSpecification responseSpecification;
	@BeforeClass
	public void reqResSpec()
	{
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
		
		requestSpecBuilder.setBaseUri("https://api.spotify.com");
		requestSpecBuilder.setBasePath("/v1/users");
		requestSpecBuilder.setContentType(ContentType.JSON);
		requestSpecBuilder.addHeader("Authorization", "Bearer BQCsh_qD6_O4lSG4KKoCFGpruk86OkTrIhx3o8glK1zDkv7Z_X-aiRT339urgW5wY30gQy8-Foy3IsalcHw7aABFRZq5hI1HGfto4qM4lCmuL671j95yBaWmyaeAwNgv37WZAIoDDuUPdZNGUdc-UPpwJUq2pPiVR9ynWiUIjmqUyvig0BG1vr-MCrT6TGHs8FZT0WEEX7i0uRPYYEVxMCHD9BQXwnbTA5cg0yF3iWNSteg5lfd6JNPCYDg_mSYzRXSvF2uqynbE6G2a");
		
		requestSpecification = requestSpecBuilder.build();
		
		
		ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
		
		responseSpecBuilder.expectContentType(ContentType.JSON);
		responseSpecification= responseSpecBuilder.build();
		
	}
	
	
	@Test
	public void createPlayList()
	{
		given(requestSpecification)
		.body("{\r\n"
				+ "    \"name\": \"Autmation Playlist created on 13th Dec\",\r\n"
				+ "    \"description\": \"Classic songs playlist\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.when()
		.log().all()
		
		.post("/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.log().all()
		.extract()
		.response();
		
	}

}
