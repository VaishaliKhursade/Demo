package exceptions_Assignment_3_OOps;

	/*Q3.Create user defined exception and name it as
	BalanceWithinRange
	Create a Bank class and write a method to check to a check
	minimum balance in your account(ask the balance from user)
	a)balance less than 10000 should give an exception...with a
	message
	“Balance is not within the range..please maintain the amount”
	b)else your account balance is maintained*/

public class BalanceWithinRange extends Exception
{
	BalanceWithinRange(String s)
	{
		super (s);
	}
}
