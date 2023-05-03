package hirerarchical_inheritance_Assignment_OOps_2;

public class Cricket extends Game
	
	{
	    String typeOfPlayer;
		
		Cricket(String typeOfGame, String typeOfPlayer)
		{
			super(typeOfGame);
			this.typeOfPlayer = typeOfPlayer;
		}
		
		void display()
		{
			System.out.println(typeOfGame+" "+typeOfPlayer);
		}
	}
