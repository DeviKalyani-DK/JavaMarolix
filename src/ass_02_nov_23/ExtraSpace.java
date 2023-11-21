package ass_02_nov_23;

import java.util.Scanner;

public class ExtraSpace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String Line: ");
		
		String str=sc.nextLine();
		
		//#1
		System.out.println(str.replaceAll("\\s+", " "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//#2
		
//		     int j=0;
//             while(j<str.length()-1 && str.charAt(j)==' '){
//            	 j++;
//             }
//            for(int i=j;i<str.length();i++) {
//				while( i<str.length() && str.charAt(i) != ' ') {
//					System.out.print(str.charAt(i));
//					i++;
//			    }
//			
//				while(i<str.length() && str.charAt(i) == ' ') {
//	           	 if(str.charAt(i) == ' ') {
//	           		 i++;
//	           	 }
//	            }
//			
//			if(i<str.length())
//				System.out.print(' ');
//	
//			i--;
//            }
		
	}
}
