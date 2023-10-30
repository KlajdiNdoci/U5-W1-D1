package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Bevanda extends Menú {
    private double litri;

    public Bevanda(String calorie, double prezzo) {
        super(calorie, prezzo);
    }
}
