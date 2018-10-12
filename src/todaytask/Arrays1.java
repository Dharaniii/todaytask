package todaytask;

public class Arrays1 
{
	public static void main(String[] args) 
	{
		int[] arr1 ={6,3,9,8,10,2,1,15,7};
		
		for(int i=0;i<arr1.length;i++)
			{
				int i1 =Integer.MAX_VALUE;
				int temp=-1;
				for( int j=0;j<arr1.length;j++)
				{

					if(arr1[i]<arr1[j] &&(arr1[j]-arr1[i]<i1))
					{
						 i1=arr1[j]-arr1[i];
						 temp =j;
					}
						
					}
				if(temp==-1)
				{
					System.out.print("_");
		   	}
				else
				{
					System.out.print(arr1[temp]+"   ");
					
				}
	}
	}
}

	





			
				

						
			
	

