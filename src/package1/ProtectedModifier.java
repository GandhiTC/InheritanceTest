package package1;



/*
	Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by
	the subclasses in other packages, or classes within the package of the protected members' class.
	
	The protected access modifier cannot be applied to classes and interfaces.
	Methods and fields can be declared protected in classes but not in interfaces.
	
	Protected access gives the subclass a chance to use the helper method or variable,
	while preventing a non-related class from trying to use it.
*/



public class ProtectedModifier
{
	protected String format = "This is the default value for 'protected String format'";


	public String getFormat()
	{
		return this.format;
	}


	public void setFormat(String format)
	{
		this.format = format;
	}
}
