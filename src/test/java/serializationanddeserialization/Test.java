package serializationanddeserialization;

public class Test {
	
	
	String name;
	
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.setName("Eder");
		
		String s= t.getName();
		
		System.out.println(s);
		
	}
	
	
	

}
