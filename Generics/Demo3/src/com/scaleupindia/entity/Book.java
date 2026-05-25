package com.scaleupindia.entity;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Book(int id) {
		super();
		this.id = id;
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
		Book other = (Book) obj;
		return id == other.id;
	}

	public String toString() {
		return "Book [id=" +id + ", name=" + name + "]";
	}

}
