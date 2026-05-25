package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

public class CalculatorServiceImpl1 implements CalculatorService{
	
	public void divide(Integer... array) {
		int quotient = 0;
		try {
		quotient = array[0] / array[1];
		System.out.println("Quotiont of "+ array[0] + " and " + array[1] + " is " + quotient);
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Minimum 2 arguments are needed");
		}catch(ArithmeticException exception) {
			System.out.println("Cannot divide "+ array[0] + " by " + array[1]);
		}catch(Exception exception) {
			System.out.println("Something went wrong "+exception.getMessage());
		}
		
	}
}
