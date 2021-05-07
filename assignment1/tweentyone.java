import java.util.*;
public class tweentyone
{
	public static void main(String args[])
	{
		System.out.println("Enter the Decimal number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int oct = convert(number);
		System.out.println("Converted octal Number: " +oct);
	}
	
	public static int convert(int x)
		{
			int octal =0,remainder;
			int i=1;

			while(x!=0)
				{
					remainder= x % 8;
					x = x / 8;
					octal = octal + remainder * i;
					i=i*10;
				}
			return octal;
		}
}