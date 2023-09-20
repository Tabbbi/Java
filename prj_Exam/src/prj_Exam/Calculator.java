package prj_Exam;

public class Calculator {	
	private double value;
	
	// add
	public double add(double pNumber1, double pNumber2) {
		double result = pNumber1 + pNumber2;
		if ((result > Double.MAX_VALUE) || (pNumber1 > Double.MAX_VALUE) || (pNumber2 > Double.MAX_VALUE)) {
			System.out.print("Error, Number or Result to big. ");
			return 0;
		} else if ((result < Double.MIN_VALUE) || (pNumber1 < Double.MIN_VALUE) || (pNumber2 < Double.MIN_VALUE)) {
			System.out.print("Error, Number or Result to small. ");
			return 0;
		} else {
		return result;
		}
	}
	
	// subtract
	public double sub(double pNumber1, double pNumber2) {
		double result = pNumber1 - pNumber2;
		if ((result > Double.MAX_VALUE) || (pNumber1 > Double.MAX_VALUE) || (pNumber2 > Double.MAX_VALUE)) {
			System.out.print("Error, Number or Result to big. ");
			return 0;
		} else if ((result < Double.MIN_VALUE) || (pNumber1 < Double.MIN_VALUE) || (pNumber2 < Double.MIN_VALUE)) {
			System.out.print("Error, Number or Result to small. ");
			return 0;
		} else {
		return result;
		}
	}
	
	// multiply
	public double mul(double pNumber1, double pNumber2) {
		double result = pNumber1 * pNumber2;
		if ((result > Double.MAX_VALUE) || (pNumber1 > Double.MAX_VALUE) || (pNumber2 > Double.MAX_VALUE)) {
			System.out.print("Error, Number or Result to big. ");
			return 0;
		} else if ((result < Double.MIN_VALUE) || (pNumber1 < Double.MIN_VALUE) || (pNumber2 < Double.MIN_VALUE)) {
			System.out.print("Error, Number or Result to small. ");
			return 0;
		} else {
		return result;
		}
	}
	
	// divide
	public double div(double pNumber1, double pNumber2) {
		double result = pNumber1 / pNumber2;
		if ((pNumber1 == 0) || (pNumber2 == 0)) {
			System.out.print("Error, impossible. ");
			return 0;
		} else if ((result > Double.MAX_VALUE) || (pNumber1 > Double.MAX_VALUE) || (pNumber2 > Double.MAX_VALUE)) {
			System.out.print("Error, Number or Result to big. ");
			return 0;
		} else if ((result < Double.MIN_VALUE) || (pNumber1 < Double.MIN_VALUE) || (pNumber2 < Double.MIN_VALUE)) {
			System.out.print("Error, Number or Result to small. ");
			return 0;
		} else {
		return result;
		}
	}
	
	// exponentiate
	public double exp(double pNumber1, double pNumber2) {
		double result = Math.pow(pNumber1, pNumber2);
		if ((result > Double.MAX_VALUE) || (pNumber1 > Double.MAX_VALUE) || (pNumber2 > Double.MAX_VALUE)) {
			System.out.print("Error, Number or Result to big. ");
			return 0;
		} else if ((result < Double.MIN_VALUE) || (pNumber1 < Double.MIN_VALUE) || (pNumber2 < Double.MIN_VALUE)) {
			System.out.print("Error, Number or Result to small. ");
			return 0;
		} else {
		return result;
		}
	}
	
	// Console output
	public void output(double pOutput) {
		System.out.println(pOutput);
	}
	
	// Getters and Setters
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}