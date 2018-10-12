package todaytask;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
	  Scanner scann = new Scanner(System.in);
	  System.out.println("enter the string");
	  String s = scann.nextLine();
	  String s1[]=s.split(" ");
	   for(int i=0;i<s1.length;i++)
	   {
	   
	   StringBuffer sb = new StringBuffer(s1[i]);
	   sb.reverse();
	   String string1=sb.toString();
		if(s1[i].equals(string1))
		 {
			if(s1[i].length()==1)
			{
			System.out.print(s1[i]+" ");
		 }
		 }
		else
		{
			System.out.print(s1[i]+" ");
		}

	   }
	}


	}
	



