package ass_01_nov_23;

import java.util.Scanner;

public class OccWords {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the line: ");
		
		String line=sc.nextLine();
		
		System.out.println(line);
		
		String[] words=line.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			String temp1=words[i];
			int count=0;
			
			for(int j=0;j<words.length;j++) {
				
				String temp2=words[j];
				
				
				if(j<i && temp1.equals(temp2)) {
					break;
				}
				
				if(temp1.equals(temp2))
				{
					count++;
				}
				
				if(j==words.length-1) {
					System.out.println(temp1+" "+count);
				}
				
			}
		}
	}

}