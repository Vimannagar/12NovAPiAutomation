package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetDataFromJson {

	
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		
Response response = given()
		
					.when()
		
					.get("api/users?page=2")
		
					.then()
		
					.extract()
		
					.response();

		String resp = response.asPrettyString();

		System.out.println(resp);
		
		JsonPath jp = response.jsonPath();
		
		int totalvalue = jp.getInt("total");
		
		System.out.println(totalvalue);
		
		String textvalue = jp.getString("support.text");
		
		System.out.println(textvalue);
		
		int size = jp.getInt("data.size()");
		
		System.out.println("Size of data array is "+size);
		
		for(int i =0; i<size; i++)
		{
			String emailaddress = jp.getString("data["+i+"].email");
			
			System.out.println(emailaddress);
		}
		
		
		
//		email for 0th index position:
		
		String emailof0index = jp.getString("data[0].email");
		
		System.out.println(emailof0index);
		
		
//		Fetch lastname whose email is lindsay.ferguson@reqres.in
		
		for(int i=0; i<size; i++)
		{
			String email = jp.getString("data["+i+"].email");
			
			if(email.equals("lindsay.ferguson@reqres.in"))
			{
				String lastname = jp.getString("data["+i+"].last_name");
				System.out.println(lastname);
			}
		}
		
		
		
}
}
