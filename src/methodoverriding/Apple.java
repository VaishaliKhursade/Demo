package methodoverriding;

public class Apple extends Fruit
{
	void eat(String color)
	{
		//super.eat(sweet)
		System.out.println("Eating Apple ...."+color);
	}
}
