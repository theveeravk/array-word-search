import java.util.Scanner;

public class Binary_and_linear_Search {

	public static void main(String[] args)
	{
		Binary_and_linear_Search vk = new Binary_and_linear_Search();
		vk.Linear_Search();
		vk._Binary_Search();

	}

	private void _Binary_Search() 
	{
		System.out.println("Binary Search");
		System.out.println();
		int[] arr = {10,20,45,67,70,75,80,85,60};
        Scanner sh = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int no = sh.nextInt();
		int min =0;
		int max = arr.length-1;
		while(min<= max)
		{
			
		
		int avg = (min +max)/2;
		if(arr[avg]==no)
		{
			System.out.println("number is present postion at = "+avg);
			  break;
		}
			
		else if(no > arr[avg])
		{
			min = avg +1;
		}
		else 
		{
			max = avg -1;
		}
		}
		
		if(min > max )
		{
			System.out.println("no is not present");
		}
		System.out.println();
		
	}

	private void Linear_Search()
	{
		System.out.println("Liner Search");
		System.out.println();
		
		int[] arr= {70,67,90,78,100};
		Scanner sh = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int no = sh.nextInt();
		int i =0;
		for( i=0;i<arr.length;i++)
		{
			if( no== arr[i])
			{
				System.out.println("number is present"+arr[i]);
			}
		}
		if(no>arr.length)
		{
			System.out.println("number is not present");
		}
		System.out.println();
	}

}
