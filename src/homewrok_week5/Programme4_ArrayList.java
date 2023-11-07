package homewrok_week5;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_ArrayList {

        public static void main(String[] args) {
            // Create a new ArrayList to store color strings
            ArrayList<String> colors = new ArrayList<>();

            // Add some color strings to the ArrayList
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Purple");

            // Print out the collection using a for-each loop
            System.out.println("Colors in the ArrayList:");
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }

