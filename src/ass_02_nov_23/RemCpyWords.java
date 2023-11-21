package ass_02_nov_23;

import java.util.Scanner;

public class RemCpyWords {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sc.next();
		
		
		String s2="";
		
		for(int i=0;i<str.length();i++) {
			if(str.equals(s2)) {
				System.out.println(str);
				break;
			}
			else {
				s2+=(str.charAt(i));
                 //System.out.println(s2);
				str=str.replaceFirst(String.valueOf(str.charAt(i)), "");
                 //System.out.println(str);
				i--;
			}
		}	
		
	}

}