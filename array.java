import java.util.Scanner;

public class array {

	public static void main(String[] args) 
	{
		array demo = new array();
		for(int i =0;i<=1;i++)
		{
		demo.getstudentmarks();
		}
		demo.getmarks();
		

	}

	private void getmarks() {
		
		int[] ar = {20,10,20,40,50};
		for(int i =0;i<=ar.length;i++)
		{
			if(ar[i]%20==0)
			{
				System.out.println(ar[i]);
			}
			if(i%2==1)
			{
				System.out.println(ar[i]);
			}
		}
		for(int j = ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
		
	}

	private void getstudentmarks()
	{
Scanner vk = new Scanner(System.in);
		
		System.out.println("Enter a number of subjects");
		int sub = vk.nextInt();
		int[] ar = new int[sub];
		int total =0;
		System.out.println("Enter a subjects marks");
		for(int i =0;i<ar.length;i++)
		{
			
		   ar[i] = vk.nextInt();
		}
		
		for(int i =0;i<ar.length;i++)
		{
			
			total = total +ar[i];
		}
		
		for(int i =0;i<ar.length;i++)
		{
			System.out.println(i+" "+ar[i]);
		}
		System.out.println("total marks" +total);
		int average = total/sub;
		System.out.println("average" +average);

		
	}

}
