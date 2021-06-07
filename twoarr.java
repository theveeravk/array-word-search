import java.util.Scanner;

public class twoarr {

	public static void main(String[] args)
	{
		twoarr  vks = new twoarr();
		//vks.two();
		vks.twodim();
	}
	
	private void twodim()
	{
		int arr[][] = {
				        {10,20,30},
				        {40,50,60},
				        {70,80,90}
				
		               };
		
		
		for (int row =0;row <3;row++)
		{
			for(int col=0;col <3;col++)
			{
				
				System.out.print(arr[col][row]+" ");
			}
			System.out.println();
		}
		
		
		}

	public void two()
	{
		Scanner vk = new Scanner(System.in);
		System.out.println("enter a value");
		int[][] arr= new int[3][6];
		int i =0;
		int j =0;
		for( i =0;i<3;i++)
		{
			for( j =0;j<6;j++)
			{
				arr[i][j]= vk.nextInt();
			}
			System.out.print(j);
		}
		
	}

}
