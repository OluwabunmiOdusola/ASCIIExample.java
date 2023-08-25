package com.bptn.course.week1;

public class VariableOperations {

	public static void main(String[] args) {
		int a; 
		a = 27;
		int b;
		b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("sum=" + (a + b));
		System.out.println("subt=" + (a - b));
		System.out.println("mult=" + ((a * b) / b));
		
		a = 70;
		b = 90;
		int c = 5;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("Mul=" + (a*b/a));
		System.out.println("Div=" + ((b-a)/c));
		
		a = 15;
		b = 20;
		c = 40;
		System.out.println("Sum=" + (((a * c)/b) + (b + c)-a));
			

	}

}
