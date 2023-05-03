package multilevel_inheritance;

public class Sports extends Marks
{
	int score ;
	public void inputScore()
	{
		System.out.println("Enter your Score");	
		score = sc.nextInt();
	}
	
	
	public void display()
	{
		System.out.println(rollno+""+name+""+grade+""+score);
	}


}