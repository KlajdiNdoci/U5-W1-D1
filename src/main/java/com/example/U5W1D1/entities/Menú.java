package com.example.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class Menú {
    private String nome;
    private int calorie;
    private double prezzo;
}
