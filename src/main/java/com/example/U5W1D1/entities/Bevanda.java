package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Bevanda extends Menú {
    private double litri;

    public Bevanda(String nome, int calorie, double prezzo, double litri) {
        super(nome, calorie, prezzo);
    }
}

