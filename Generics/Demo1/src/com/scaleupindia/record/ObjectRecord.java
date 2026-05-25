package com.scaleupindia.record;
import java.util.Objects;

public class ObjectRecord {
	
	private Object[] items;
	
	public ObjectRecord() {
		this.items = new Object[10];
	}
	
	public void addItem(Object item) {
		for (int i = 0; i< items.length; i++) {
			if(Objects.isNull(items[i])) {
				items[i] =item;
				break;
			}
		}
	}
	
	public Object getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}
