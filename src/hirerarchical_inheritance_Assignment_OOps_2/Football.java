package hirerarchical_inheritance_Assignment_OOps_2;

public class Football extends Game 
{
	String playerName;
	int noOfGoals;
	
	Football(String typeOfGame, String playerName, int noOfGoals)
	{
		super(typeOfGame);
		this.noOfGoals = noOfGoals;
		this.playerName = playerName;
	}
	
	void display()
	{
		System.out.println(typeOfGame+" "+noOfGoals+" "+playerName);
	}

}
