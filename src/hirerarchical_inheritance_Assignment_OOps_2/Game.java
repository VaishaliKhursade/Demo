package hirerarchical_inheritance_Assignment_OOps_2;

	/* 2) Write program for following inheritances
	a) Game has one data member as typeOfGame
	and a Parameterized constructor.
	b) Football, Cricket are subclasses
	c) Cricket has two subclasses Batsman and Baller
	d) For each classes create a parameterized
	constructor use super keyword
	e) For football playerName,noOfgoals is the data
	member use parameterized constructor and a
	method to print the details .
	f) For cricket typeOfPlayer is the data member and
	use parameterized constructor and a method to
	print the details .*/

public class Game 
{
	String typeOfGame;
	
	Game(String typeOfGame)
	{
		this.typeOfGame = typeOfGame;
	}
	
	void display()
	{
		System.out.println("typeOfGame");
	}

}
