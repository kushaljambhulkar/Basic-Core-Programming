package BasicCoreProgramming;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		//-> Year, ensure it is a 4 digit number.
		// year to be checked
		
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check which is Leap or not");
		
		year = sc.nextInt();
		boolean leap = false;
		
		//if the year is divided by 4 to ensure it is a 4 digit number.
		if(year % 4 == 0) {
			
			//if year is divided by 400 then
			// Then it is a leap year
			if(year % 400 == 0)
			{
				leap = true;
			}
			else
			{
				leap = false;
			}
			
		}
		// if the  year is not century
		else
		{
			leap = true;
		}
		if(leap)
		{
			System.out.println(year + "is a leap year.");
		}
		else
		{
			System.out.println(year + "is not a leap year.");
		}
	}
	
}
