package com.ZeroStudio.Algorimos.week2;

public class Stack<Item> implements Iterable<Item>{
	private Node first = null;
	private int size = 0;

	private class Node {
		Item item;
		Node next;
	}

	// Get the tried object
	public Item getThree() {
		// Size increases in one
		size--;
		// Save the item to return
		Item Three = first.next.next.item;
		// Delete second node
		first.next.next = first.next.next.next;
		// return saved item
		return Three;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(Item item) {
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

	public Item pop() {
		// Size decreases in one
		size--;
		// Save the item to return
		Item item = first.item;
		// Delete first node
		first = first.next;
		// Return saved item
		return item;
	}

	public int size() {
		return size;
	}

	@Override
	public Iterator<Item> iterator() {
		
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		
		private Node current = first;

		@Override
		public boolean hasNext() {
			
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			
		}
		
	}
}
