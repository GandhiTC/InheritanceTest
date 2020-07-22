package package2;



import package1.DefaultModifier;



/*
	TEST:  Instantiate a class from another package that has items with default modifier
	
	
	Because the DefaultModifier class is public, we are able to instantiate it.
	
	However, we cannot access (String) version or (boolean) processOrder()
	because anything that does not specify an access modifier,
	cannot be accessed outside its package.
	
	As such, only classes that are in the same package as
	the instantiated class can have access.
	(see DefaultTester1 and DefaultTester2 for examples)
*/



public class DefaultTester4
{
	public static void main(String[] args)
	{
		new DefaultTester4().Tester2();
	}


	public void Tester2()
	{
		@SuppressWarnings("unused")
		DefaultModifier dm = new DefaultModifier();
		
		//	Uncomment the following 2 lines to see error in access.
		
//		System.out.println(dm.version);
//		System.out.println(dm.processOrder());
		
		System.out.println("DefaultTester4 completed.");
	}
}
