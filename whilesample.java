import java.util.Scanner;
public class whilesample {

	public static void main(String[] args)
	{
		whilesample vk = new whilesample();
		vk.sum();
		vk.multi();
		vk.oddnum();
		
		vk.evennum();
		vk.givennum();
		vk.givenmult();
		vk.givennums();
		vk.givennumss();
		
				
		
		

	}
     private void sum()
     {
    	Scanner vk01 = new Scanner(System.in);
    	System.out.println("Enter a sum of number");
    	int sums = vk01.nextInt();
    	 
    	 int total=0;
 		int num =1;
 		
 		while(num<=sums)
 		{
 			
 			total = total + num;
 			System.out.print(num+"+");
 			num = num +1;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     private void multi()
     {
    	 Scanner vk02 = new Scanner(System.in);
     	System.out.println("Enter a multiple of number");
     	int multi = vk02.nextInt();
     	 
    	 int total=1;
 		int num =1;
 		
 		while(num<=multi)
 		{
 			
 			total = total * num;
 			System.out.print(num+"*");
 			num = num +1;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     
     private void oddnum()
     {
    	 Scanner vk03 = new Scanner(System.in);
      	System.out.println("Enter a Odd of number");
      	int odd = vk03.nextInt();
    	 int total=0;
 		int num =1;
 		
 		while(num<=odd)
 		{
 			
 			total = total + num;
 			System.out.print(num+"+");
 			num = num +2;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     private void evennum()
     {
    	 Scanner vk04 = new Scanner(System.in);
       	System.out.println("Enter a Even of number");
       	int even = vk04.nextInt();
    	 int total= 0;
 		int num =2;
 		
 		while(num<=even)
 		{
 			
 			total = total + num;
 			System.out.print(num+"+");
 			num = num +2;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     private void  givennum()
     {
    	 Scanner vk05 = new Scanner(System.in);
       	System.out.println("Enter a  of number to 1+3+7.....n");
       	int givennum = vk05.nextInt();
    	 int total= 0;
 		int num =1;
 		
 		while(num<=givennum)
 		{
 			
 			total = total + num;
 			System.out.print(num+"+");
 			num = num +3;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     private void  givenmult()
     {
    	 Scanner vk05 = new Scanner(System.in);
       	System.out.println("Enter a  of number to 1+2+4....n");
       	int givennum = vk05.nextInt();
    	 int total= 1;
 		int num =1;
 		
 		while(num<=givennum)
 		{
 			
 			total = total * num;
 			System.out.print(num+"+");
 			num = num *2;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     
     private void  givennums()
     {
    	 Scanner vk05 = new Scanner(System.in);
       	System.out.println("Enter a  of number to 1+2+6+24....n");
       	int givennum = vk05.nextInt();
    	 int total= 1;
 		int num =1;
 		int i =2;
 		
 		while(num<=givennum)
 		{
 			
 			total = total + num;
 			System.out.print(num+"+");
 			num = num *i;
 			i = i+1;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     private void  givennumss()
     {
    	 Scanner vk05 = new Scanner(System.in);
       	System.out.println("Enter a  of number to 1+2+8+48....n");
       	int givennum = vk05.nextInt();
    	 int total= 1;
 		int num =1;
 		int i =2;
 		
 		while(num<=givennum)
 		{
 			
 			total = total * num;  
 			System.out.print(num+"+");
 			num = num *i; 
 			i = i+2;
 			
 			
 		}
 		System.out.println();
 		
 		System.out.println("Total = "+total);
    	 
     }
     
}


