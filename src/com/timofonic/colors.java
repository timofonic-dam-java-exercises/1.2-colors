/* Text colouring:
 * It shows some words colored as their physical counterparts.
 * @author Timofonic
 */

package com.timofonic;

public class colors {
    public static void main(String[] args) {
	// write your code here

	String red = "\033[31m";
    String green = "\033[32m";
    String orange = "\033[33m";
    String blue = "\033[34m";
    String purple = "\033[35m";
    String white = "\033[37m";

    System.out.print(orange + "tangerine" + green + " herb");
    System.out.print(orange + " grasshopper" + red + " tomato");
    System.out.print(white + " sheets" + blue + " sky");
    System.out.print(purple + " Nazarene" + blue + " sea");
    }
}