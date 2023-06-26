package hamcrestassertions;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.core.IsNot;

public class GetAllWorkspaces {
	

	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://api.postman.com";
		
		
					given()
					.header("x-api-key", "")
		
					.when()
		
					.get("/workspaces")
		
					.then()
				
					.assertThat()
					
					.header("Transfer-Encoding", "chunked")
					
					.log().all()
															
//					.body("workspaces.name", contains( "My Workspace","Team Workspace", "My Workspace", "ATTWorkspace", "TestWorkspace"));
					
					
//					.body("workspaces.name", hasItem("My Workspacce"));
	
//					.body("workspaces.name", contains("Team Workspace", "My Workspace", "My Workspace", "ATTWorkspace", "TestWorkspace"));

					.body("workspaces.name", containsInAnyOrder( "My Workspace", "My Workspace","Team Workspace", "ATTWorkspace", "TestWorkspace"))
					
					.body("workspaces[0]", hasKey("id"))
					
					.body("workspaces[0]", hasEntry("id", "52baa379-4b6a-4992-86a3-467cd73febf9"));
					
					
					
}
}
