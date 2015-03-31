package com.ZeroStudio.Algorimos.week2;

public class QueueOfStrings {

	private Node first = null;
	private Node last = null;
	private int size = 0;

	private class Node {
		String item;
		Node next;
	}

	public void enqueue(String item) {
		//Increase size in one
		size++;
		// Save a link to the last Node
		Node oldlast = last;
		// Create new Node for the end
		last = new Node();
		last.item = item;
		last.next = null;
		// Link the new node to the end of the list
		if	(isEmpty())		first = last;
		else				oldlast.next = last;

	}

	public String dequeue() {
		//Decrease size in one
		size--;
		String item = first.item;
		first 		= first.next;
		if	(isEmpty())	last = null;
		return item;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}
}
