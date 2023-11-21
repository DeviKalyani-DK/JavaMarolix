package ass_27_oct_23;

import java.util.Scanner;

public class Factorial {
	
	//recursion
	public static int factorial(int num) {
		
		if(num==1 || num==0)
			return 1;
		return num*factorial(num-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int fact=factorial(num);
		
		//Iteration
//		int fact=1;
//		
//      	for(int i=num;i>=1;i--) {
//		fact=fact*i;
//		}
		System.out.println("Factorial of a number: "+fact);
		
	}

}