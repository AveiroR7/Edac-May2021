// Write a Java program to swap two variables
import java.util.*;
public class fifteen
{
	public static void main(String args[])
		{
			int a=10,b=20,temp;
			System.out.println("BEFORE SWAP");
			System.out.println("A= " +a + " B= " +b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("AFTER SWAP");
			System.out.println("A= " +a + " B= " +b);
		}
}