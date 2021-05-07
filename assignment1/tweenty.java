import java.util.*;
class tweenty
{
  public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the decimal number: ");
	String a = input.next();	
    int x = Integer.parseInt(a,16);   
	
	if(x >9 && x<16)
		{
			switch(x)
				{
				case 10:
					System.out.println("A");
					break;
				case 11:
					System.out.println("B");
					break;
				case 12:
					System.out.println("C");
					break;
				case 13:
					System.out.println("D");
					break;
				case 14:
					System.out.println("E");
					break;
				case 15:
					System.out.println("F");
					break;
				} 
	    }
	
   }
}