import java.util.Scanner;

public class arr_words_search {

	public static void main(String[] args) 
	{
		arr_words_search  as= new arr_words_search();
		//as.count_of_given_char();
		as.count_of_given_first_char();
		as.vowels_search();
	}
	
	
	private void vowels_search()
	{
		char[] name = {'v','e','e','r','a',};
		char[] vowels = {'a','e','i','o','u'};
		
		int j =0;
		while(j<vowels.length)
		{
			
			char ch = vowels[j];
		int count =0;
		
		
		   for(int i =1;i<name.length;i++)
		   {
			   if(ch == name[i])
			    {
			    	count++;
			    } 
			   
			 
		   }
		 
		   System.out.println(ch+" yes present time is first char "+count);
		   j++;
		   
		}
		
	}


	private void count_of_given_first_char() 
	{
		char[] name = {'v','e','e','r','a'};
		char ch = name[0];
		
		
		int count =1;
		
		   for(int i =1;i<name.length;i++)
		   {
			   if(ch == name[i])
			    {
			    	count++;
			    } 
		   }
		   System.out.println(ch+" yes present time is first char "+count);
		   System.out.println();
		
	}


	public void count_of_given_char()
	{
		char[] name = {'v','e','e','r','a'};
		Scanner vks =  new Scanner(System.in);
		System.out.println("Enter a name");
		String names= vks.next();
		char ch = names.charAt(0);
		int count =0;
		
		   for(int i =0;i<name.length;i++)
		   {
			   if(ch == name[i])
			    {
			    	count++;
			    } 
		   }
		   System.out.println(ch+" yes present time is "+count);
		   System.out.println();
	}

}
