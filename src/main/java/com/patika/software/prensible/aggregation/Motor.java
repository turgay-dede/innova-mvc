package com.patika.software.prensible.aggregation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class Motor { // Arabaya baglı degildir
    private String fiyat;
    private double gucu;

    public double getMotorFiyati() {
        return 1200;
    }

}
