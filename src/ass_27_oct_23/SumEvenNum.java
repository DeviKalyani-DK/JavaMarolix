package ass_27_oct_23;

public class SumEvenNum {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=2;i<=30;i+=2) {
			sum+=i;
		}
		System.out.println("Sum of Even Numbers: "+sum);
	}

}