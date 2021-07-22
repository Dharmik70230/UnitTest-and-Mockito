package com.phoenix.math.test;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 21-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 21-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;

	// initialization logic
	//@BeforeEach
	@BeforeAll
	public static void init() {
		calService = new CalculatorService(new Calculator());
	}

	// test method
	@Test
	public void testAddition() {

		int expectedResult = 30;
		int actualResult = calService.addition(10, 20);

		assertEquals(expectedResult, actualResult);
		//assertNotEquals(expectedResult, actualResult);
	}
	@Test
	public void checkError() {
		
		assertThrows(ArithmeticException.class , () ->  calService.division(10,0));
	}
	@Test
	public void testDivision() {

		assertEquals(2, calService.division(10, 5));
		//assertNotEquals(expectedResult, actualResult);
	}

	// clean up logic
	//@AfterEach
	@AfterAll
	public  static void clean() {
		calService = null;
	}
}
