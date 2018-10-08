package todaytask;

import java.util.Scanner;


public class Programs2
{
	public static void main(String[] args) 
	
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = s1.nextInt();
		System.out.println("enter the value of b");
		int b = s1.nextInt();
		if(a-b >= 2)
		{
			System.out.println(a);
		}
		else if(b-a >=2 )
		{
			System.out.println(b);
			
		}
		else
		{
			System.out.println("Notfound");
		}
	}

}
