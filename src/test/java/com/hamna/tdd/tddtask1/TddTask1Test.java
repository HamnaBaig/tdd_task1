package com.hamna.tdd.tddtask1;

import org.junit.Test;
import org.junit.Assert;

public class TddTask1Test {
	@Test
	public void verifySumArray() {
		TddTask1 sArray = new TddTask1();
		String input = "1 2 3";
		int sum =sArray.sumArray(input);
		Assert.assertEquals(6, sum);	
	}

	@Test
	public void verifyValidValue() {
		TddTask1 vValue = new TddTask1();
	    String[] array = {"100", "200000"};
		boolean validValue =  vValue.getValidValue(array);
		Assert.assertEquals(false, validValue);
	}
}
