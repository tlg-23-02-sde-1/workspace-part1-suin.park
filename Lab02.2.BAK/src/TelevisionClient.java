/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {

    //STARTING point for any standalone JAVA application
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        // create an instance of Television and set its properties individually
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);

        //Second Instance
        Television tv2 = new Television("sony", Television.MIN_VOLUME);

        //Third Instance
        Television tv3 = new Television("LG");

        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2); // toString() automatically called
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}