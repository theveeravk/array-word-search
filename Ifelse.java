
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) 
	{
		
	 
		
	
		
	}
	
	 
	
	public void ifelse()
	{
		Scanner vks = new Scanner(System.in);
		System.out.println("Enter number A value");
		int a =vks.nextInt();
		System.out.println("Enter number B value");
		int b =vks.nextInt();
		
     
		
		boolean result = a > b;
		
	
		  if(result)
		   {
			System.out.println("A is grater than ");
		    }
		   else
		   {
		    System.out.println("B is greater than");
		   }
		  System.out.println("-------------------------------------------");
		  System.out.println("-------------------------------------------");
		  System.out.println("-------------------------------------------");
		
			
		}
	
	  public void IfelseIf()
	  {
		  int a,b,c;
		  Scanner vkst = new Scanner(System.in);
			System.out.println("Enter number A value");
			 a =vkst.nextInt();
			System.out.println("Enter number B value");
		      b =vkst.nextInt();
			System.out.println("Enter number c value");
			c =vkst.nextInt();
			  if(a>b && a>c)
			   {
				System.out.println("A is grater than ");
			    }
			   else if(b>a && b>c)
			   {
			    System.out.println("B is greater than");
			   }
			   else 
			   {
				   System.out.println("C is greater than");
				   
			   }
			  System.out.println("-------------------------------------------");
			  System.out.println("-------------------------------------------");
			  System.out.println("-------------------------------------------");
					
	     
		  
	  }
	  public void Nestedif()
	  {
		  
		    Scanner vkss = new Scanner(System.in);
			System.out.println("Enter  vk age");
			int age  =vkss.nextInt();
			
			if(age > 18)
			{
				System.out.println("Vk is a big boy");
				
				if(age >= 18 && age <21)
				{
					System.out.println("Vk Studying ug degree");
				}
				else if(age >=21 && age < 23)
				{
					System.out.println("Vk Studying pg degree");
				}
				else if(age >=23 && age < 50)
				{
					System.out.println("Vk working");
				}
				else if(age >=50 && age <= 64)
				{
					System.out.println("Vk resting");
				}
			}
			else
			{
				System.out.println("vk is samall boy");
				
			}
			System.out.println("-------------------------------------------");
			System.out.println("-------------------------------------------");
			System.out.println("-------------------------------------------");
		  
		  
	  }
		
		
	}
	


