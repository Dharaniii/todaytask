package todaytask;

public class Array
{
	public static void main(String[] args) 
	{
	int[] arr = {2,2,0,4,0,8};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				arr[i] = arr[i]+arr[j];
				arr[j] =0;
			}
		}
		System.out.println(arr[i]);
	}
		
	}

}
