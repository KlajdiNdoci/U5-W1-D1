package com.example.U5W1D1.entities;

import lombok.Getter;

@Getter
public class Topping extends Menú {

    public Topping(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Topping(nome='" + getNome()
                + "', calorie=" + getCalorie()
                + ", prezzo=" + getPrezzo()
                + ")";
    }
}
