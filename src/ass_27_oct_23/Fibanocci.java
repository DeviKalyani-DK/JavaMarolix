package ass_27_oct_23;

public class Fibanocci {
	
	public static void main(String[] args) {
		
		//print first 10 fibanocci numbers
		int f1=0,f2=1;
		
		
		for(int i=0;i<5;i++) {
			
			System.out.print(" "+f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}
	}

}