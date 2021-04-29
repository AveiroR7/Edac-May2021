//Write a Java program to add two numbers and print on the screen

import java.util.*;
class second
{
	public static void main(String args[])
	{
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int y = sc.nextInt();
		int z = x+y;
		System.out.println("Expected Output: ");
		System.out.println(z);
	}
}
