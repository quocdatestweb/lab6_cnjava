package com.example.lab6.BAI4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.input("Câu 4 lab 6");
        textEditor.save();
    }
}
