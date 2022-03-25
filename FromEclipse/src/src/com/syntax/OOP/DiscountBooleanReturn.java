package com.syntax.OOP;

public class DiscountBooleanReturn {
	
	// Build a method that takes a boolean isSaleOn "double"-price and double-discount
	//"double" meaning the data types
			// if isSaleOn=true return discounted price otherwise return original price
	
	double checkDiscount(boolean isSaleOn, double originalPrice, double discount) {
		if(isSaleOn) {
			return originalPrice-originalPrice*discount;
		}else {
			return originalPrice;
		}
	}

	public static void main(String[] args) {
		
		DiscountBooleanReturn obj=new DiscountBooleanReturn();
		System.out.println(obj.checkDiscount(false,  100, .15));
		System.out.println(obj.checkDiscount(true,  100, .15));
		
	
		

	}

}
