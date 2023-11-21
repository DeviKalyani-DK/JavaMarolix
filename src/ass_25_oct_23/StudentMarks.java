package ass_25_oct_23;

import java.util.Scanner;

public class StudentMarks {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the grades: ");
		
		int grades=sc.nextInt();
		
		//if-else-if ladder
		if(grades>=35 && grades<45)
			System.out.println("Grade F");
		else if(grades>=45 && grades<55) 
			System.out.println("Grade E");
		else if(grades>=55 && grades<65) 
			System.out.println("Grade D");
		else if(grades>=65 && grades<75) 
			System.out.println("Grade C");
		else if(grades>=75 && grades<85) 
			System.out.println("Grade B");
		else if(grades>=85 && grades<95) 
			System.out.println("Grade A");
		else if(grades>=95 && grades<=100)
			System.out.println("Grade O");
		else if(grades>100 || grades<0)
			System.out.println("Invalid");
		else
			System.out.println("Fail");
	}

}