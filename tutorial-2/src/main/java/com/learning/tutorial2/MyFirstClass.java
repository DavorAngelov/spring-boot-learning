package com.learning.tutorial2;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class MyFirstClass {
    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from my first class ==> myVar = " + myVar;
    }

}
