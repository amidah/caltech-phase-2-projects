package com.java.learning.junit_ecom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to my Ecom App" );
        
        PromoCodes promoCodes = new PromoCodes();
        
        System.out.println("Discount: " + promoCodes.getDiscounts("JUMBO"));
        
        System.out.println("Discount with Incorrect Promo Code: " + promoCodes.getDiscounts("JUMBO1"));
        
        System.out.println("Amount after discount: " + promoCodes.getAmountAfterDiscount("JUMBO", 1000));
        
        System.out.println("Amount after discount with Incorrect Promo Code: " + promoCodes.getAmountAfterDiscount("JUMBO1", 1000));
        
        System.out.println("Amount after discount with taxes: " + promoCodes.getAmountAfterDiscountWithTaxes("JUMBO", 1000));
    }
}
