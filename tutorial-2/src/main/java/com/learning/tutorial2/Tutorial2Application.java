package com.learning.tutorial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tutorial2Application {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Tutorial2Application.class, args);

        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
//        System.out.println(myFirstService.getJavaVersion());
//        System.out.println(myFirstService.getOsName());
//        System.out.println(myFirstService.readProp());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());
        System.out.println(myFirstService.getCustomProperty());

    }


}
