package com.phoenix.math.services;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 21-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.math.Calculator;


public class CalculatorService {

	
	private Calculator calci;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calci) {
		super();
		this.calci = calci;
	}
	//application business logic method
	public int addition(int a,int b) {
		return calci.add(a, b);
	}
	public int division(int x,int y) {
		return calci.divide(x, y);
	}
}
