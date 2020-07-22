package package1;



/*
	Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.
	
	Private access modifier is the most restrictive access level. Classes and interfaces cannot be private.
	
	Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.
	
	Using the private access modifier is the main way that an object encapsulates itself and hides data from the outside world.
*/



public class PrivateModifier
{
	private String format = "This is the default value for 'private String format'";


	public String getFormat()
	{
		return this.format;
	}


	public void setFormat(String format)
	{
		this.format = format;
	}
}
