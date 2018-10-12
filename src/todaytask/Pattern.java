package todaytask;

import java.util.Scanner;

public class Pattern
{
		public static void main(String[] args)
		{
			 Scanner s1 = new Scanner(System.in);
			  System.out.println("enter the string:");
			  String s2 = s1.next();
			   for(int i=0;i<s2.length();i++)
			   {
				   for(int j=0;j<i;j++)
				   {
					   System.out.print(s2.charAt(j)+" ");
				   }
				   System.out.println();
			   }
			   for(int i=s2.length()-1;i>=0;i--)
			   {
				   for(int j=0;j<=i;j++)
				   {
					   System.out.print(s2.charAt(j)+" ");
				   }
				   System.out.println();
			   }
				
			 
		
		  }
	


}


		