package package2;



import package1.PublicModifier;



public class PublicTester4
{
	public static void main(String[] args)
	{
		new PublicTester4().Tester2();
	}


	public void Tester2()
	{
		PublicModifier pm = new PublicModifier();
		
		System.out.println(pm.version);
		System.out.println(pm.processOrder());
	}
}
