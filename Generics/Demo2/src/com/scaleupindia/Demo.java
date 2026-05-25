package com.scaleupindia;

import com.scaleupindia.entity.Book;
import com.scaleupindia.entity.Laptop;
import com.scaleupindia.record.CommonRecord;

public class Demo {
	public static void main(String[] args) {
		Book book1 = new Book(1, "Java Basics");
		Book book2 = new Book(2, "Java Advance");
		Laptop laptop1 = new Laptop(100,"HP");
		Laptop laptop2 = new Laptop(200,"Dell");
		
		CommonRecord<Book> bookRecord = new CommonRecord<Book>();
		bookRecord.addItem(book1);
		bookRecord.addItem(book2);
		
		Book book = bookRecord.getItem(0);
		System.out.println(book);
		
		CommonRecord<Laptop> laptopRecord = new CommonRecord<Laptop>();
		laptopRecord.addItem(laptop1);
		laptopRecord.addItem(laptop2);
//		laptopRecord.addItem(book);
		
		Laptop laptop = laptopRecord.getItem(0);
		System.out.println(laptop);
		
		CommonRecord<Object> objectRecord = new CommonRecord<Object>(); //Bad Code
		objectRecord.addItem(book);
		objectRecord.addItem(laptop2);
		objectRecord.addItem("Java");
		
		Laptop o = (Laptop) objectRecord.getItem(0);
		
		Object laptop3 = new Laptop(300, "Apple"); 
		
//		CommonRecord<Object> objectRecord2 = new CommonRecord<Laptop>(); //Not Allowed
	
		CommonRecord<Laptop> laptopRecord2 = new CommonRecord<>();	//since java 7  //Best Practice
		laptopRecord.addItem(laptop1);
		laptopRecord.addItem(laptop2);
//		laptopRecord.addItem(book);
	
//		CommonRecord<Object> laptopRecord = new CommonRecord<Object>(); //Bad Code
//		CommonRecord<> laptopRecord3 = new CommonRecord<>(); //not allowed
//		CommonRecord<> laptopRecord3 = new CommonRecord<Laptop>(); //not allowed
		
	
	}

}
