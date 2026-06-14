package com.scaleupindia.service.impl;

import com.scaleupindia.service.CounterService;

public class CounterServiceImpl3 implements CounterService {

	private int count;
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void incrementCount() {
		//
		synchronized (this) {
			++count;
			//fetch current value of count
			//add i to current value 
			//assign back to count variable
		}
	//
	}

}
