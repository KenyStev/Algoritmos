package com.ZeroStudio.Algorimos.week2;

public interface Iterator<Item> {
	boolean hasNext();
	Item next();
	void remove(); //Optional
}
