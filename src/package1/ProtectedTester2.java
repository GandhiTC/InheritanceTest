package package1;



/*
	TEST:  Instantiate a class from the same package that has items with protected modifier
	
	
	Because the ProtectedModifier class is public, we are able to instantiate it.
	
	Because this class and the instantiated class are in the same package,
	the instantiated class' items with protected access modifier can be accessed.
*/



public class ProtectedTester2
{
	public static void main(String[] args)
	{
		new ProtectedTester2().Tester2();
	}
	
	
	public void Tester2()
	{
		ProtectedModifier pm = new ProtectedModifier();
		
		System.out.println("From directly accessing 'pm.format' \r\n\t" + pm.format + "\r\n");
		
		pm.format = "A new string value";
		System.out.println("From directly accessing 'pm.format' after setting a new value directly \r\n\t" + pm.format + "\r\n");
		
		System.out.println("Via pm.getFormat() \r\n\t" + pm.getFormat() + "\r\n");
		
		pm.setFormat("This is yet another new value for protected String format");
		System.out.println("Via pm.getFormat() after using pm.setFormat() \r\n\t" + pm.getFormat() + "\r\n");
	}
}
