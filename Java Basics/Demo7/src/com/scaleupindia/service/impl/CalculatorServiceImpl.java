package com.scaleupindia.service.impl;

import java.io.IOException;

import com.scaleupindia.service.CalculatorService;
import com.scaleupindia.utility.CustomResource;

public class CalculatorServiceImpl implements CalculatorService {

	public void divide(Integer... array) throws IOException {
		int quotient = 0;
		CustomResource customResource = new CustomResource();
		try(customResource) {
		if(array[1]==0) {
			throw new IOException("Cannot divide " + array[0] + " by " + array[1]);
		}
		customResource.process();
		quotient = array[0] / array[1];
		System.out.println("Quotiont of "+ array[0] + " and " + array[1] + " is " + quotient);
		} catch (Exception exception) {
			System.out.println("Exception handled in " + this.getClass() + " is " + exception.getMessage());
			throw exception;
		}
	}
}
