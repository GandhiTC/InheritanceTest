package package2;



import package1.PublicModifier;



public class PublicTester3 extends PublicModifier
{
	public static void main(String[] args)
	{
		new PublicTester3().Tester1();
	}
	
	
	public void Tester1()
	{
		System.out.println(version);
		System.out.println(processOrder());
	}
}
