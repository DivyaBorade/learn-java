package com.scaleupindia.service.impl;

import com.scaleupindia.service.CounterService;

public class CounterServiceImpl2 implements CounterService {

	private int count;
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public synchronized void incrementCount() {
		++count;
		//fetch current value of count
		//add i to current value 
		//assign back to count variable 
	}

}
