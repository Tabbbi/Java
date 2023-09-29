package arrayTest;

public class Program {

	public static void main(String[] args) 
	{
		int[] array = {12, 34, 2, 344, -2, -3, -90, 77, -4};
		
		RandomName r1 = new RandomName(array);
		System.out.println(r1.findThirdLargest());
	}
}
