import java.util.*;
class tweentyfour
{
  public static void main(String[] args) 
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Binary number: ");
	String a = input.next();
	
    int x = Integer.parseInt(a,8);   
	System.out.println(" The octal number : " +x);
	
   }
}