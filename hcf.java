
public class hcf {

	public static void main(String[] args) 
	
	{
		
		//vk.Hcf();
		//vk.Hcf1();
		//vk.Hcf2();
		
		int no1 =100; int no2 =590;
		int small = no1<no2 ? no1:no2;
		hcf vk = new hcf();
		int gcd = vk.recHcf(no1,no2,small);
		System.out.println(gcd);
		

	}

	private int recHcf(int no1, int no2, int small) 
	{
		if((no1%small==0)&& (no2%small==0))
		{
		
			return small;
			
		}
		small--;
		
		
	return  recHcf( no1, no2,  small) ;
		
		
	}

	private void Hcf() 
	{
		int no =100;
		int div =1;
		int maxdiv = div;
		
		while(div<no)
		{
		
		if(no%div==0)
		{
			
			maxdiv = div;
		}
		div++;
		}
		System.out.println(maxdiv);
	}
	private void Hcf1() 
	{
		int no1 =100;
		int no2 =40;
		int small  = no1<no2?no1:no2;
		int div =1;
		int maxdiv = div;
		
		while(div<small) 
		{
		
		if((no1%div==0)&& (no2%div==0))
		{
			
			maxdiv = div;
		}
		div++;
		}
		System.out.println(maxdiv);
	}
	private void Hcf2() 
	{
		int no1 =100;
		int no2 =40;
		int small  = no1<no2?no1:no2;
		
		
		while(small >=1) 
		{
		
		if((no1%small==0)&& (no2%small==0))
		{
			System.out.println("gcd"+small);
			break;
			
		}
		small--;
		
		}
		if(small ==1)
		{
			System.out.println("There is no common divisor");
		}
		
	}

}
