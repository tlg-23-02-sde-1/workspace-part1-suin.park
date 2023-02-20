package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); // delegate to superclass ctor for name, hireDate
        setRate(rate);         // handle rate myself, by delegating to its setter
        setHours(hours);       // handle hours myself, by delegating to its setter
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return String.format("HourlyEmployee name=%s, hireDate=%s, rate=%s, hours=%s",getName(),
                getHireDate(),getRate(),getHours());
    }
}