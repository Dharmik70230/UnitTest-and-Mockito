package com.phoenix.math.tests;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 21-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

public class CalculatorServiceTests {

	private static CalculatorService calse;

	@BeforeClass
	public static void initAll() {
		calse = new CalculatorService(new Calculator());
	}

//	@Before
//	public void init() {
//		calse = new CalculatorService(new Calculator());
//	}

	@Test
	public void testAddition() {
		assertEquals(30, calse.addition(10, 20));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		assertEquals(2, calse.division(10,0));
	}

//	@After
//	public void clean() {
//		calse = null;
//	}

	@AfterClass
	public static void cleanAll() {
		calse = null;
	}

}
