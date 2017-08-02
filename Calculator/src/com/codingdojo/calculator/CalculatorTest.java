package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(10.5);
		calc.setOperandTwo(5.2);
		calc.setOperation("+");
		calc.performOperation();
		System.out.println(calc.getResults());
		calc.setOperation("-");
		calc.performOperation();
		System.out.println(calc.getResults());
	}

}
