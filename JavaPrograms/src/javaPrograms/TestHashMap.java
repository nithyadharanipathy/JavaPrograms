package javaPrograms;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> city = new HashMap<Integer, String>();
		city.put(10, "Atlanta");
		city.put(20, "Austin");
		city.put(30, "New York");
		city.put(40, "San Francisco");
		city.put(50, "Miami");
		city.put(60, "Chicago");
		
		System.out.println("Cities List: " + city);
		System.out.println("Size of HashMap: " + city.size());
		System.out.println("Get city for key 50: " + city.get(50));
		System.out.println("Check if HashMap is empty: "+ city.isEmpty());
		System.out.println("Replace Atlanta with Seattle" + city.replace(10, "Seattle"));
		System.out.println("New Cities List: " + city);
		
		System.out.println("*******************************");
		for(Integer i : city.keySet()) {
			System.out.println(city.get(i));
		}

	}

}
