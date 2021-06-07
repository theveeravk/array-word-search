
public class wrapper {

	public static void main(String[] args)
	{
		 int a =100; int b = 200;
		 Integer a1 = a;
		 Integer b1 =b;
		  byte bb = a1.byteValue();
		  Integer c1 =100;
		  
		  System.out.println(a1.compareTo(b1));
		  System.out.println(b1.compareTo(a1));
		  System.out.println(a1.compareTo(c1));
		  System.out.println(Integer.MAX_VALUE);
		  System.out.println(Integer.MIN_VALUE);
		  System.out.println(Integer.max(1000,700));
		  String s ="100";
		  int s2 = Integer.parseInt(s);
		  System.out.println(s2+45);
		 System.out.println(Integer.reverse(1234));
		 
		 String v = "ABCEFGHIJ";
		 String v2 = s.valueOf(700);
		 System.out.println(v2.charAt(0));
		 
		 for(int i =0;i<v.length();i++)
		 {
			 if(i%2==0)
			 {
			 System.out.println((char)(v.charAt(i)+32));
			 }
			 else
			 {
				 System.out.println(v.charAt(i)); 
			 }
		 }
		 System.out.println(); 
		 System.out.println(); 
		 
		  int count =0;
		 for(int i =0;i<v.length();i++)
		 {
			 if(v.charAt(i)>='A' && v.charAt(i)>='Z' )
			 {
				  
				 count++;
			 }
			 
			 
			 }
		 if(v.length()==count)
		
			 System.out.println("All are capital ");
		
		 else
		
			 System.out.println("only capital ="+count);
	
		 
          String names = "Mr veerakumar";
          boolean result = names.startsWith("Mr");
          		 if(result == true)
          		 {
          			 System.out.println("male");
          		 }
          		 else
          		 {
          			 System.out.println("female"); 
          		 }
          		
	}

}
