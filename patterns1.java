import java.util.Scanner;
public class patterns1 {

	public static void main(String[] args) 
	{
		patterns1 vk = new patterns1();
		//vk.pattern1();
		//vk.pattern2();
		vk.pattern3();
		

	}
	
	
	public void pattern1()
	{
		System.out.println("------------------------------------------");
		Scanner vk = new Scanner(System.in);
		System.out.println("Enter a rows");
        int maxrow =vk.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Enter a column");
        int maxcol =vk.nextInt();
        int row =1;
        System.out.println("------------------------------------------");
		while(row <=maxrow)
		{
			int col =1;
			while(col<=maxcol)
			{
				System.out.print(row+" ");
				col++;
			}
			System.out.println();
			row++;
		}
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
	}
	public void pattern2()
	{
		
		System.out.println("------------------------------------------");
		Scanner vk = new Scanner(System.in);
		System.out.println("Enter a rows");
        int maxrow =vk.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Enter a column");
        int maxcol =vk.nextInt();
        int row =1;
        System.out.println("------------------------------------------");
		while(row <=maxrow)
		{
			int col =1;
			while(col<=maxcol)
			{
				System.out.print(col+" ");
				col++;
			}
			System.out.println();
			row++;
		}
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
	}
	public void pattern3()
	{
		
		System.out.println("------------------------------------------");
		Scanner vk = new Scanner(System.in);
		System.out.println("Enter a rows");
        int maxrow =vk.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Enter a column");
        int maxcol =vk.nextInt();
        
        
       
       
        
        System.out.println("------------------------------------------");
        int row =1;
		while( row <= maxrow)
		{
			int max = maxcol; 
			int col =1;
			while(max >= col)
			{
				System.out.print(maxcol+" ");
				maxcol--;
			}
			System.out.println( );
			row++;
		}
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
	}


}
