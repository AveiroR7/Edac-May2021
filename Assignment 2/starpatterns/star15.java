import java.util.Scanner;
public class star15 
{

	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
       System.out.println("Enter the row size:");
       int out,in;
       int row_size=input.nextInt();
       for(out=1;out<=row_size;out++)
       {
           for(in=1;in<=row_size;in++)
           {
               if(in==1 || out==in || out==row_size)
               {
                  System.out.printf("*");
               }
               else
               {
                System.out.printf(" ");    
               }
           }
           System.out.println(); 
       }
       input.close();
	}
}