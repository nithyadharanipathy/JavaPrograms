package javaPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> veggies = new LinkedList<String>();
		veggies.add(0, "Carrot");
		veggies.add("beets");
		veggies.add("broccoli");
		veggies.add("cabbage");

		System.out.println("Veggies List: "+ veggies);//Print all the veggies

		System.out.println(veggies.contains("Carrot")); //Checking contains method

		veggies.addFirst("Squash");
		veggies.addLast("Bell Pepper");
		System.out.println("Veggies List: "+ veggies);

		//For each loop
		for(String v : veggies) {
			System.out.println("Veggie in UpperCase: " +  v.toUpperCase());
		}

		//Using Iterator
		Iterator<String> it = veggies.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
