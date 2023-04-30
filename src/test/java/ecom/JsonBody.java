package ecom;

public class JsonBody {

	public static String getLoginBody()
	{
		String s = "{\r\n"
				+ "    \"userEmail\": \"gouravjawale28@gmail.com\",\r\n"
				+ "     \"userPassword\": \"Test@1234\"\r\n"
				+ "}";
		return s;
	}
	
	public static String getOrdersBody(String prdid)
	{
		String s = "{\"orders\": [\r\n"
				+ "        {\r\n"
				+ "        \"country\": \"India\", \r\n"
				+ "        \"productOrderedId\" : \""+prdid+"\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		return s;
	}
	
	
	
	
}
