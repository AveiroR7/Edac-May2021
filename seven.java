//7. Write a Java program that takes a number as input and prints its multiplication table upto 10


import java.util.*;
class seven
{
	public static void main(String args[])
	{
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int x = sc.nextInt();
		System.out.println("Expected Output: ");
		int end = 11;
		for(int start=1;start<end;start++)     
		{
			int y=start*x;
		
		System.out.println(x+" X "+start+" = "+y);	
		}
	}
}
