package todaytask;

public class Programs
{
	public static void main(String[] args)
	{
		  String s1 = "JAVAJ2EE";
		  for(int i=0;i<s1.length();i++)
		   {
			  System.out.print(s1.substring(0, i+1));
			  System.out.println();
			}
		 for(int j=s1.length();j>0;j--)
		 {
			 System.out.print(s1.substring(0,j-1));
			 System.out.println();
		 }
		 
		  
	
	  }  
}

