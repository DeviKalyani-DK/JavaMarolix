package ass_01_nov_23;

import java.util.Scanner;

public class OccChar {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the string: ");

		String str=sc.next();

		int[] fre=new int[26];

		for(int i=0;i<str.length();i++) {

			int x=str.charAt(i)-'a';
			fre[x]++;
		}

//		for(int i=0;i<fre.length;i++) {
//			
//			if(fre[i]>0) {
//				char ch=(char) ('a'+ i);
//			 System.out.println( ch+" "+ fre[i] );
//			}
//		}

		for(int i=0;i<str.length();i++) {
			if(fre[str.charAt(i)-'a']>0) {
   			    System.out.println( str.charAt(i)+" "+ fre[str.charAt(i)-'a'] );
   			    fre[str.charAt(i)-'a']=0;
			}
		}

	}

}
