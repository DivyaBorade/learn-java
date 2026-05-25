package com.scaleupindia.record;
import java.util.Objects;

import com.scaleupindia.entity.Laptop;

public class LaptopRecord {
	
	private Laptop[] items;
	
	public LaptopRecord() {
		this.items = new Laptop[10];
	}
	
	public void addItem(Laptop item) {
		for (int i = 0; i< items.length; i++) {
			if(Objects.isNull(items[i])) {
				items[i] =item;
				break;
			}
		}
	}
	
	public Laptop getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}
