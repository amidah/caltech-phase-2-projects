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
		if (promoCodesWithDiscounts.containsKey(promoCode)) {
			discount = promoCodesWithDiscounts.get(promoCode);
		} else {
			discount = 0.05;
		}

		return discount;

	}

	Double getAmountAfterDiscount(String promoCode, double amount) {
		Double amountAfterDiscount = null;

		if (promoCodesWithDiscounts.containsKey(promoCode)) {
			Double discount = promoCodesWithDiscounts.get(promoCode);
			amountAfterDiscount = amount - amount * discount;
		} else {
			amountAfterDiscount = amount - amount * 0.05;
		}

		return amountAfterDiscount;

	}

	Double getAmountAfterDiscountWithTaxes(String promoCode, double amount) {

		Double amountAfterDiscount = getAmountAfterDiscount(promoCode, amount);
		Double amountAfterDiscountWithTaxes = amountAfterDiscount + 0.18 * amountAfterDiscount;

		return amountAfterDiscountWithTaxes;

	}
	
	boolean checkPromoCode(String promoCode) {
		return promoCodes.contains(promoCode.toUpperCase());
	}
	
	String luckyPromoCode(int luckyNumber) {
		return promoCodes.get(luckyNumber);
	}
}
