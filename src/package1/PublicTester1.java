package package1;



public class PublicTester1 extends PublicModifier
{
	public static void main(String[] args)
	{
		new PublicTester1().Tester1();
	}
	
	
	public void Tester1()
	{
		System.out.println(version);
		System.out.println(processOrder());
	}
}
