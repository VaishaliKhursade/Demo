package multilevel_inh_wit_constructor;

public class Sports extends Marks

{
	int score;
	
	Sports(int rollno,String name,char grade,int score)
	{
		super( rollno,name, grade);
		this.score = score;
		
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+grade+" "+score);
	}
	
	
	
	
	

}
