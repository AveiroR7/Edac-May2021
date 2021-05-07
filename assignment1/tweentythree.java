import java.util.*;
class tweentythree
{
  public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Binary number: ");
	String a = input.next();	
    int x = Integer.parseInt(a,2);   
	
		if(x >9 && x<16)
			{
				switch(x)
					{
					case 10:
						System.out.println("The Hexadecimal Number :"  + "A");
						break;
					case 11:
						System.out.println("The Hexadecimal Number :"  + "B");
						break;
					case 12:
						System.out.println("The Hexadecimal Number :"  + "C");
						break;
					case 13:
						System.out.println("The Hexadecimal Number :"  + "D");
						break;
					case 14:
						System.out.println("The Hexadecimal Number :"  + "E");
						break;
					case 15:
						System.out.println("The Hexadecimal Number :"  + "F");
						break;
					} 
			}
		else if(x!=0)
			{
				System.out.println("The Hexadecimal Number :" +x);
			}	
	
   }
}