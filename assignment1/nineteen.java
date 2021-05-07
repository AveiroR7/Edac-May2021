import java.util.*;
public class nineteen
{
	public static void main(String args[])
	{
		System.out.println("Enter the Decimal number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		long binary = convert(number);
		System.out.println("Converted Binary: " +binary);
	}
	
	public static long convert(int x)
		{
			long bin=0;
			int remainder, i=1;
			
			while(x!=0)
			{
				remainder = x % 2;
				x = x /2;  //for quotient
				bin = bin + remainder *i;
				i=i*10;
			}
			
			return bin;
		}
		
}
				