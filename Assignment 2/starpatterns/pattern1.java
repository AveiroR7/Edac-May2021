import java.util.*;
class pattern1
{
	public static void main(String args[])
		{
			System.out.println("Enter the number of stars: ");
			Scanner input = new Scanner(System.in);
			int n= input.nextInt();
				for(int i=0;i<=n;i++) 
					{
						for(int j=0;j<=n;j++) 
						{
							if(j<i)
							{
								System.out.print("*");
							}	
						}
					System.out.println();
					}
			}
}		
