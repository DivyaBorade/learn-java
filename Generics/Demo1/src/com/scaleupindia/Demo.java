package com.scaleupindia;

import com.scaleupindia.entity.Book;
import com.scaleupindia.entity.Laptop;
import com.scaleupindia.record.ObjectRecord;

public class Demo {
	public static void main(String[] args) {
		Book book1 = new Book(1, "Java Basics");
		Book book2 = new Book(2, "Java Advance");
		
		Laptop laptop1 = new Laptop(100,"HP");
		Laptop laptop2 = new Laptop(200,"Dell");
		
		ObjectRecord bookRecord = new ObjectRecord();
		bookRecord.addItem(book1);
		bookRecord.addItem(book2);
		
		Book book = (Book)bookRecord.getItem(0);
		System.out.println(book);
		
		ObjectRecord laptopRecord = new ObjectRecord();
		laptopRecord.addItem(laptop1);
		laptopRecord.addItem(laptop2);
		
		Laptop laptop = (Laptop)laptopRecord.getItem(0);
		System.out.println(laptop);
		
		ObjectRecord objectRecord = new ObjectRecord();
		objectRecord.addItem(book2);
		objectRecord.addItem(laptop2);
		objectRecord.addItem("Java");
		
		book = (Book)objectRecord.getItem(1);
		System.out.println(book);
	}

}
