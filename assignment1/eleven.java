// . Write a Java program to print the area and perimeter of a circle
import java.util.*;
public class eleven
{
	public static void main(String args[])
	{
		System.out.println("Enter the Radius: ");
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		System.out.println("Expected output: ");
		
		float peri = (3.14F *(x*2));
		float area = (3.14F *(x*x));
		System.out.println("Perimeter is = " +peri);
		System.out.println("Area is = " +area);
	}
}
	
		
		