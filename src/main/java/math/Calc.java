package main.java.math;

/**
 * Class of calcul methods
 * @author fabdoublehesky
 *
 */
public class Calc {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return sum a + b
	 */
	public double addition (double a, double b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return difference a - b;
	 */
	public double substraction  (double a, double b) {
		return a - b;
	}
	
	public double multiplication (double a, double b) {
		return a * b;
	}
	
	public double division (double a, double b) {
		return a / b;
	}
	
	public double square (double a) {
		return a * a;
	}
	
//	public float squareroot (double a) {
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
	
	public double divisionpar2(double a) {
		return a/2;
	}
}
