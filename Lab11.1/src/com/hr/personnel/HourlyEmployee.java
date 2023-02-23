package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee  {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();  // ctor chaining
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); // delegate to superclass ctor for name, hireDate
        setRate(rate);         // handle rate myself, by delegating to its setter
        setHours(hours);       // handle hours myself, by delegating to its setter
    }

    //business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly: " + (getRate() * getHours()));
        // other way double payment = getRate() * getHours();
        // sout (getName() + " is paid hourly: " + payment);
    }

    @Override
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods
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

    @Override
    public String toString() {
        return super.toString() + ", rate= " + getRate() + ", hours= " + getHours();
        // return String.format("HourlyEmployee name=%s, hireDate=%s, rate=%s, hours=%s",getName(), getHireDate(), getRate(), getHours());
    }
}