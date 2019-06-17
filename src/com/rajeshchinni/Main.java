package com.rajeshchinni;

public class Main {

    public static void main(String[] args) {

        /**
         * When overriding the equals() method in the HeavenlyBody class, we
         * were careful to make sure that it would not return true if a HeavenlyBody
         * was compared to a subclass of itself.
         *
         * We did that to demonstrate that method, but it was actually
         * unnecessary in the HeavenlyBody class.
         *
         * The mini challenge is just a question: why was it unnecessary?
         *
         * Hint: If you are stuck, check out Lecture 97
         *
         * Answer:
         *
         * The HeavenlyBody class is declared final, so cannot be subclassed.
         * The Java String class is also final, which is why it can safely
         * use the instanceof method without having to worry about
         * comparisons with a subclass.

         *
         **/

        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));  // returns true
        System.out.println(rover.equals(rover2));  // return false

        // https://www.geeksforgeeks.org/equals-hashcode-methods-java/
        // This is happening because Labrador is an
        // instance of dog but dog is not an instance of Labrador so the second test returns false.
        // This violates the symmetric rule.
        // How to fix this?



    }
}
