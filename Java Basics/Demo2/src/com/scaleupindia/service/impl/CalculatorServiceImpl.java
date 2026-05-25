package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{
	
	public void divide(Integer... array) {
		int quotient = 0;
		try {
		quotient = array[0] / array[1];
		System.out.println("Quotiont of "+ array[0] + " and " + array[1] + " is " + quotient);
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Minimum 2 arguments are needed");
		}
		
	}
}
