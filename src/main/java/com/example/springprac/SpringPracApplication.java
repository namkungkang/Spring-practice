package com.example.springprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracApplication.class, args);

        //class 문
        var test = new Test(); //object
        System.out.println(test.name);
        test.hello();
        //constructor 문
        var fri = new Friend("남");
        System.out.println(fri.name);

    }

}

class Test {
    String name = "나"; //class 안의 변수는 filed 혹은 attribute

    void hello() { //class 안의 함수는 method
        System.out.println("안녕");
    }
}

//constructor 문
class Friend {
    String name = "kim";
    int age = 20;

    Friend(String hole) {       //constructor(파라미터 여러 개 가능)
        this.name = hole; // =<

    }
}

