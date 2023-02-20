package gov.research;

import jdk.swing.interop.SwingInterOpUtils;

/*
 *
 */
class PrimitivesTest {

    public static void main(String[] args) {
        int age = 32;
        System.out.println("The age is: " + age);

        long population = 7_000_000_000L; // Capital L or lower L does not matter prefer Capital
        System.out.println("The population is: " + population);

        double height = 175;
        System.out.println("My height is: " + height + "CM.");

        boolean isTall = true;
        System.out.println("I am tall? " + isTall);

        char grade = 'B';
        System.out.println("My grade is: " + grade);

        System.out.println("My favorite word is \"belly\"");

        int i = 18;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        i++; // i is 19 now, what is j??? still 18
        System.out.println(i);
        System.out.println(j);

        int n = 3;

        System.out.println(n++); // print out 3
        // i++ is post-increment - print and then it increment,
        // ++i is pre-increment - increment and then print
        System.out.println(++n); // print out 4


    }
}