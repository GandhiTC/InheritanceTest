package package1;



/*
	TEST:  Instantiate a class from the same package that has items with default modifier
	
	
	Because the DefaultModifier class is public, we are able to instantiate it.
	
	Because this class and the instantiated class are in the same package,
	items from the instantiated class, with default access modifier, can be accessed.
*/



public class DefaultTester2
{
	public static void main(String[] args)
	{
		new DefaultTester2().Tester2();
	}


	public void Tester2()
	{
		DefaultModifier dm = new DefaultModifier();
		
		System.out.println(dm.version);
		System.out.println(dm.processOrder());
		
		System.out.println("DefaultTester2 completed.");
	}
}
