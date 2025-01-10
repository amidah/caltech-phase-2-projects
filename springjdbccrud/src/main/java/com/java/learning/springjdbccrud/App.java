package com.java.learning.springjdbccrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learning.springjdbccrud.db.DB;
import com.java.learning.springjdbccrud.model.Dish;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");	
    
        DB db = (DB) context.getBean("db");
        
//        Dish dish1 = new Dish(0, "Noodles", 200);
//        Dish dish2 = new Dish(0, "Burger", 100);
//        Dish dish3 = new Dish(0, "Pizza", 500);
//        
//        db.insertDish(dish1);
//        db.insertDish(dish2);
//        db.insertDish(dish3);
        db.getDishes();
        db.getDishById(1);
    }
}
