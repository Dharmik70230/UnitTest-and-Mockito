package com.phoenix.math.test;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 21-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
		
		@Mock
		private CalculatorService calSe;
		
		@InjectMocks
		private Calculator cal;
		
		@Before
		public void initService() {
			// creating mock object
	//		calSe = Mockito.mock(CalculatorService.class);
	//		calSe = Mockito.spy(CalculatorService.class);
	//		calSe = Mockito.spy(new CalculatorService(new Calculator()));

			
		}
		
		@Test
		public  void testAddition() {
			//creating mock behavior of mock object
			Mockito.when(calSe.addition(10, 20)).thenReturn(50);
//		Mockito.when(calSe.addition(10, 20)).thenCallRealMethod();
			
			assertEquals(50, calSe.addition(10, 20));
			
		}
		
		@After
		public void clean() {
			calSe = null;
		}
		

	}

