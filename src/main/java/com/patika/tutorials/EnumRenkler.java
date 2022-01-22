package com.patika.tutorials;

import lombok.Getter;
import lombok.Setter;

public enum EnumRenkler {
    MAVI,YESIL,TURUNCU
}
enum Renkler2 {
    MAVI(1,"mavi"),YESIL(2,"yesil"),TURUNCU(3,"turuncu");

    @Getter @Setter
    private final int renkId;

    @Getter @Setter
    private final String renkAdi;

    private Renkler2(int renkId, String renkAdi) {
        this.renkId = renkId;
        this.renkAdi = renkAdi;
    }
}

class Deneme {
    public static void main(String[] args) {
        EnumRenkler renkler = EnumRenkler.MAVI;
        System.out.println(renkler);
        String renkler2 = EnumRenkler.MAVI.toString();
        System.out.println(renkler2.toLowerCase());
        System.out.println("************************");

        String cons = Renkler2.MAVI.getRenkAdi();
        System.out.println(cons);


    }

}
