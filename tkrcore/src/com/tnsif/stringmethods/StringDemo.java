package com.tnsif.stringmethods;

public class StringDemo {

	public static void main(String[] args) {
		String x = "hello";
		String y = "hello";
		System.out.println(x.equals(y));
		System.out.println(x==y);
		
		String s = new String("hello");
		System.out.println(x.equals(s));
		System.out.println(x==s);
	}

}
