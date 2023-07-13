package api;

import static io.restassured.RestAssured.given;

import com.spotify.pojo.PlayList;

import io.restassured.response.Response;

public class PlaylistAPI {

	public static Response post(PlayList requestplaylist, String token)
	{
		
		return given(SpecBuilder.getReqSpec())
				.header("Authorization", "Bearer "+token)
				.body(requestplaylist)
		.when()
			
		.post("/v1/users/31h7vhk7of7iiimi6yw72ywxpwbe/playlists")
		
		.then()
		.spec(SpecBuilder.getResSpec())
		.extract()
		
		.response();
		
	}
	
	
	public static Response get(String playlistID, String token)
	{
			
		return given(SpecBuilder.getReqSpec())
				.header("Authorization", "Bearer "+token)
		.when()
		
		.get("v1/playlists/"+playlistID)
		
		.then()
		
		.spec(SpecBuilder.getResSpec())
		
		.extract()
		
		.response();
		
		
		
	}
	

	public static Response update(String playlistID,PlayList requestplaylist, String token )
	{
			
		return given(SpecBuilder.getReqSpec())
			.header("Authorization", "Bearer "+token)
		.when()
		
		.body(requestplaylist)
		
		.put("v1/playlists/"+playlistID)
		
		.then()
		
		.extract()
		
		.response();
		
		
		
	}
	
	
	
	
	
}
