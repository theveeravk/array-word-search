
public class arr_max_min {

	public static void main(String[] args)
	{
		arr_max_min vk = new arr_max_min();
		
        vk.max();
        vk.min();
        vk.sec_max();
        
        
	}
	
	public void max()
	{

		int[] arr = {10,20,30,40,50,60};
		int max =0;
	
		  for(int i =0;i<arr.length;i++)
		  {
			if(arr[i]>max)
				max = arr[i];
			 
		  }
		  System.out.println("max = "+max);
		  System.out.println();
	}
	
	public void min()
	{
		int[] arr = {10,20,30,40,50,60};
		int  min =arr[0];
		  for(int i =0;i<arr.length;i++)
		  {
			if(arr[i]<min)
				min= arr[i];
		  }
		  System.out.println("min = "+min);
		  System.out.println();
	}
	
	public void sec_max()
	{

		int[] arr = {10,20,30,40,50,60};
		int max =arr[0];
		int smax =arr[0];
	
		  for(int i =0;i<arr.length;i++)
		  {
			if(arr[i]>max)
			{
				smax = max;
				max = arr[i];
			}
			else if(arr[i]>smax)
			{
				smax = arr[i];
			}
			
			 
		  }
		    System.out.println("max = "+max);
		    System.out.println("smax = "+smax);
		    System.out.println();
			
		  
	}
	
	public void ax()
	{
		int[] arr = {10,20,30,40,50,60};
		int  min =arr[0];
		  for(int i =0;i<arr.length;i++)
		  {
			if(arr[i]<min)
				min= arr[i];
		  }
		  System.out.println(min);
	}

}
