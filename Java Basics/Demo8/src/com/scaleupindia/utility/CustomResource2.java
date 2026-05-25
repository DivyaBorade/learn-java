package com.scaleupindia.utility;

public class CustomResource2 implements AutoCloseable{
	public CustomResource2() {
		System.out.println("Custom Resource 2 Started");
	}
	
	public void process() {
		System.out.println("Custom Resource 2 processing");
	}
	
	public void close() {
		System.out.println("Custom Resource 2 finished");
	}
}
