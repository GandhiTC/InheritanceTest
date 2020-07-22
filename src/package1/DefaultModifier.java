package package1;



import java.util.Random;



/*
	Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.
	
	A variable or method declared without any access control modifier is available only to classes within the same package.
	The protected access modifier allows access to sub classes, whereas default does not.
	
	The fields in an interface are implicitly public static final and the methods in an interface are by default public.
 */
	


public class DefaultModifier
{
	String version = System.getProperty("java.version");


	boolean processOrder()
	{
		return new Random().nextBoolean();
	}
}
