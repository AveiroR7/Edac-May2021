import java.util.*;
class fibonacci
{
	public static void main(String args [])
	{
		int num1 =0;
		int num2 =1, sum=0;
		
		for(int i=1;i<=10;i++)
		{
			sum = num1+num2;
			
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
		}
		
	}
}