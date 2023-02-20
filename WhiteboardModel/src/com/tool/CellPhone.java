package com.tool;

import java.util.Arrays;

public class CellPhone {
/** Properties/type
 *  brand, model, yearManufacture, price
 */

/** method/function
 *  call, browseInternet, playGame, text
 */

/**object
 * CellPhone C1 = new CellPhone();
 * c1.brand = apple;
 * c1.model = iphone 14 plus; how can i put int with string is 14 string
 * c1.price = $1400
 */
    public static final int MIN_MODEL = 1;
    public static final int MAX_MODEL = 25;
    public static final String[] VALID_BRANDS = {"Samsung", "Apple", "Google"};

    private String brand;
    private int model;
    private int price;
    private SoftwareType soft = SoftwareType.Android;

    //ctor - constructors
    public CellPhone() {
        //no op
    }
    public CellPhone(String brand) {
        setBrand(brand);
    }
    public CellPhone(String brand, int model) {
        this(brand);        // delegate to brand-only ctor above for brand
        setModel(model);    // handle model myself, by delegating to its setter
    }
    public CellPhone(String brand, int model, int price) {
        this(brand, model); // delegate to the 2 -arg ctor above for brand, type
        setPrice(price);    // handle strings myself, by delegating to its setter
    }
    public CellPhone(String brand, int model, int price, SoftwareType software) {
        this(brand, model, price);
        setSoft(software);
    }

    // business or "action" methods
    public void answerCall() {
        System.out.println("Answer call on your " + getBrand() + getModel() + " with price of $" + getPrice());
    }

    public void declineCall() {
        System.out.println("Decline call on your " + getBrand() + getModel() + " with price of $" + getPrice());
    }

    // accessor method
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {
                this.brand = brand;
                return;
            }
        }
        System.out.println("Invalid brand: " + brand + ". Valid brands are: " + Arrays.toString(VALID_BRANDS));
    }
    private static boolean isValidBrand(String brand) {
        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {
                return true;
            }
        }
        return false;
    }
        /*
        switch (brand) {
            case "Samsung":
            case "Apple":
            case "Google":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid Brand = " + brand + " It must be either Samsung, Apple, Google");
        }
        */
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (MIN_MODEL <= model && model <= MAX_MODEL) {
            this.model = model;
        }
        else {
            System.out.println("Invalid Model Number. Should be between " + MIN_MODEL + " to " + MAX_MODEL);
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SoftwareType getSoft() {
        return soft;
    }

    public void setSoft(SoftwareType soft) {
        this.soft = soft;
    }

    public String toString() {
        return String.format("Cellphone brand= %s, model= %s, price= %s and software= %s",
                getBrand(),getModel(),getPrice(),getSoft());
    }
}