package spotifyapis;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
		requestSpecBuilder.addHeader("Authorization", "Bearer BQDjTZ8rBN3NFcZmNGKCVx7GLMTDEsRaqzHtIAODSrgLENWMQwskbRyF9Ys8u-5OJo37RBM8OacWYkzFSVgVqRNONpNGwDKja0gSyaSpLjtyk7wICadu73daGy3_cp9hnjcowH30d0rI3f9rMA4or--qt48oPzDqDoF43GKJ_gWpHgazQAN0UK5CdETQ60Ry10As6xkCmaUq0Z7WaH65CnVDKlyykht5ovf4X13_heimJTet-OZZrZSFWxI60F9H8Axz0S5ZQcwtaiZC");
		
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
				+ "    \"name\": \"Deshbhakti songs playlist\",\r\n"
				+ "    \"description\": \" songs playlist\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.when()
		.log().all()
		
		.post("/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.log().all()
		
		.body("name", equalTo("Melody songs playlist"));
		
	}

}
