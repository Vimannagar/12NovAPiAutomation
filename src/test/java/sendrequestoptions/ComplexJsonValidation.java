package sendrequestoptions;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ComplexJsonValidation {
	
	
	@Test
	public void validateComplexJSON()
	{
//		body
		
		List<Integer> arrayOfID = new ArrayList<Integer>();
		
		arrayOfID.add(5);
		arrayOfID.add(9);
		
		HashMap<String, Object> batterhashmap1 = new HashMap<String, Object>();
		
		batterhashmap1.put("id", "1001");
		batterhashmap1.put("type", "Regular");
		
		HashMap<String, Object> batterhashmap2 = new HashMap<String, Object>();
		
		batterhashmap2.put("id", arrayOfID);
		batterhashmap2.put("type", "Chocolate");
		
		
		List<HashMap<String, Object>> batterarraylist = new ArrayList<HashMap<String, Object>>();
		batterarraylist.add(batterhashmap1);
		batterarraylist.add(batterhashmap2);
		
		HashMap<String, List<HashMap<String, Object>>> battershashmap = new HashMap<String, List<HashMap<String, Object>>>();
		
		battershashmap.put("batter", batterarraylist);
		
		
//		toppings 
		
		List<String> typearraylist = new ArrayList<String>();
		typearraylist.add("test1");
		typearraylist.add("test2");
		
		HashMap<String, Object > toppinghashmap2 = new HashMap<String, Object > ();
		
		toppinghashmap2.put("id", "5002");
		toppinghashmap2.put("type", typearraylist);
		
		
		HashMap<String, Object > toppinghashmap1 = new HashMap<String, Object > ();
		
		toppinghashmap1.put("id", "5001");
		toppinghashmap1.put("type", "None");
		
		
		List<HashMap<String, Object>> toppings = new ArrayList<HashMap<String, Object>>();
		
		toppings.add(toppinghashmap1);
		toppings.add(toppinghashmap2);
		
		
		HashMap<String , Object> mainJsonObject = new HashMap<String , Object>();
		
		mainJsonObject.put("id", "0001");
		mainJsonObject.put("type", "donut");
		mainJsonObject.put("name", "Cake");
		mainJsonObject.put("ppu", 0.55);
		mainJsonObject.put("batters", battershashmap);
		mainJsonObject.put("topping", toppings);
		
		
		RestAssured.baseURI = "https://5d65d56f-c3b6-4c37-b136-c76268809400.mock.pstmn.io";
		
		
		
		
		
		Response response = given()
							
							.header("Content-Type", "application/json")
							
							.header("x-mock-match-request-body", "true")
							
							.body(mainJsonObject)
							.log().all()
							.when()
				
							.post("/postcomplexjson")
				
							.then()
							.log().all()
				
							.extract()
				
							.response();

				String resp = response.asPrettyString();

				System.out.println(resp);
	}
	

}
