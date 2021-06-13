
public class arr_sorting {

	public static void main(String[] args) 
	{
		System.out.println("     array sorting               ");
		int[] arr = {10,45,78,90,40};
		System.out.println("Before swapping");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("After swapping");
		int j;
		for( j =1;j<4;j++)
		{
		for(int i =0;i<arr.length-j;i++)
		{
			
			
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]=temp;
			}
			
			
		}
		}
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println();
        System.out.println("maximum =   "+arr[arr.length-1]);
        System.out.println("second maximum+  "+arr[arr.length-1]);
	}

}
