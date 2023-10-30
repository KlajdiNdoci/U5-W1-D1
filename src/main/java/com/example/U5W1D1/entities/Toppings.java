package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Toppings extends Menú {
    private String nome;

    public Toppings(String calorie, double prezzo) {
        super(calorie, prezzo);
    }
}
