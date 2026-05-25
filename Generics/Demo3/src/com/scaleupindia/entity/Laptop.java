package com.scaleupindia.entity;

import java.util.Objects;

public class Laptop {
	private int id;
	private String name;
	
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Laptop(int id) {
		super();
		this.id = id;
	}
	public String toString() {
		return "Laptop [id=" +id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return id == other.id;
	}
}
