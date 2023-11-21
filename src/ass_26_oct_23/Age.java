package ass_26_oct_23;

import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Age: ");
		
		int age=sc.nextInt();
		
		if(age>=0 &&  age<13)
			System.out.println("A Child");
		else if(age>=13 && age<20)
			System.out.println("A Teenager");
		else if(age>=20 && age<65)
			System.out.println("An Adult");
		else
			System.out.println("A Senior");
		
	}

}
