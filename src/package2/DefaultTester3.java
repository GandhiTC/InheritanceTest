package package2;



import package1.DefaultModifier;



/*
	TEST:  Extend a class from another package that has items with default modifier
	
	
	Because the DefaultModifier class is public, we are able to extend it.
	
	However, we cannot access (String) version or (boolean) processOrder()
	because anything that does not specify an access modifier,
	cannot be accessed outside it's package.
	
	As such, only classes that are in the same package as
	the super class can have access.
	(see DefaultTester1 and DefaultTester2 for examples)
*/



public class DefaultTester3 extends DefaultModifier
{
	public static void main(String[] args)
	{
		new DefaultTester3().Tester1();
	}


	public void Tester1()
	{
		//	Uncomment the following 2 lines to see error in access.
		
//		System.out.println(version);
//		System.out.println(processOrder());
		
		System.out.println("DefaultTester3 completed.");
	}
}
