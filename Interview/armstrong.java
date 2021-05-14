import java.util.*;
class armstrong 
{
	public static void main(String args [])
	{
		int remainder =0;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		int checker = num;
		while(num>0)
		{
			remainder = num%10;
			num = num/10;
			sum = sum+(remainder*remainder*remainder);
			
		}
		if(checker==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println(" Not an Armstrong Number");
		}
		
	}
}