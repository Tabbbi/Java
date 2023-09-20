package prj_Exam;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.setValue(100);
		myCalc.output(myCalc.add(myCalc.getValue(), 5));
		myCalc.output(myCalc.sub(myCalc.getValue(), 5));
		myCalc.output(myCalc.mul(myCalc.getValue(), 5));
		myCalc.output(myCalc.div(myCalc.getValue(), 5));
		myCalc.output(myCalc.div(myCalc.getValue(), 1));
		myCalc.output(myCalc.exp(myCalc.getValue(), 5));
	}	
}