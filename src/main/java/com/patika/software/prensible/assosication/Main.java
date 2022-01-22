package com.patika.software.prensible.assosication;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Musteri musteri = Musteri.builder().adi("Turgay").sehir("Giresun").build();
        SuperMarket superMarket = SuperMarket.builder().adi("XYZ").sehir("Giresun").build();

        log.info("Müşteri adi " + musteri.getAdi() + " Süpermarket adi: " + superMarket.getAdi());

    }
}
