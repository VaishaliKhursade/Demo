package interfaces_Assignments_OOps5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Speed of Vehicle");
		int speed = sc.nextInt();
		
		Bike b = new Bike();
		System.out.println("Distance Travelled by Bike is : "+ b.speed(2, speed));
		
		Car c = new Car();
		System.out.println("Distance Travelled by Car is : "+ c.speed(3, speed));

	}

}
