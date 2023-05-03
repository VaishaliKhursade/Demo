package abstraction_Assignment_1_OOps;

public class Test_Bank {

	public static void main(String[] args) 
	{
		ICICIbank i = new ICICIbank();
		i.getFixedInterestRate();
		i.getSavingInterestRate();
		
		System.out.println("----------------------------------");
		
		KotMBank k = new KotMBank();
		k.getFixedInterestRate();
		k.getSavingInterestRate();
	}

}
