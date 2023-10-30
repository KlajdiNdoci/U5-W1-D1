package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Pizza extends Menú {
    private final String pomodoro;
    private final Topping mozzarella;

    public Pizza(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.pomodoro = "pomodoro";
        this.mozzarella = getMozzarella();
    }
}
