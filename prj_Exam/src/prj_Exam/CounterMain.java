package prj_Exam;

public class CounterMain {

	public static void main(String[] args) {
		System.out.println("" + sum(5));
	}
	
	public static int sum(int pNumber) {
		int result = 0;
		for (int i = 0; i <= pNumber; i++) {
			result = result + i;
		}
		return result;
	}
}
