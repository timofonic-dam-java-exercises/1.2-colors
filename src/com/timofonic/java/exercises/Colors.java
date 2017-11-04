package com.timofonic.java.exercises;

/**
 * Text colouring:
 * It shows some words colored as their physical counterparts.
 * @author Timofonic
 */
public class Colors {
	
	public static void main(String[] args) {

		// Define the color codes
		String red = "\033[31m";
		String green = "\033[32m";
		String orange = "\033[33m";
		String blue = "\033[34m";
		String purple = "\033[35m";
		String white = "\033[37m";
		
		// Print the colored text in screen
		System.out.print(orange + "tangerine" + green + " herb");
		System.out.print(orange + " grasshopper" + red + " tomato");
		System.out.print(white + " sheets" + blue + " sky");
		System.out.print(purple + " Nazarene" + blue + " sea");
	}
}