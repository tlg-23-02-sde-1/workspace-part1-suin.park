package com.tool.client;

import com.tool.CellPhone;
import com.tool.SoftwareType;
import com.tool.SoftwareType;

class CellPhoneClient {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        c1.setBrand("Samsung");
        c1.setModel(20);
        c1.setPrice(1_500);
        c1.setSoft(SoftwareType.Android);

        c1.answerCall();
        c1.declineCall();
        System.out.println();

        CellPhone c2 =new CellPhone("Apple", 14,1_700, SoftwareType.Apple_ios);
        c2.answerCall();
        c2.declineCall();
        System.out.println();

        CellPhone c3 = new CellPhone("Huawei");
        c3.answerCall();
        c3.declineCall();
        System.out.println();

        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);
    }
}