package com.example.U5W1D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
        System.out.println(ctx.getBean("mozzarellaTopping"));

        System.out.println(ctx.getBean("margherita"));
        System.out.println(ctx.getBean("diavola"));
        System.out.println(ctx.getBean("hawaiana"));

        ctx.close();
    }
}
