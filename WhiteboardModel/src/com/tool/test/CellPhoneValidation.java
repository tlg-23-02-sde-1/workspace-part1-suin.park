package com.tool.test;

import com.tool.CellPhone;

class CellPhoneValidation {

    public static void main(String[] args) {

        CellPhone phone = new CellPhone();

        phone.setModel(8);
        System.out.println("model: " + phone.getModel());

        phone.setModel(18);
        System.out.println("model: " + phone.getModel());

        phone.setBrand("Samsung");
        System.out.println("brand: " + phone.getBrand());

        phone.setBrand("Invalid");
        System.out.println("brand: " + phone.getBrand());

    }
}