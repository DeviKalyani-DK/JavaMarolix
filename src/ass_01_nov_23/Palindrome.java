package ass_01_nov_23;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String: ");
		
		String str=sc.next();
		
		//#1
//		String rev="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		
//		if(str.equals(rev))
//			System.out.println(str+" is a palindrome");
//		else
//			System.out.println(str+" is not a palindrome");
		
		//#2
		//
		int strLen=str.length();
		int len=strLen/2 -1 ;
		for(int i=0;i<=len;i++){
			if(str.charAt(i)!=str.charAt(strLen-1-i)) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("Palindrome");
	}
}