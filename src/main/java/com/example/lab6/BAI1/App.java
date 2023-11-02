package com.example.lab6.BAI1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
public class App
{
    public static void main( String[] args )
    {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println();
        //retrieve bean from spring container
        Product pr1 = (Product) context.getBean("myPropertyProduct");
        System.out.println(pr1.toString());

        Product pr2 = (Product) context.getBean("myConstructorArgProduct");
        System.out.println(pr2.toString());

        Product pr3 = (Product) context.getBean("mySingletonProduct");
        System.out.println(pr3.toString());

        Product pr4 = (Product) context.getBean("myConstructorArgProduct");
        System.out.println(pr4.toString());

        //close the context
        context.close();
    }
}
