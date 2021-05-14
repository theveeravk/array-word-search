import java.util.Scanner;

public class strongno {

	public static void main(String[] args) 
	{
		strongno vk = new strongno ();
		vk.Strongno();
		
	}
	public void Strongno()
	{
		Scanner vkl = new Scanner(System.in);
		   System.out.println("Enter  a number");
		   int no =vkl.nextInt();
		   int num = no;
		int sum =0;
		
		while(no>0)
		{
			int digit = no%10;
			int f = fact(digit);
			 sum = sum + f;
			 no = no/10;
		}
		System.out.println(sum);
		if(sum == num)
	    {
	     System.out.println("Reverse number is a Strong number");
	    }
	  else
	  {
		  System.out.println("Reverse number is a not strong number");
	  }
	}
	public int fact(int digit)
	{
		
		int fact =1;
		
		while(digit>0)
		{
			fact = fact * digit;
			digit= digit-1;
		}
		return fact;
		
	}
	
	 
  
	
	
}


