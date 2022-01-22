package com.patika.tutorials;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LombokTutorials {
    private String adi;
    private String soyadi;
    private String numarasi;

    public static void main(String[] args) {
        LombokTutorials lombokTutorials = LombokTutorials.builder()
                .adi("Turgay")
                .soyadi("Dede")
                .numarasi("5300000000")
                .build();
        System.out.println(lombokTutorials);
    }

}
