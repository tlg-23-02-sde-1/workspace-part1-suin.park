package gov.research;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 56;
        ages[1] = 49;
        System.out.println(Arrays.toString(ages));

        double[] prices = { 9.99, 37.49,32.5, 49.96 };
        System.out.println("prices has lengh: " + prices.length);
        System.out.println(Arrays.toString(prices));

        String[] names = { "Brandon", "Soyeong"};
        System.out.println(Arrays.toString(names));

        for (String name: names) {
            System.out.println(name);
        }
    }



}