package com.java.learning.dependencyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learning.dependencyinjectiondemo.bean.Restaurant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Dependency Injection" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        Restaurant restaurant = (Restaurant) context.getBean("restaurantRef");
        
        System.out.println(restaurant);
    }
}
