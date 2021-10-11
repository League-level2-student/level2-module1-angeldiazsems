package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {

		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList (java.util) class
		ArrayList<String> yayeet = new ArrayList<String>();
		// 2. Add five Strings to your list
		yayeet.add("jan");
		yayeet.add("feb");
		yayeet.add("mar");
		yayeet.add("apr");
		yayeet.add("may");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < yayeet.size(); i++) {
		String y = yayeet.get(i);
		System.out.println("Element "+i+" is "+y);
		}
		// 4. Print all the Strings using a for-each loop
		for(String y: yayeet) {
			System.out.println("for each loop: "+y);
		}
		// 5. Print only the even numbered elements in the list.
		for(int i = 0; i < yayeet.size();i++){
			String y = yayeet.get(i);
			if(i%2==0) {
				System.out.println("evens : "+y);
			}
		}
		// 6. Print all the Strings in reverse order.
		for(int i = 5;i > yayeet.size(); i--){
			String y = yayeet.get(i);
			System.out.println("Element "+i+" is "+y);
		}
		 //7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < yayeet.size();i++) {
			String y = yayeet.get(i);
			if(y.contains("e")) {
				System.out.println("Contains e: "+y);
			}
		}
	}
}
