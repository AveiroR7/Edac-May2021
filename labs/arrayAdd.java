import java.util.*;

class arrayAdd
{	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int arrayMatrix_1[][] = new int[2][2];
		int arrayMatrix_2[][] = new int[2][2];
		int arrayMatrix_3[][] = new int[2][2];
		
		System.out.println(" Enter Values for Matrix 1 ");
		
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					{
						arrayMatrix_1[i][j]= input.nextInt();
					}
				System.out.println();
			}
			
		System.out.println(" Enter Values for Matrix 2 ");
		
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					{
						arrayMatrix_2[i][j]= input.nextInt();
					}
				System.out.println();
			}
			
		System.out.println(" The Addition of the Matrix is : ");
		
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					{
						arrayMatrix_3[i][j]=arrayMatrix_1[i][j] + arrayMatrix_2[i][j];
					}
			}
		
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					{
						System.out.print(arrayMatrix_3[i][j] + "  " );
					}
				System.out.println();
			}
	}
}
