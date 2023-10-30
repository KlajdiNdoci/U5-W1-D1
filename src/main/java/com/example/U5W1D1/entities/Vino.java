package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Vino extends Bevanda {
    private final double alcol;


    public Vino(String calorie, double prezzo) {
        super(calorie, prezzo);
        this.alcol = 13;
    }
}
