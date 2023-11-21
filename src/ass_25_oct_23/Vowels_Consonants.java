package ass_25_oct_23;

import java.util.Scanner;

public class Vowels_Consonants {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		
		char ch=sc.next().charAt(0);
		
		//we can use switch
		
		//convert character to lower case
		ch=Character.toLowerCase(ch);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is an vowel");
		else
			System.out.println(ch+" is a constant");
	}

}