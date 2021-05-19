
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args)
	{
		pattern2 vk = new pattern2();
		vk.pattern();
		vk.pattern1();
		
		vk.pattern3();
		vk.pattern4();
		vk.pattern5();
	}
	
	public void pattern()
	{
		
		int row = 5;
		int i =1;
		while(row>=1)
		{
			
		int col =1;
		
		while(col<=row)
		{
			System.out.print(i);
			col++;
			
		}
		System.out.println();
		i++;
         row--;
		}
	}
	public void pattern1()
	{
	
		int i = 5;
		int row =5;
		while(row>=1)
		{
		int col =1;
		while(col <=row)
		{
			System.out.print(i);
			col++;
		}
		System.out.println();
		i--;
		row--;
		}
		
	}
	public void pattern3()
	{
	
		int i = 5;
		int row =5;
		while(row>=1)
		{
		int col =1;
		while(col <=row)
		{
			System.out.print(row);
			col++;
		}
		System.out.println();
		i--;
		row--;
		}
		
	}
	public void pattern4()
	{
	  
		int i = 5;
		int row =5;
		while(row>=1)
		{
		int col =1;
		while(col <=row)
		{
			System.out.print(row -col+1);
			col++;
		}
		 int star =1;
		while(star <=5)
		{
		System.out.print("*"+" ");
		star ++;
		}
		System.out.println();
		i--;
		row--;
		}
		
	}
	public void pattern5()
	{
	  
		int i = 5;
		int row =5;
		while(row>=1)
		{
		int col =1;
		while(col <=row)
		{
			System.out.print(row -col+1);
			col++;
		}
		 int star =1;
		while(star <=row)
		{
		System.out.print("*"+" ");
		star ++;
		}
		System.out.println();
		i--;
		row--;
		}
		
	}


}
