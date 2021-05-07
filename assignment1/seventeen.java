import java.util.*;
class seventeen
{
  public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the First binary number: ");
	String a = input.next();	
    int x = Integer.parseInt(a,2);   
	System.out.println("Enter the Second binary number: ");
	String b = input.next();
	int y = Integer.parseInt(b,2);
	int z = x+y;	
	
	System.out.println("Sum of two binary numbers: " +Integer.toBinaryString(z));
  
  }
}
