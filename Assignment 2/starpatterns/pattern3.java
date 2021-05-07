import java.util.*;
class pattern3
{
	public static void main(String args[])
		{
			System.out.println("Enter the number of stars: ");
			Scanner input = new Scanner(System.in);
			int n= input.nextInt();
				for(int i=0;i<=n;i++) 
					{
						for(int j=n;j>=i;j--) 
						{
				 		System.out.print("*");
						}
					System.out.println();
					}
			}
}		