package package1;



public class PublicTester2
{
	public static void main(String[] args)
	{
		new PublicTester2().Tester2();
	}


	public void Tester2()
	{
		PublicModifier pm = new PublicModifier();
		
		System.out.println(pm.version);
		System.out.println(pm.processOrder());
	}
}
