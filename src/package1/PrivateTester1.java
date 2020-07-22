package package1;



public class PrivateTester1 extends PrivateModifier
{
	public static void main(String[] args)
	{
		new PrivateTester1().Tester1();
	}
	
	
	public void Tester1()
	{
		//	cannot directly access String format from outside of
		//	PrivateModifier class because it was marked as private.
//		System.out.println(format);
		
		//	However, we can access the String through a public accessor/getter method.
		System.out.println(getFormat());
		
		//	With public mutator/setter methods, we can set values of private fields.
		setFormat("This is the new value for 'private String format'");
		System.out.println(getFormat());
	}
}
