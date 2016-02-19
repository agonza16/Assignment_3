package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator myCalc = new Calculator();
		
		assertNotEquals(myCalc,null);
		assertNotNull(myCalc);
	}

	@Test
	public void testGetTotal() {
		Calculator myCalc = new Calculator();
		
		int result = myCalc.getTotal();
		assertEquals(0,result);
		
		myCalc.add(4);
		int newResult = myCalc.getTotal();
		assertEquals(4,newResult);
		
		myCalc.divide(2);
		int newResult2 = myCalc.getTotal();
		assertNotEquals(4,newResult2);
		assertEquals(2,newResult2);
		
	}

	@Test
	public void testAdd() {
		
		Calculator myCalc = new Calculator();
		
		myCalc.add(3);
		int result = myCalc.getTotal();
		assertEquals(3,result);
		
		myCalc.add(10);
		int result2 = myCalc.getTotal();
		assertNotEquals(3, result2);
		assertEquals(13, result2);
		
		myCalc.add(0);
		int result3 = myCalc.getTotal();
		assertEquals(13, result3);
		
		myCalc.add(-14);
		int result4 = myCalc.getTotal();
		assertEquals(-1, result4);
		
	}

	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		
		int currentTotal1 = myCalc.getTotal();
		assertEquals(0,currentTotal1);
		
		myCalc.subtract(3);
		int currentTotal2 = myCalc.getTotal();
		assertNotEquals(0 , currentTotal2);
		assertEquals(-3, currentTotal2);
		
		myCalc.add(10);
		myCalc.subtract(5);
		int currentTotal3 = myCalc.getTotal();
		assertEquals(2, currentTotal3);
		
		myCalc.subtract(0);
		int currentTotal4 = myCalc.getTotal();
		assertEquals(2, currentTotal4);
		
		myCalc.subtract(-10);
		int currentTotal5 = myCalc.getTotal();
		assertNotEquals(-8, currentTotal5);
		assertEquals(12, currentTotal5);
		
	}

	@Test
	public void testMultiply() {
		
		Calculator myCalc = new Calculator();
		
		int currentTotal1 = myCalc.getTotal();
		assertEquals(0,currentTotal1);
		
		myCalc.multiply(200);
		int currentTotal2 = myCalc.getTotal();
		assertEquals(0,currentTotal2);
		
		myCalc.add(1);
		myCalc.multiply(15);
		int currentTotal3 = myCalc.getTotal();
		assertNotEquals(1,currentTotal3);
		assertEquals(15,currentTotal3);
		
		myCalc.multiply(0);
		int currentTotal4 = myCalc.getTotal();
		assertNotEquals(15,currentTotal4);
		assertEquals(0,currentTotal4);
		
		myCalc.add(4);
		myCalc.multiply(-3);
		int currentTotal5 = myCalc.getTotal();
		assertNotEquals(12,currentTotal5);
		assertEquals(-12,currentTotal5);
	}

	@Test
	public void testDivide() {
		
		Calculator myCalc = new Calculator();
		
		int currentTotal1 = myCalc.getTotal();
		assertEquals(0,currentTotal1);
		
		myCalc.add(10);
		myCalc.divide(3);
		int currentTotal2 = myCalc.getTotal();
		assertNotEquals(3.33, currentTotal2);
		assertNotEquals(4, currentTotal2);
		assertEquals(3, currentTotal2);
		
		myCalc.divide(0);
		int currentTotal3 = myCalc.getTotal();
		assertNotEquals(3, currentTotal3);
		assertEquals(0, currentTotal3);
		
		myCalc.divide(-3);
		int currentTotal4 = myCalc.getTotal();
		assertNotEquals(-3, currentTotal4);
		assertEquals(0, currentTotal4);
		
		myCalc.add(1);
		myCalc.divide(-2);
		int currentTotal5 = myCalc.getTotal();
		assertNotEquals(3, currentTotal5);
		assertEquals(0, currentTotal5);
		
		myCalc.add(10);
		myCalc.divide(-2);
		int currentTotal6 = myCalc.getTotal();
		assertEquals(-5, currentTotal6);
	}

	@Test
	public void testGetHistory() {
		
		Calculator myCalc = new Calculator();
		String historyString = myCalc.getHistory();
		assertEquals("0", historyString);
		
		myCalc.add(5);
		myCalc.multiply(2);
		myCalc.divide(1);
		myCalc.subtract(4);
		myCalc.subtract(-10);
		String historyString2 = myCalc.getHistory();
		System.out.print(historyString2);
		assertNotEquals("0+5*2/1-4--10", historyString2);
		assertEquals("0 + 5 * 2 / 1 - 4 - -10", historyString2);
		
		
	}

}
