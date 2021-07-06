package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Learn Java ArrayList Methods
public class TestArrayList {

	public static void main(String[] args) {
		//Create a new ArrayList flowers
		List <String> flowers = new ArrayList<String>();
		
		//Add new items to flowers. ArrayList allows duplicate items.
		flowers.add("Dahlia");
		flowers.add("Rose");
		flowers.add("Lotus");
		flowers.add("Jasmine");
		flowers.add("Zinnia");
		flowers.add("Daffodil");
		flowers.add("Rose");	
		flowers.add(null);
		flowers.add(1,"Hibiscus");//Adds hibiscus at index 1
		
		System.out.println("Flowers Array :"+flowers);//Print flower item.		
		System.out.println("Flowers at Index 1 :"+ flowers.get(1));//Print flower at index 1
		System.out.println("Index of first occurence of Rose :"+ flowers.indexOf("Rose"));//Print the index of first occurrence of Rose
		System.out.println("Index of last occurence of Rose :"+ flowers.lastIndexOf("Rose"));//Print the index of last occurrence of Rose
		
		//for each to print flowers
		for(String f : flowers) {
			System.out.println( f );
		}
		
		//Using List Iterator to iterate in both directions
		ListIterator<String> li = flowers.listIterator();
		System.out.println("Using List Iterator to iterate items in forward direction");
		while(li.hasNext())
		{
			System.out.println( li.next() );
		}
		
		System.out.println("Using List Iterator to iterate items in reverse direction");
		while(li.hasPrevious())
		{
			System.out.println( li.previous() );
		}
		
		//Create a new array and copy items from flowers array
		List <String> newFlowers = new ArrayList<String>(flowers);
		System.out.println("Flowers from new Array :"+newFlowers);//Print flower item.	
	}

}
