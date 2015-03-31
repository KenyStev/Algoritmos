package com.ZeroStudio.Algorimos.week2;

public class PruebaAlgorithms {

	public static void main(String[] args) {
		QueueOfStrings lis = new QueueOfStrings();
		Stack<String> list = new Stack<String>();
		
//		list.push("Mundo");
//		list.push("Hola");
//		list.push("Java");
//		list.push("Adios");
//		list.push("JAJAJAJA");
		
		lis.enqueue("Mundo");
		lis.enqueue("Hola");
		lis.enqueue("Java");
		lis.enqueue("Adios");
		lis.enqueue("JAJAJA");
		
//		System.out.println(list.size());
//		System.out.println(list.getThree());
//		System.out.println(list.pop());
//		System.out.println(list.pop());
//		System.out.println(list.pop());
//		System.out.println(list.pop());
		
		System.out.println(lis.size());
		System.out.println(lis.dequeue());
		System.out.println(lis.dequeue());
		System.out.println(lis.dequeue());
		System.out.println(lis.dequeue());
		System.out.println(lis.dequeue());
		
		System.out.println(100/30);
		
		Date date =  new Date(2014,10,21);
		Date that = new Date(2014,10,20);
		System.out.println(date.compareTo(that));
		
	}

}
