
public class fact {

	public static void main(String[] args)
	{
	
       fact vk = new fact();
       int result =vk.findfact(5);
       System.out.println(result);
       
	}
	
	public int findfact(int no)
	{
		if(no!=1)
		{
			return no * findfact(no-1);
		}
		else
		{
			return 1;
		}
	}

}
