package com.example.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Pizza extends Menú {
    private final String pomodoro;
    private final String mozzarella;
    private List<Topping> toppings;

    public Pizza(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.pomodoro = "pomodoro";
        this.mozzarella = "mozzarella";
    }

    public Pizza(String nome, int calorie, double prezzo, List<Topping> toppings) {
        super(nome, calorie, prezzo);
        this.pomodoro = "pomodoro";
        this.mozzarella = "mozzarella";
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + super.getNome() + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
