package ass_21_nov_23;

public class Throw_Throws extends Exception {
	
	public Throw_Throws(String msg){
		System.out.println(msg);
	}
	
	public static void  voting() throws Throw_Throws {
		int age=17;
		if(age<=18) {
			throw new Throw_Throws("its working");
		}
	}
	public static void main(String[] args) throws Throw_Throws {
		voting();
	}

}
