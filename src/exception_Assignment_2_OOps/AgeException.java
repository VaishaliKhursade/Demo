package exception_Assignment_2_OOps;

/*Q2.Create a user-defined exception and name it as AgeException.
Create a class RollarCoaster and write a method which will
check the validity of age for the rollarcoaster ride...(age canbe
asked from user)
a)when the age is less than 12---you should throw a exception
with a message” Too young for the ride...come after ------years”
b) when the age is greater than 65---you should throw a
exception with a message” Too old for the ride...you should
have come before ....years”
c)Else enjoy the ride..*/

public class AgeException extends Exception
{
	AgeException(String s)
	{
		super (s);
	}
}
