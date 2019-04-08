package com.capgemini.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.demo.MathApplication;
import com.capgemini.demo.exception.InvalidInputException;
import com.capgemini.demo.service.CalculatorService;

public class MathApplicationTest {

	@Mock
	private CalculatorService service;

	@InjectMocks
	MathApplication application = new MathApplication(service);

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testPerformAdditionWithTwoPositiveIntegers() {
		when(service.addition(6, 4)).thenReturn(10);
		assertEquals(10, application.performAddition(6, 4));
	}
	@Test
	public void testPerformAdditionWithTwoNegativeIntegers() {
		when(service.addition(-4,-2)).thenReturn(-6);
		assertEquals(-6, application.performAddition(-4,-2));
	}
	@Test
	public void testPerformAdditionWithOnePositiveAndOneNegativeInteger() {
		when(service.addition(7, -9)).thenReturn(-2);
		assertEquals(-2,application.performAddition(7,-9));
	}
	
	@Test
	public void testPerformSubtractionWithTwoPositiveIntegers() {
		when(service.addition(6, 4)).thenReturn(2);
		assertEquals(2, application.performAddition(6, 4));
	}
	@Test
	public void testPerformSubtractionWithTwoNegativeIntegers() {
		when(service.addition(-4,-2)).thenReturn(-2);
		assertEquals(-2, application.performAddition(-4,-2));
	}
	@Test
	public void testPerformSubtractionWithOnePositiveAndOneNegativeInteger() {
		when(service.addition(7, -9)).thenReturn(16);
		assertEquals(16,application.performAddition(7,-9));
	}
	
	@Test
	public void testPerformMultiplicationWithTwoPositiveIntegers() {
		when(service.addition(6, 4)).thenReturn(24);
		assertEquals(24, application.performAddition(6, 4));
	}
	@Test
	public void testPerformMultiplicationWithTwoNegativeIntegers() {
		when(service.addition(-4,-2)).thenReturn(-6);
		assertEquals(-6, application.performAddition(-4,-2));
	}
	@Test
	public void testPerformMultiplicationWithOnePositiveAndOneNegativeInteger() {
		when(service.addition(7, -9)).thenReturn(-63);
		assertEquals(-63,application.performAddition(7,-9));
	}
	@Test(expected = ArithmeticException.class)
	public void testPerformDivisionWithDivisorZero() {
		doThrow(new ArithmeticException("/ by zero")).when(service).division(10, 0);
		application.performDivision(10, 0);
	}
	@Test
	public void testPerformDivisionWithTwoPositiveIntegers() {
		when(service.addition(4, 2)).thenReturn(2);
		assertEquals(2, application.performAddition(4,2));
	}
	@Test
	public void testPerformDivisionWithTwoNegativeIntegers() {
		when(service.addition(-8,-2)).thenReturn(4);
		assertEquals(4, application.performAddition(-8,-2));
	}
	@Test
	public void testPerformDivisionWithOnePositiveAndOneNegativeInteger() {
		when(service.addition(24, -12)).thenReturn(-2);
		assertEquals(-2,application.performAddition(24,-12));
	}

	@Test
	public void testFindFactorialWithPositiveInteger() throws InvalidInputException {
		when(service.factorial(5)).thenReturn(120L);
		assertEquals(120, application.findFactorial(5));
	}

	@Test(expected = InvalidInputException.class)
	public void testFindFactorialWithNegativeInteger() throws InvalidInputException {
		doThrow(new InvalidInputException("Negative number")).when(service).factorial(-5);
		application.findFactorial(-5);
	}
	
	@Test
	public void testFindSquareWithPositiveIntiger() {
		when(service.square(5)).thenReturn(25L);
		assertEquals(25, application.findSquare(5));
	}
	@Test
	public void testFindSquareWithNegativeIntiger() {
		when(service.square(-5)).thenReturn(-25L);
		assertEquals(-25, application.findSquare(-5));
	}
	
	


}
