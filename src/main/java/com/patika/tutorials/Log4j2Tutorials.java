package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Builder
@Log4j2
public class Log4j2Tutorials {
    private String adi;
    private String soyadi;
    private String numarasi;

    public Log4j2Tutorials(){
        this.adi="Adinizi giriniz";
        this.soyadi="Soyadinizi giriniz";
        this.numarasi="Numaranızı giriniz";
    }

    public static void main(String[] args) {
       Log4j2Tutorials tutorials = new Log4j2Tutorials();
        System.out.println(tutorials);

        if("Adinizi giriniz".equals(tutorials.getAdi())){
            log.error("Adinizi girmediniz !");
        } else {
            log.info("Bilgiler girildi");
        }

    }
}
