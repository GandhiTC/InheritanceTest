package package2;



import package1.PrivateModifier;



public class PrivateTester4
{
	public static void main(String[] args)
	{
		new PrivateTester4().Tester2();
	}
	
	
	public void Tester2()
	{
		PrivateModifier pm = new PrivateModifier();
		
		//	cannot directly access String format from outside of
		//	PrivateModifier class because it was marked as private.
//		System.out.println(pm.format);
		
		//	However, we can access the String through a public accessor/getter method.
		System.out.println(pm.getFormat());
		
		//	With public mutator/setter methods, we can set values of private fields.
		pm.setFormat("This is the new value for 'private String format'");
		System.out.println(pm.getFormat());
	}
}
