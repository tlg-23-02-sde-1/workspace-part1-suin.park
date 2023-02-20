package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
public class Television {
    // class-level (static) shard variables -these live up in that shaared common area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static  int instanceCount = 0;

    // static method
    public static int getInstanceCount() {
        return instanceCount;
    }

    // - - - - - - - - - - - - - - - - - -

    // attributes or properties, called "fields" or "instance variables"
    private String brand;
    private static int volume;
    private DisplayType display = DisplayType.LED; // null if we don't provide a default

    // Television HAS-A Tuner - delegates to it for all things channel-related
    private Tuner tuner = new Tuner(); // instantiated internally, not exposed (no get/set)

    private boolean isMuted;
    private int oldVolume;  // not exposed via get/set methods - internal use only

    // constructor ctors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand); //delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);       //delegate to ctor above me for brand
        setVolume(volume); //handle volume myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume); // delegate to brand-volume ctor for those two
        setDisplay(display); // handle display myself, by delegating to its setter
    }

    // functions or operations, called "methods" in Java
    // Business - oriented Method
    public void turnOn() {
        boolean isConnected = this.verifyInternetConnection(); //this. means its pooling one method from other
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (isMuted()) {         //not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {                  // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void changeChannel(String channel) {
        tuner.setChannel(channel); // delegate to contained Tuner object
    }

    public String getCurrentChannel() {
        return tuner.getChannel();  // delegate to contained Tuner object
    }

    // Accessor Method - provide "controlled access" to the object's internal (private) data

    public boolean isMuted() {  // boolean normally do not come with get like getIsmuted()
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }
    // data constraint: must be "Samsung", "Sony", "LG", "Toshiba"
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + ", valid brands are " +
                    Arrays.toString(VALID_BRANDS));
        }
    }
    // data constraint: must be "Samsung", "Sony", "LG", "Toshiba"
    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

        // other possible ways
        /*
        for(String validBrand: VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) {
                this.brand = validBrand;
                return;
                }
            }
        System.out.println("Invalid brand: " + brand + ", valid brands are " + Arrays.toString(VALID_BRANDS));
        */


        /*
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
        }
        */
         /*
        if (Arrays.asList(VALID_BRANDS).contains(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
        }
        */
        /*

        if (brand.equals("Samsung") ||
            brand.equals("LG")      ||
            brand.equals("Sony")    ||
            brand.equals("Toshiba")) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand +  "brand must be Samsung or LG or Sony or Toshiba");
        }
        */

    public int getVolume() {
        return volume;
    }
    // data constraint: must be [ 0-100] - use your class contants (MIN/MAX_VOLUME)
    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {   // valid
            this.volume = volume;
            isMuted = false;
        }
        else {
            System.out.printf("Invalid volume: %s, valid range is %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME );
//            System.out.println("Invalid voulme: " + volume+", valid range is "
//            + MIN_VOLUME + " - " + MAX_VOLUME );
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // Boolean Method
    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    // toString() Method
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s, channel=%s\n",getBrand(),volumeString,
                getDisplay(),getCurrentChannel());

//        return "Television: brand =" + getBrand() + " , volume = " + volumeString +
//                " , display= " + getDisplay();
    }
}