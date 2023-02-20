package gov.abacus;

/*
 * This is an "all-static" class, i.e., a class definition with nothing
 * but static methods. These are called from the client as Calculator.methodName().
 */
class Calculator {

    /**
     * Returns the arithmetic mean (average) of the supplied integers.
     * average()
     */
    public static double average(int first, int... rest) { // 2,6,6,5
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value; // sume = sum + value , do right to left. sum + value first.
        }
        result = sum / (rest.length + 1);
        return result;

    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
     }
    /**
     * Returns a random integer between 1 and 14 (inclusive).
     *
     * Hint: see a class called Math in the Java API (package java.lang)/
     * Look for a helpful method here to get started.
     * Note: these methods in the Math class are all "static", which means you call them as so:
     * Math.methodName()
     *
     * Return Type first - and then method name
     */
     public static int randomInt() {
        return randomInt(1,14); // delegate to the min-max version with a 1 and a 14.
     }

     public static int randomInt(int max) {
         return randomInt(1, max);
     }

    /**
     * Returns a random integer between 'min' and 'max' (inclusive)
     * 'min' and 'max' from client
     */

    public static int randomInt(int min, int max) {  // e.g., 5 to 75
        int result = 0;

        double rand = Math.random();                     // 0.00000 to  0.99999
//        double scaled =(rand * max) + min;             // 5.00000 to 79.99999
//        double scaled = (rand * (max - min)) + min;    // 5.00000 to 74.99999
        double scaled = (rand * (max -  min + 1)) + min; // 5.00000 to 75.99999

        // truncate the decimal portion off via explicit downcast to in
        result = (int) scaled;

//      result = (int)Math.round((Math.random() * (max - min)) + min);

        return result;
    }

}