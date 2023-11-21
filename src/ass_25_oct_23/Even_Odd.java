package ass_25_oct_23;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int number=sc.nextInt();
		
		if(number%2==0)
			System.out.println(number+" is an even number");
		else
			System.out.println(number+" is an odd number");
	}
}
