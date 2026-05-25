package com.scaleupindia.record;
import java.util.Objects;

public class CommonRecord<E> {
	
	private E[] items;
	
	public CommonRecord() {
		this.items = (E[])new Object[10];
	}
	
	public void addItem(E item) {
		for (int i = 0; i< items.length; i++) {
			if(Objects.isNull(items[i])) {
				items[i] =item;
				break;
			}
		}
	}
	
	public E getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}
