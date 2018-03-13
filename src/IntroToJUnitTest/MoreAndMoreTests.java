package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	
	public String multiply(int x, int y) {
		String answer = x + " x " + y + " = " + (x*y);
		return answer;
	}
	

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	public boolean isPrime(int num) {
		int counter = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				counter++;
			}
			
		}
		
		if(counter>2) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	@Test
     public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	public boolean isSquare(int num) {
		
		//double n =  (double) num;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				
				if(j == i && j*i == num) {
					return true;
				}
				
			}
		
		}
		return false;
		
		
		
	}
	
	
	
	
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	public boolean isCube(int num) {
		
		for(int i = 1; i<= num; i++) {
			for(int j = 1; j<= num; j++) {
				for(int k = 1; k <= num; k++) {
					
					if(i == j && j == k && i*j*k== num) {
						return true;
					}
					
					
					
				}
			}
		}
		
		return false;
		
	}

}
