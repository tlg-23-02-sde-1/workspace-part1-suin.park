package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * OPTION 4: try-catch, but then throw a different one.
     * We are "nesting" the underlying  'cause' exception into a higher-level,
     * more HR-Oriented exception, for our HR-Oriented client.
     */
    public void goToWork() throws WorkException {
        Car c = new Car("TKE123", "Ford", "Maverick");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop(); // IMPORTANT to stop() the Car, no matter what
        }
    }
    /*
     * OPTION 3: try-catch, "respond" in some way, and then re-throw.
     * "catch-and-rethro"
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Ford", "Maverick");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Email sent to Lisa Herbold to complain");
            throw e;
        }
          finally {
            c.stop(); // IMPORTANT to stop() the Car, no matter what
        }
    }
    */

    /*
     * OPTION 2: "PUNT", don't handle any thrown exception at all
     * Because the exception in question is CHECKED, I MUST say "throws."
     * NOTE that a try-finally can be used for the regular finally reasons.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Ford", "Maverick");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop(); // IMPORTANT to stop() the Car, no matter what
        }
    }
     */

    /*
     * OPTION 1: try-catch-finally and handle any thrown exception.
     */
    /*
    public void goToWork() {
        Car c = new Car("TKE123", "Ford", "Maverick");

        try {
            c.start();
            c.moveTo("West Seattle");
            }
        catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
            }
        finally {
            c.stop();  // IMPORTANT TO stop() the Car, no matter what
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}