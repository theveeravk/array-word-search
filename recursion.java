
public class recursion {

	public static void main(String[] args) 
	{
		recursion vk = new recursion();
		
		int result =vk.addDigits(6788);
		System.out.println(result);

	}
	public int addDigits(int no)
	{
		int total =0;
		while(no >0)
		{
			int rem = no%10;
			total = rem +total;
			no = no/10;
		}
		if(total>9)
		{
			return  addDigits(total);
		}
		
		
		
		return total;
		
	}

}
