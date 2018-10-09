package todaytask;
import java.time.*;
import java.util.Date;
import java.util.Scanner;




public class Demo 
{  
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the birthdate in dd/MM/yyyy:");
		String birthdate = s1.next();
	
		LocalDate birthdate1 = LocalDate.parse(birthdate);
		
		System.out.println(getAge(birthdate1));
		
	}
	
		static int getAge(LocalDate birthdate1)
		{
			LocalDate today = LocalDate.now();
		return  Period.between(birthdate1, today).getYears();       		
		
	}

		
	
	 
	}


