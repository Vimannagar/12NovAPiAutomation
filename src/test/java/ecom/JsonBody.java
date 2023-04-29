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
	
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		
		System.out.println(path+"\\src\\test\\resources\\testimages\\Levis Jeans.png");
		

	}
	
}
