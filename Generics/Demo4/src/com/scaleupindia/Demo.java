package com.scaleupindia;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,30);
		List<Double> list2 = Arrays.asList(4.56,5.67,6.78);
		List<Number> list3 = Arrays.asList(70,80,9.32);
		List<String> list4 = Arrays.asList("Hello","Java");
		
		System.out.println("---PRINT INTEGER---");
		print1(list1);
//		print1(list2);
//		print1(list3);
//		print1(list4);
		
		System.out.println("---PRINT INTEGER AND ITS PARENT---");
		print2(list1);
	//	print2(list2);
		print2(list3);
	//	print2(list4);
		
		System.out.println("---PRINT NUMBER AND ITS CHILD---");
		print3(list1);
		print3(list2);
		print3(list3);
//		print3(list4);

		System.out.println("---PRINT EVERYTHING---");
		print4(list1);
		print4(list2);
		print4(list3);
		print4(list4);

	}
	
	public static void print1(List<Integer> list) {
		System.out.println(list);
	}
	
	public static void print2(List<?super Integer> list) {
		System.out.println(list);
	}
	
	public static void print3(List<?extends Number> list) {
		System.out.println(list);
	}
	
	public static void print4(List<?> list) {
		System.out.println(list);
	}
}
