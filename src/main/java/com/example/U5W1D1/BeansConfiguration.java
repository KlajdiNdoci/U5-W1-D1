package com.example.U5W1D1;

import com.example.U5W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    Topping getMozzarella() {
        return new Topping("mozzarella", 92, 0.69);
    }

    @Bean
    Topping getProsciutto() {
        return new Topping("prosciutto", 35, 0.99);
    }

    @Bean
    Topping getCipolla() {
        return new Topping("cipolla", 22, 0.69);
    }

    @Bean
    Topping getAnanas() {
        return new Topping("ananas", 24, 0.79);
    }

    @Bean
    Topping getSalame() {
        return new Topping("salame", 86, 0.99);
    }
    

}
