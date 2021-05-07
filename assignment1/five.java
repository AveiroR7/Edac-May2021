// Write a Java program that takes two numbers as input and display the product of two numbers. 

import java.util.*;
class five
{
	public static void main(String args[])
	{
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int y = sc.nextInt();
		int z = x*y;
		System.out.println("Expected Output: ");
		System.out.println(x+ " x " +y + " = " +z);
	}
}
