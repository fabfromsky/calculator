package main.java.math;

/**
 * Class of calcul methods
 * @author fabinthesky
 *
 */
public class Calc {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return sum a + b
	 */
	public long addition (long a, long b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return difference a - b;
	 */
	public long substraction  (long a, long b) {
		return a - b;
	}
	
	public long multiplication (long a, long b) {
		return a * b;
	}
	
	public float division (long a, long b) {
		return a /b;
	}
	
	public long square (long a) {
		return a*a;
	}
	
//	public float squareroot (long a) {
//		
//		return a[i];
//	}
		
	
	public double exponentiel (float a) {
		return Math.exp(a);
	}
	
	public double logN (float a) {
		return Math.log(a);
	}
	
	public double log (float a) {
		return Math.log(a)/log(10);
	}
	
	public float divisionpar2(int a) {
		return (float)a/2;
	}
}
