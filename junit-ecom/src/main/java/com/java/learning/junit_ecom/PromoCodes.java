package com.java.learning.junit_ecom;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	List<String> promoCodes;
	TreeMap<String, Double> promoCodesWithDiscounts;
	
	public PromoCodes() {
		promoCodes = Arrays.asList("JUMBO", "BINGO", "HAPPY50", "TRYNEW90", "SUNDAY");
		promoCodesWithDiscounts = new TreeMap<String, Double>();
		promoCodesWithDiscounts.put(promoCodes.get(0), 0.40);
		promoCodesWithDiscounts.put(promoCodes.get(1), 0.20);
		promoCodesWithDiscounts.put(promoCodes.get(2), 0.50);
		promoCodesWithDiscounts.put(promoCodes.get(3), 0.90);
		promoCodesWithDiscounts.put(promoCodes.get(4), 0.25);
	}
	
	Double getDiscounts(String promoCode) {
	
		Double discount = null;
		if(promoCodesWithDiscounts.containsKey(promoCode)) {
			discount = promoCodesWithDiscounts.get(promoCode);
		}
		else {
			discount = 0.05;
		}
		
		return discount;
		
	}
}
