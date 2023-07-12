package api;

import static io.restassured.RestAssured.given;

import com.spotify.pojo.PlayList;

import io.restassured.response.Response;

public class PlaylistAPI {

	public static Response post(PlayList requestplaylist)
	{
		
		return given(SpecBuilder.getReqSpec())
				
		.body(requestplaylist)
		.when()
	
		
		.post("/v1/users/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.spec(SpecBuilder.getResSpec())
		.extract()
		
		.response();
		
	}
	
	
	public static Response get(String playlistID)
	{
			
		return given(SpecBuilder.getReqSpec())
				
		.when()
		
		.get("v1/playlists/"+playlistID)
		
		.then()
		
		.spec(SpecBuilder.getResSpec())
		
		.extract()
		
		.response();
		
		
		
	}
	
	
	
}
