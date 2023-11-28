package ass_27_nov_23;

import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	
	public static void main(String[] args) {
		
		
		List<String> ll=new LinkedList<String>();
		ll.add("devi");
		ll.add("kalyani");
		
		System.out.println(ll);
		
		for(String st:ll) {
			System.out.println(st);
		}
	}

}
