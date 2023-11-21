package ass_26_oct_23;

import java.util.Scanner;

public class PriceProduct {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Quantity of product: ");
		
		int quantity=sc.nextInt();
		int totalPrice=quantity*10;
		
		
		if(quantity<10) {
			System.out.println("No Discount Applied");
			System.out.println("Total Price: "+totalPrice);
		}
		else {
			int discountPrice=totalPrice-(totalPrice/10);
			System.out.println("Total Price: "+discountPrice);
		}
	}

}