import java.util.Scanner;

public class sumarray {
	
	//create a function that takes an array and it should return the sum of the elements in the array
	
		public static int sumFunc(int arr[])
		{
			int sum=0;
			for(int element=0;element<arr.length;element++)
			{
				sum=sum+arr[element];
				
			}
			return sum;
		}
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			int n;
			System.out.println("Length of Array: ");
			n=input.nextInt();
			int array [] = new int[n];
			
			System.out.println("Enter the array Elements : ");
			
			for(int element=0;element<array.length;element++)
			{
				array[element]=input.nextInt();
				
			}
			
			
			int b = sumFunc(array);
			System.out.println("The Sum : "+b);
			
			input.close();
		}
}
