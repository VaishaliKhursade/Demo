package basicprograms;

public class Operators {

	public static void main(String[] args) 
	{
		
		// Arithmetic operators
		int num1=9;
		int num2=2;
		
		System.out.println("Sum of two numbers :" +(num1+num2));
		System.out.println("sub of two numbers :"+ (num1-num2));
		System.out.println("Mul of two numbers :" +(num1*num2));
		System.out.println("Div of two numbers :" +(num1/num2));
		System.out.println("Remainder of two numbers :" +(num1%num2));
//	--------------------------------------------------------------------------------------
	
		//Assignment - Operators
		
		int a=10;
		System.out.println(a);
		
		int b=20;
		b+=2;       // b=b+2....b=22
		System.out.println(b);
		
		int c=10;
		c-=2;       //c=c-2.....c= 8
		System.out.println(c);
		
		int d =8;
		d*=2;        //d=d*2.....d=16
		System.out.println(d);
		
		int e=9;
		e/=2;        //e=e/2      e=4
		
		System.out.println(e);
		
		int f =9;
		f%=2;         //f=f%2   ...  f=1
		System.out.println(f);
		System.out.println("-------------------------------------------------------");
		
		
		//Relational Operators
		
		System.out.println(9>2);
		System.out.println(9<2);
		System.out.println(2>=2);
		System.out.println(2<=3);
		System.out.println(2==3);
		System.out.println(2!=3);
	//	--------------------------------------------------------------------------
		
		
		
		//Increment and decrement(unary)
		
		int i=1;
		i++;      //increased by 1...i=i+1   
		
		System.out.println(i);
		
		int j=10;
		j--;
		System.out.println(j);
	//----------------------------------------------------------------------	
		
		//Logical AND....&& when both conditions are true the result will be true
		//Logical OR.... || when anyone of the condition is true the result will be true
		
		                //    t       t
		System.out.println(9>2 && 8>2);
		
		                //   t     f
		System.out.println(9>2 || 1>2);
		
		//Ternary/conditional operators(? :);
		
		int n1 = 9;
		int n2= 2;
		
		//9>2
		int large = (n1>n2)?n1:n2;
		System.out.println("largest number : " +large);
		
		
		
		
	}

}
