package ass_26_oct_23;

import java.util.Scanner;

public class PosNegZero {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int number=sc.nextInt();
		
		if(number<0)
			System.out.println(number+" is a Negative Number");
		else if(number>0)
			System.out.println(number+" is a Positive Number");
		else
			System.out.println(number+" is a Zero Number");
	}

}