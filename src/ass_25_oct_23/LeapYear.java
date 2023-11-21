package ass_25_oct_23;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		
		int year=sc.nextInt();
		
		//#1
		if(year%4==0 && (year%100!=0 || year%400==0))
		{
			System.out.println(year + " is a leap year");
		}
		else
			System.out.println(year + " is not a leap year");
		
		
		//#2
		boolean leap=false;	
		if(year%4==0) {
			
			if(year%100==0) {
				
				if(year%400==0)
					leap=true;
			}
			else 
				leap=true;
		}
		
		if(leap)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year +" is not a leap year");
		
	}

}