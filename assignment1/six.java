//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 

import java.util.*;
class six
{
	public static void main(String args[])
	{
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Input First Number: ");
		int x = sc.nextInt();
		System.out.println("Input Second Number: ");
		int y = sc.nextInt();
		int divide = x/y;
		int add = x+y;
		int multiply = x*y;		
		int subtract = x-y;
		int mod= x%y;
		System.out.println("Expected Output: ");
		System.out.println(x+ " + " +y+ " = " +add);
		System.out.println(x+ " - " +y+ " = " +subtract);
		System.out.println(x+ " x " +y+ " = " +multiply);
		System.out.println(x+ " / " +y+ " = " +divide);	
		System.out.println(x+ " mod " +y+ " = " +mod);	
}
}