import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		
		reverse  vk = new reverse ();
		vk.reverse();
		vk. ArmStrongNo();
		
	}
	


public void reverse()
{
   Scanner vkl = new Scanner(System.in);
   System.out.println("Enter  Reverse number");
   int num =vkl.nextInt();
   int num2 = num;
	  int output= 0;
	  while(num>0)
	  {
		output =(output *10) +num %10;
		 num = num/10;
		 
	  }
	  System.out.println(output);
	  
	  
	  if(output == num2)
	    {
	     System.out.println("Reverse number is a palindrome");
	    }
	  else
	  {
		  System.out.println("Reverse number is a not palindrome");
	  }
	}
public void ArmStrongNo()
{
	Scanner vkl = new Scanner(System.in);
	   System.out.println("Enter  a number");
	   int num =vkl.nextInt();
  int output =0;
  int num2 = num;
  
  while(num >0)
  {
	   int rem = num%10;
	  output =output+ (rem * rem * rem);
	  num = num/10;
  }
  System.out.println(output);
  
  if(output == num2)
  {
	     System.out.println("Given number is a ArmStrongNo");
  }
 else
	{
		System.out.println("Given number is a not ArmStrongNo");
 }
	
}
}

