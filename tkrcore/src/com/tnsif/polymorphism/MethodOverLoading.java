package com.tnsif.polymorphism;

class Loading{
	public void Demo() {
		System.out.println("This is Default");
	}
	public void Demo1(int a) {
		System.out.println("The value of a: "+a);
	}
	public void Demo2(int a, int b) {
		System.out.println("Sum of a&b: "+ (a+b));
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Loading l = new Loading();
		l.Demo();
		l.Demo1(10);
		l.Demo2(20, 30);
	}

}
