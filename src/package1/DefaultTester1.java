package package1;



/*
	TEST:  Extend a class from the same package that has items with default modifier
	
	
	Because the DefaultModifier class is public, we are able to extend it.
	
	Because this class and the extended class are in the same package,
	items from the extended class, with default access modifier, can be accessed.
*/



public class DefaultTester1 extends DefaultModifier
{
	public static void main(String[] args)
	{
		new DefaultTester1().Tester1();
	}
	
	
	public void Tester1()
	{
		System.out.println(version);
		System.out.println(processOrder());
		
		System.out.println("\r\nDefaultTester1 completed.");
	}
}
