/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
class Television {
    // class-level (static) shard variables -these live up in that shaared common area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static  int instanceCount = 0;

    // static method
    public static int getInstanceCount() {
        return instanceCount;
    }

    // - - - - - - - - - - - - - - - - - -

    // attributes or properties, called "fields" or "instance variables"
    private String brand = "Toshiba";
    private static int volume;
    private boolean isMuted;
    private int oldVolume;

    // functions or operations, called "methods" in Java
    // constructor ctors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand); //delegate to setter for any calidation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);       //delegate to ctor above me for brand
        setVolume(volume); //handle volume myself, by delegating to its setter
    }
    // Business Method
    public void turnOn() {
        boolean isConnected = this.verifyInternetConnection(); //this. means its pooling one method from other
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }
    // Business Method
    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }
    /*
    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }
    */

    // Accessor Method
        public String getBrand() {
        return brand;
    }
    // constraint: must
    public void setBrand(String brand) {
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
    }
    public int getVolume() {
        return volume;
    }
    // data constraint: must be [ 0-100] - use your class contants (MIN/MAX_VOLUME)
    public void setVolume(int volume) {
        if (MIN_VOLUME<= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.println("Error, must be in range of " + MIN_VOLUME + " - " + MAX_VOLUME );
        }
    }

    /*
    public boolean getIsMuted() {
        return isMuted;
    }
    */

    /*
    public void setIsMuted(boolean isMuted) {
        this.isMuted = isMuted;
    }
    */

    // Boolean Method
    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }
     /*
    public boolean isMuted() {
        return true;
    }
    */

    // toString() Method
    public String toString() {
        return "Television: brand =" + getBrand() + " , volume = " + getVolume();
    }
}
