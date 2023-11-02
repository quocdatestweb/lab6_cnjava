package com.example.lab6.BAI3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //read spring java configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.input("Đây là bài 3 lab 6");
        textEditor.save();
    }
}
