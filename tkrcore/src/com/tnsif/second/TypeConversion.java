package com.tnsif.second;

public class TypeConversion {

	public static void main(String[] args) {
		int a = 100;   
		double b = a;
		System.out.println("Implicit Conversion:");
        System.out.println("Integer value: " + a);
        System.out.println("Converted to double: " + b);
        System.out.println();
        
		double x = 9.73;
		int y = (int) x;
		System.out.println("Explicit Conversion:");
        System.out.println("Double value: " + x);
        System.out.println("Converted to integer: " + y);
	}

}
