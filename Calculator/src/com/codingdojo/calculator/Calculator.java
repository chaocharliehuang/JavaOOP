package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne = 0;
	private double operandTwo = 0;
	private String operation = "+";
	private double results = 0;
	
	public Calculator() {
		
	}
	
	public void performOperation() {
		if (this.operation == "+") {
			results = this.operandOne + this.operandTwo;
		} else if (this.operation == "-") {
			results = this.operandOne - this.operandTwo;
		}
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}
}
