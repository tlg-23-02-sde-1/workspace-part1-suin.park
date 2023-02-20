package gov.abacus;

class CalculatorClient {
    public static void main(String[] args) {
        double sum = Calculator.add(3.1,5.1);
        System.out.println("The sume is: " + sum );

        System.out.println("The difference is: " + Calculator.subtract(11,13));

        System.out.println("is 11 even: " + Calculator.isEven(11));

        System.out.println(); // blank line in the output

        int winner = Calculator.randomInt();
        System.out.println("The winner is: " + winner);
        System.out.println();


        double average = Calculator.average(2, 6, 6, 5); // should be 4.75
        System.out.println(average);
    }
}
