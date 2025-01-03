package com.java.learning.inheritancedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learning.inheritancedemo.bean.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Spring Core inheritance Configuration" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        Pizza pizza = (Pizza) context.getBean("pizza");
        
        System.out.println(pizza);
    }
}
