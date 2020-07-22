package package2;



import package1.ProtectedModifier;



/*
	TEST:  Extend a class from another package that has items with protected modifier
	
	
	Because the ProtectedModifier class is public, we are able to extend it.
	
	Even though the 2 classes are in separate packages,
	because this class inherits from the extended class,
	the extended class' items with protected access modifier can be accessed.
*/



public class ProtectedTester3 extends ProtectedModifier
{
	public static void main(String[] args)
	{
		new ProtectedTester3().Tester1();
	}
	
	
	public void Tester1()
	{
		System.out.println("From directly accessing 'format' \r\n\t" + format + "\r\n");
		
		format = "A new string value";
		System.out.println("From directly accessing 'format' after setting a new value directly \r\n\t" + format + "\r\n");
		
		System.out.println("Via getFormat() \r\n\t" + getFormat() + "\r\n");
		
		setFormat("This is yet another new value for protected String format");
		System.out.println("Via getFormat() after using setFormat() \r\n\t" + getFormat() + "\r\n");
	}
}