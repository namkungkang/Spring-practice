package com.example.springprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracApplication.class, args);

        final int a = 10;
        System.out.println(a);

        String b = "dsds";
        b = "asaa";
        System.out.println(b);

        final int c = 1;
        System.out.println(c);

        if(3>1) {
            System.out.println(true);
        }

        for(int i = 1; i<5; i++) {
            System.out.println(i);
        }


    }

}
