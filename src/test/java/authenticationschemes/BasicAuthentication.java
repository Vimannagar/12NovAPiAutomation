package authenticationschemes;

import java.util.Base64;

public class BasicAuthentication {
	
	
	public static void main(String[] args) {
		
		String usernameColonPassword = "postman:password";
		
	String base64encoded = Base64.getEncoder().encodeToString(usernameColonPassword.getBytes());
		
	
	System.out.println("Encoded is "+base64encoded);
	
	byte[] decodedString = Base64.getDecoder().decode(base64encoded);
	
	String s = new String(decodedString);
	
	System.out.println(s);
		
	}

}
