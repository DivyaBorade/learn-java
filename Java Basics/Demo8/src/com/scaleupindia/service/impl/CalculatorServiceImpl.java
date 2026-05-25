package com.scaleupindia.service.impl;

import com.scaleupindia.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	public void divide(Integer... array) throws ScaleUpIndiaException {
		int quotient = 0;
		if(array[1]==0) {
			throw new ScaleUpIndiaException();
		}
		quotient = array[0] / array[1];
		System.out.println("Quotiont of "+ array[0] + " and " + array[1] + " is " + quotient);
	}
}
