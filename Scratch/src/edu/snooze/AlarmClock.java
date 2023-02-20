package edu.snooze;

/*
 * System or "business class" to model the working of an alarm clock.
 * This class definition has no main() method - most classe don't
 */
class AlarmClock {
    // class-level ("static") fields
    // there is only one copy of these, and they live up in that class-wide common area
    // NOT in each instance (AlarmClock object)
    // final means it is locked down. It will not be changed.
    public static final int MIN_INTERVAL = 1;  // "class constants" , not hiding this information.
    public static final int MAX_INTERVAL = 20;

    // attributes or properties, in Java these are called "fields" or "instance variables"
    private int snoozeInterval = 5; // default value when client does not specify one
    private int repeat = 10;        // number of times it goes off

    // Constructors
    public AlarmClock() {
        // sync time
    }

    public  AlarmClock(int snoozeInterval) {
        this();                             // delegate to no-art ctor above (e.g., for time sync)
        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval); // delegate to ctor above me for snoozeInterval
        setRepeat(repeat);    // handle repeat myself, by delegating to its setter
    }

    // functions ("methods" in Java) - what can AlarmClock objects DO?
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // "accessor" methods - provide "controlled access" to the object's internal (private) data
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // date constraint: must be [1-20] (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ", must be in range of " + MIN_INTERVAL + " to " + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval() +
                ", repeat = " + getRepeat(); //name of the class in ""
    }

}