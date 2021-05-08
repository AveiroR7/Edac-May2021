class abstracting
{
	public void display()
	{	
		System.out.println("Hello Cdac !!");
	}
}


class abstraction
{		
	public static void main(String args[])
	{
		abstracting disp = new abstracting();   //Calling class abstracting from above class and creating its object called disp.
		disp.display();
	}
}
		
		