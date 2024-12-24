package com.java.learning.springexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.learning.springexample.bean.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * IOC - Inversion of Control
         * ==========================
         * 
         * Traditionally we create Objects using new operator and we write data inside it
         * Connection con1 = new Connection();
         * con1.setUrl("jdbc:mysql://localhost/eStore");
         * con1.setUsername("john.watson");
         * con1.setPassword("pass123");
         * System.out.println("con1 is: " + con1);
         */
    	
    	/*
    	 * As per IOC, let the Objects be created by the Spring Framework's IOC container
    	 * As a Developer, we will not create the Objects rather we will configure the Objects
    	 * We will use xml file like context xml file in which we will configure the Objects
    	 */
    	
    	// BeanFactory - IOC Container
    	//============================
    	
//    	String[] strArr = new String[1];
//    	strArr[0] = "context.xml";
//    	
//    	String[] strArr1 = new String[] {"context.xml"};
//    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext(strArr1);
//    	
//    	BeanFactory beanFactory = context;
//    	
//    	Connection con1 = (Connection) beanFactory.getBean("con1");
//   	
//    	Connection con2 = (Connection) beanFactory.getBean("con2");
//    	
//    	Connection con3 = (Connection) beanFactory.getBean("con3");
//    	
//    	System.out.println("Connection con1: " + con1);
//    	System.out.println("Connection con2: " + con2);
//    	System.out.println("Connection con3: " + con3);
//    	
    	// ApplicationContext - IOC Container
    	//=====================================
    	
    	String[] strArr = new String[1];
    	strArr[0] = "context.xml";
    	
    	String[] strArr1 = new String[] {"context.xml"};
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext(strArr1);
    	
    	Connection con1 = (Connection) context.getBean("con1");
   	
    	Connection con2 = (Connection) context.getBean("con2");
//    	
    	Connection con3 = (Connection) context.getBean("con3");
    	
    	System.out.println("Connection con1: " + con1);
    	System.out.println("Connection con2: " + con2);
    	System.out.println("Connection con3: " + con3);
    	
    	// here we have downcasted application context to configurable application context to get the close method
    	ConfigurableApplicationContext ctx = (ConfigurableApplicationContext) context;
    	
    	ctx.close();
    	
    	
    	
    	
    }
}
