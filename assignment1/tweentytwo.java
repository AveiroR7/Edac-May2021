import java.util.*;
class tweentytwo
{
  public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Binary number: ");
	String a = input.next();	
    int x = Integer.parseInt(a,2);   
	
	System.out.println("Decimal numbers: " +x );
  
  }
}
