package ass_02_nov_23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RemCpyWords_1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sc.nextLine();
		System.out.println(str);
		
     	String[] words=str.split(" ");
		
//		for(int i=0;i<words.length;i++) {
//			
//			for(int j=i+1;j<words.length;j++) {
//				
//				if(words[i] !=null  && words[i].equals(words[j]) ) {
//					words[i]=null;
//				}
//				
//			}
//		}
//		
//		for(int i=0;i<words.length;i++) {
//			if(words[i]==null) {
//				continue;
//			}
//			System.out.println(words[i]);
//		}
		
		
//		 HashMap<String,Integer> hm=new HashMap<>();
//
//         for(int i=0;i<words.length;i++)
//                 {
//                        hm.put(words[i],hm.getOrDefault(words[i],0)+1);
//                 }
//         for(String i:hm.keySet())
//                 {
//                         System.out.println(i);
//                 }
//         
     	
     	Set<String> s=new HashSet<String>();
     	for(String w:words) {
     		s.add(w);
     	}
     	//System.out.println(s);
     	
     	Iterator it=s.iterator();
     	
     	while(it.hasNext()) {
     		System.out.println(it.next());
     	}
     	
	}

}