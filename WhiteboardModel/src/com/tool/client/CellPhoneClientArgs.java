package com.tool.client;

import com.tool.CellPhone;
import com.tool.SoftwareType;

class CellPhoneClientArgs {

    public static void main(String[] args) {
        if(args.length<4) {
            String usage = "Usage: java CellPhoneClientArgs <brand> <model> <price> <software>";
            String example = "Example: java CellPhoneClientArgs Samsung 20 1100 Android";
            String note = "Note: supported softwares are Android and Apple Ios";
            String note1 = "Note: Valid brands are Samsung, Apple, and Google";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note1);
        }

        String brand = args[0];
        int model = Integer.parseInt(args[1]);
        int price = Integer.parseInt(args[2]);
        SoftwareType soft = SoftwareType.valueOf(args[3]);

        CellPhone cellPhone = new CellPhone(brand,model,price,soft);

        System.out.println("Congratulations on your order!");
        System.out.println("Your custom cellphone is on its way!");
        System.out.println(cellPhone); // toString() automatically called
    }

}