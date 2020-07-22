package package2;



import package1.ProtectedModifier;



/*
	TEST:  Instantiate a class from another package that has items with protected modifier
	
	
	Because the ProtectedModifier class is public, we are able to instantiate it.
	
	Because we are instantiating a class rather than inheriting from it,
	the instantiated class' items with protected access modifier cannot be accessed.
	
	Protected access modifier will not allow access to fields/methods to
	any classes outside of the instantiated class' package.
	(However, it is allowed if you extend the class instead of instantiating)
*/



public class ProtectedTester4
{
	public static void main(String[] args)
	{
		new ProtectedTester4().Tester2();
	}
	
	
	public void Tester2()
	{
		ProtectedModifier pm = new ProtectedModifier();
		
		//	Uncomment the following line to see error in access.
		
//		System.out.println(pm.format);
		
		//	We can access the String indirectly through a public accessor/getter method.
		System.out.println(pm.getFormat());
		
		//	With public mutator/setter methods, we can set values of protected fields.
		pm.setFormat("This is the new value for protected String format");
		System.out.println(pm.getFormat());
	}
}
