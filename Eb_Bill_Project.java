import java.util.Scanner;

public class Eb_Bill_Project {

	public static void main(String[] args) 
	{
		Eb_Bill_Project Eb= new Eb_Bill_Project();
		Eb.Eb_2021();

	}
	
	public void  Eb_2021()
	{
		Scanner vk = new Scanner(System.in);
		System.out.println("Enter a Consumer name");
		 String name = vk.next();
		System.out.println("Enter a  Consumer no");
		int no = vk.nextInt();
		 System.out.println("Reading yes or no");
		 String read= vk.next();
		 int total =0; 
		 
		if(read.length()==3)
		{
			
		 System.out.println("Enter a previous month reading");
		 int pm = vk.nextInt();
		 System.out.println("Enter a current month reading");
		 int cm = vk.nextInt();
		 
		 int units;
		 units = cm - pm;
		
		 
		 if(pm <100)
		 {
			 System.out.println("First 100 units has free");
			
		 }
		 if(units >=100 &  units <=200)
		 {
			 total = units * 2;
			
		 }
		 if(units>201 &  units <= 500)
		 {
			 total = units * 3;
			 
		 }
		 if(units>401 &  units <= 800)
		 {
			 total = units * 4;
			 
		 }
		
		 if(units >801 &  units <= 1200)
		 {
			 total = units * 5;
			
		 }
		 System.out.println("--------------------------------------------------------------");
		 System.out.println("Name"+"   "+"Consumer Id"+"   "+"Units"+"   "+"Billing Amount ");
		 System.out.println("--------------------------------------------------------------");
		 System.out.println(name+"     "+no+"      "+"    "+units+"      "+total);
		 System.out.println("--------------------------------------------------------------");
		 System.out.println();
		 System.out.println("you can Pay  = "+total+"rupess");
		 System.out.println("--------------------------------------------------------------");
		}
		
		else 
			 
		{
			 System.out.println("Enter a last month units");
			 int lm = vk.nextInt();
			 System.out.println("Enter a may 2019 units");
			 int mu = vk.nextInt();
			 int totals;
			 
			 if(lm < mu)
			 {
				
				 if(lm >=100 &  lm <=200)
				 {
					 total = lm * 2;
					
				 }
				 if(lm>201 &  lm <= 500)
				 {
					 total = lm * 3;
					 
				 }
				 if(lm>401 &  lm <= 800)
				 {
					 total = lm * 4;
					 
				 }
				
				 if(lm >801 &  lm <= 1200)
				 {
					 total = lm * 5;
					
				 }
				 System.out.println("--------------------------------------------------------------");
				 System.out.println("Name"+"   "+"Consumer Id"+"   "+"Units"+"   "+"Billing Amount ");
				 System.out.println("--------------------------------------------------------------");
				 System.out.println(name+"     "+no+"      "+"    "+lm+"      "+total);
				 System.out.println("--------------------------------------------------------------");
				 
				 System.out.println();
				 System.out.println("you can Pay  = "+total+"rupess");
				 System.out.println("--------------------------------------------------------------");
				 
			 }
			 else if(mu < lm)
			 {
				
				 if(mu >=100 &  mu <=200)
				 {
					 total = mu * 2;
					
				 }
				 if(mu>201 &  mu <= 500)
				 {
					 total = mu * 3;
					 
				 }
				 if(mu>401 &  mu <= 800)
				 {
					 total = mu * 4;
					 
				 }
				
				 if(mu >801 &  mu <= 1200)
				 {
					 total = mu * 5;
					
				 }
				 System.out.println("--------------------------------------------------------------");
				 System.out.println("Name"+"   "+"Consumer Id"+"   "+"Units"+"   "+"Billing Amount ");
				 System.out.println("--------------------------------------------------------------");
				 System.out.println(name+"     "+no+"      "+"    "+lm+"      "+total);
				 System.out.println("--------------------------------------------------------------");
				 
				 System.out.println();
				 System.out.println("you can Pay  = "+total+"rupess");
				 System.out.println("--------------------------------------------------------------");
				 
				 
			 }
			
		}
		 
		 
		
		
		
		 
		 
		
		 
		 
		 
		 
	}

}
