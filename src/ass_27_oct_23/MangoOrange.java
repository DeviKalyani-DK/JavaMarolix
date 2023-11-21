package ass_27_oct_23;

public class MangoOrange {

	public static void main(String[] args) {
		
		for(int fruit=1;fruit<=50;fruit++) {
			
			if(fruit%3==0 && fruit%5==0) {
				System.out.println(fruit+" MangoOrange");
			}
			else if(fruit%3==0) {
				System.out.println(fruit+" Mango");
			}
			else if(fruit%5==0) {
				System.out.println(fruit+" Orange");
			}
		}
	}
}