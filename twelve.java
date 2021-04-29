//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.*;
public class twelve
{
	public static void main(String args[])
	{
		System.out.println("Enter First number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();
		System.out.println("Enter Third number: ");
		int z = sc.nextInt();
		int Average = (x+y+z)/3;
		System.out.println("The Average of Numbers :" +Average);
	}
}