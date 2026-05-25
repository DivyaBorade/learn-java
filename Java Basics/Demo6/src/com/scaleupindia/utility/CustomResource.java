package com.scaleupindia.utility;

public class CustomResource {
	public CustomResource() {
		System.out.println("Custom Resource Started");
	}
	
	public void process() {
		System.out.println("Custom Resource processing");
	}
	
	public void close() {
		System.out.println("Custom Resource finished");
	}
}
