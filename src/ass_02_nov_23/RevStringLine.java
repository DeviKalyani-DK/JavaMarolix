package ass_02_nov_23;

import java.util.Scanner;

public class RevStringLine {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String Line: ");
		
		String str=sc.nextLine();
	
		String[] s=str.split(" ");
		
		String rev="";
		for(int i=0;i<s.length;i++) {
			StringBuffer string=new StringBuffer(s[i]);
			string.reverse();
			rev+=string.toString()+" ";
		}
	
		System.out.println(rev.trim());
		
	}

}