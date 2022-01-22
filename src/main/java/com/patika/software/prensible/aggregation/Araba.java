package com.patika.software.prensible.aggregation;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Araba { // Araba motara baglidir
    @Getter
    @Setter
    private Motor motor;

    public double getToplamFiyat(){
        motor = new Motor();
        return motor.getMotorFiyati()+2000;
    }
}
