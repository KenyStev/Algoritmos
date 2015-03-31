package com.ZeroStudio.Algorimos.week2;

public class StackOfString {
	private Node first = null;
	private int size = 0;

	private class Node {
		String item;
		Node next;
	}

	// Get the tried object
	public String getThree() {
		// Size increases in one
		size--;
		// Save the item to return
		String Three = first.next.next.item;
		// Delete second node
		first.next.next = first.next.next.next;
		// return saved item
		return Three;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		// Save a link to the list
		Node oldfirst = first;
		// Create a new node for the beginning
		first = new Node();
		// set the instance variables in the new node
		first.item = item;
		first.next = oldfirst;
		// Size increases in one
		size++;
	}

	public String pop() {
		// Size decreases in one
		size--;
		// Save the item to return
		String item = first.item;
		// Delete first node
		first = first.next;
		// Return saved item
		return item;
	}

	public int size() {
		return size;
	}
}
