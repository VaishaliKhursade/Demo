package abstraction_Assignment_1_OOps;

/*Create a class called GeneralBank which acts as base class for
all banks. This class has functionality /methods
getSavingInterestRate() and getFixedInterestRate() methods,
which return the saving a/c rate of interest and fixed account rate
of interest the specific bank gives. Since GeneralBank cannot
say what percentage which bank would give, make it abstract.
a). Create 2 subclasses of GeneralBank called ICICIBank and
KotMBank. Override the methods from base class. ICICI -
Savings 4% Fixed 8.5% and KotMBank. - Savings 6% Fixed 9%
Callthe methods respectively...
Note..ask the saving amount ad fixed amout from user...*/

public abstract class GeneralBank 
{
	abstract void getSavingInterestRate();
	
	
	abstract void getFixedInterestRate();

}
