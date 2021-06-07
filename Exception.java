import java.util.*;
public class Exception {

	public static void main(String[] args)
	{
		Scanner vk = new Scanner(System.in);
				System.out.println("Enter a number 1");
		try
		{
			int no1= vk.nextInt();
			System.out.println("Enter a number 2");
			int no2 = vk.nextInt();
			System.out.println(no1/no2);
			
		}
		catch(InputMismatchException vl)
		{
			System.out.println("plese enter only no");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Check properly");
		}

	}

}
