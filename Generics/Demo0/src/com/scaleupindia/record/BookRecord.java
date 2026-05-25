package com.scaleupindia.record;
import java.util.Objects;

import com.scaleupindia.entity.Book;

public class BookRecord {
	
	private Book[] items;
	
	public BookRecord() {
		this.items = new Book[10];
	}
	
	public void addItem(Book item) {
		for (int i = 0; i< items.length; i++) {
			if(Objects.isNull(items[i])) {
				items[i] =item;
				break;
			}
		}
	}
	
	public Book getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}
