package com.java.learning.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learning.springannotation.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring Framework Autowired Demo" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        User user = (User) context.getBean("user");
        
        System.out.println(user);
    }
}
