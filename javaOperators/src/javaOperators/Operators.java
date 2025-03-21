package javaOperators;

public class Operators {

	// == equal
	// < less than
	// <= less or equal 
	// >= more or equal
	// != not equal 
	// || or
	// && and
	public static void main(String[] args) {
		int a = 4;
		if (a == 4) {
		System.out.println("a is an even number");
	}
        if (a < 10) {
        System.out.println("a is less than 10");
	}
	if (a <= 4) {
		System.out.println("the number is 4");
	}
	if (a != 2) {
		System.out.println("a is greater than 3");
	}
	if (a ==2 || a ==4) {
		System.out.println(a);
	}
	if (a == 4 && a <5) {
		System.out.println(a);
	}
}
}