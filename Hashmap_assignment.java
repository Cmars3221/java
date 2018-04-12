package hashmap_assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_assignment {

	public static void main(String[] args) {

		HashMap<Integer, String> color_suite1 = new HashMap<Integer, String>();

		color_suite1.put(1, "Black");
		color_suite1.put(2, "Red");
		color_suite1.put(3, "Green");
		color_suite1.put(4, "Orange");
		color_suite1.put(5, "Hot-Pink");

		// Print out all keys in the HashmMap
		System.out.println(color_suite1.keySet());

		// Print out all Values in the HashMap.
		System.out.println(color_suite1.values());

		// Try setting the value of one of the keys to something new
		color_suite1.put(5, "Yellow");
		System.out.println(color_suite1.keySet());
		System.out.println(color_suite1.values());

		// Did anything change? Why?
		/*
		 * The value of the 5th key changed. Within a Hashmap, key/value pairs are not
		 * duplicated they are replaced.
		 */

		// 2.
		for (int i = 1; i <= color_suite1.size(); i++) {
			System.out.println("Key: " + i + " | Value: " + color_suite1.get(i));
		}

		// 2a.
		for (Integer x : color_suite1.keySet()) {
			System.out.println(x);
		}

		// 3 Menu:

		int burger = 0, hotdog= 0, sandwich = 0, soda = 0, fries = 0;

		Scanner sc = new Scanner(System.in);
		boolean complete = false;

		while (!complete) {

			System.out.println("How many burgers will it be?");
			int b_count = sc.nextInt();
			burger += b_count;

			System.out.println("How many hot-dogs do ya want?");
			int h_count = sc.nextInt();
			hotdog += h_count;
			
			System.out.println("Any sandwiches, how many?");
			int sand_count = sc.nextInt();
			sandwich += sand_count;
			
			System.out.println("How many spit_shakes..er..sodas?");
			int s_count = sc.nextInt();
			soda += s_count;

			System.out.println("And the stale fries..how many?");
			int f_count = sc.nextInt();
			fries += f_count;

		    System.out.println("Is that it?  y/n");

		    String all_done = sc.nextLine();

		    	if (all_done == "y");
			System.out.println("ok..that'll be...");
			
			sc.close();
				
			complete = true;
				
			yourOrder();
			}
		
	
}

	private static void yourOrder() {

	public  yourOrder(burger, hotdog, sandwich,soda,fries) {

			HashMap<Integer, String> menu = new HashMap<Integer, String>();
			
			 menu.put( "Habanero Houston Hamburger", burger );
			 menu.put( "All Americanna Hot Dog", hotdog);
			 menu.put( " Slammin Sammie Sandwich Supreme ", sandwich);
			 menu.put( "Sunspot Spittle Soda Surprise", soda);
			 menu.put( "Fenway Fusion Fries", fries);
	
			  System.out.println(menu.values());
			  System.out.println("Thanks stopping by");		
			}
	
	}
