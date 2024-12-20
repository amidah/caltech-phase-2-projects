package com.java.learning.junit_ecom;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
//public class AppTest 
//    extends TestCase
//{
//	
//	PromoCodes promoCodes;
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//        promoCodes = new PromoCodes();
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//    
//    public void testPromoCode() {
//    	assertEquals(0.20, promoCodes.getDiscounts("BINGO"));
//    }
//    
//    public void testIncorrectPromoCode() {
//    	assertEquals(0.05, promoCodes.getDiscounts("BINGO1"));
//    }
//    
//    public void testAmountAfterDiscount() {
//    	assertEquals(600.0, promoCodes.getAmountAfterDiscount("JUMBO", 1000));
//    }
//    
//    public void testAmountAfterDiscountWithIncorrectPromoCode() {
//    	assertEquals(950.0, promoCodes.getAmountAfterDiscount("JUMBO1", 1000));
//    }
//    
//    public void testAmountAfterDiscountWithTaxes(){
//    	assertEquals(708.0, promoCodes.getAmountAfterDiscountWithTaxes("JUMBO",1000));
//    }
//    
//}

public class AppTest {

	PromoCodes promoCodes = new PromoCodes();

	@BeforeAll
	static void initAll() {
		System.out.println("Before All the Mehtods Execution...");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All the Mehtods Execution...");
	}

	/**
	 * @BeforeEach - it makes this method to run before each test method execution
	 */
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before Each Method....");
	}

	/**
	 * @AfterEach - it makes this method to run after each test method execution
	 */
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After Each Method....");
	}

	/**
	 * @Test - it makes this method to run as a test method, it can be considered as
	 *       a single test case
	 */
	@Test
	public void testPromoCode() {
		System.out.println("testPromoCode");
		assertEquals(0.20, promoCodes.getDiscounts("BINGO"));
	}

	@Test
	public void testIncorrectPromoCode() {
		System.out.println("testIncorrectPromoCode");
		assertEquals(0.05, promoCodes.getDiscounts("BINGO1"));
	}

	@Test
	public void testAmountAfterDiscount() {
		System.out.println("testAmountAfterDiscount");
		assertEquals(600.0, promoCodes.getAmountAfterDiscount("JUMBO", 1000));
	}

	/**
	 * @Disabled - it disables or ignores this method to run as a part of all the
	 *           test methods execution
	 */
	@Disabled
	@Test
	public void testAmountAfterDiscountWithIncorrectPromoCode() {
		System.out.println("testAmountAfterDiscountWithIncorrectPromoCode");
		assertEquals(950.0, promoCodes.getAmountAfterDiscount("JUMBO1", 1000));
	}

	@Disabled
	@Test
	public void testAmountAfterDiscountWithTaxes() {
		System.out.println("testAmountAfterDiscountWithTaxes");
		assertEquals(708.0, promoCodes.getAmountAfterDiscountWithTaxes("JUMBO", 1000));
	}

	@Test
	public void testBasic() {
		System.out.println("testBasic");
		assertEquals("JUMBO", promoCodes.luckyPromoCode(0), "Sorry!! This promo code is not available for this number");
		assertEquals("SUNDAY", promoCodes.luckyPromoCode(4), "Sorry!! This promo code is not available for this number");
	}

	@Test
	public void testGroup() {
		System.out.println("testGroup");
		assertAll("One of the promo codes discount is invalid",
				() -> assertEquals(0.4, promoCodes.getDiscounts("JUMBO"), "Sorry promo code discount is not matching with the expected value"),
				() -> assertEquals(0.2, promoCodes.getDiscounts("BINGO")),
				() -> assertEquals(0.5, promoCodes.getDiscounts("HAPPY50"))
				);
	}
	
	@Test
	public void testLuckyPromoCode() {
		Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> promoCodes.luckyPromoCode(6));
		
		assertEquals("Index 6 out of bounds for length 5", exception.getMessage());
	}

}
