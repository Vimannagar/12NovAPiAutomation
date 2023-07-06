package basics;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers.*;

public class JsonBody {

	
	
	public static String getBody()
	{
		String body= "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"raventest\",\r\n"
				+ "  \"firstName\": \"Raven\",\r\n"
				+ "  \"lastName\": \"Jack\",\r\n"
				+ "  \"email\": \"raven.jack@gmail.com\",\r\n"
				+ "  \"password\": \"Test@12345\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}" ;
		
		return body;
	}
	

	public static String getBodynew()
	{
		String body= "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"raventest\",\r\n"
				+ "  \"firstName\": \"Raven\",\r\n"
				+ "  \"lastName\": \"Jack\",\r\n"
				+ "  \"email\": \"raven.jack@gmail.com\",\r\n"
				+ "  \"password\": \"Test@12345\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}" ;
		
		return body;
	}
	
	
	
	@Test
	public void compareJSON() throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper	objectMapper = new ObjectMapper();
		JsonNode jsonNode1 = objectMapper.readTree(getBody());
		JsonNode jsonNode2 = objectMapper.readTree(getBodynew());
		
		// Checking if both json objects are same
		System.out.println(jsonNode1.equals(jsonNode2));
	}
	
	
}
