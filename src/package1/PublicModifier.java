package package1;

import java.util.Random;

/*
	A class, method, constructor, interface, etc. declared public can be accessed from any other class.
	Therefore, fields, methods, blocks declared inside a public class can be accessed from any class belonging to the Java Universe.
	
	However, if the public class we are trying to access is in a different package, then the public class still needs to be imported.
	Because of class inheritance, all public methods and variables of a class are inherited by its subclasses.
*/



public class PublicModifier
{
	public String version = System.getProperty("java.version");


	public boolean processOrder()
	{
		return new Random().nextBoolean();
	}
}
