package com.java.java8;

public class LambdaExpressionTest1 {

	private int operate(int a ,int b, Interface1 obj1) {
		return obj1.operation(a,b);
	}
	
	
	public static void main(String args[]) {
		Interface1 add= (int x, int y) -> x+y;
		Interface1 subtract= (int x, int y) -> x-y;
		Interface1 multiply= (int x, int y) -> x*y;
		Interface1 divide= (int x, int y) -> x/y;
		
		LambdaExpressionTest1 test = new LambdaExpressionTest1();
		
		System.out.println("Addition is : " + test.operate(4, 5, add));
		System.out.println("Substraction is : " + test.operate(4, 5, subtract));
		System.out.println("Multiplication is : " + test.operate(4, 5, multiply));
		System.out.println("Division is : " + test.operate(9, 5, divide));
		
		
		Interface2 obj2 = message -> System.out.println("Hello" + message);
	}
	
	
}
