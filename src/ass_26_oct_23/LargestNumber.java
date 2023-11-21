package ass_26_oct_23;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter Number 3: ");
		int num3=sc.nextInt();
		
		//#1
		if(num1>num2) {
			if(num1>num3)
				System.out.println("Largest of Three numbers is "+num1);
			else
				System.out.println("Largest of Three numbers is "+num3);
		}
		else {
			if(num2>num3)
				System.out.println("Largest of Three numbers is "+num2);
			else
				System.out.println("Largest of Three numbers is "+num3);
		}
		
		//#2
		int result=(num1>num2)? (num1>num3 ? num1:num3) : (num2>num3?num2:num3);
		System.out.println("Largest of three numbers is "+result);
		
	}

}