package prj_ArrayTest1;

import java.util.Arrays;
import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		
		int test[] = { 12, 34, 2, 344, 22, -2, -3, -90, 77, -4 };
		RandomName array = new RandomName(test);
		List<int[]> drecksListe = Arrays.asList(test);   
		
		System.out.println("Original Array: " + Arrays.toString(test));
		array.output(array.moveEverything());
		array.output(array.negativeToZero());
		array.output(array.findThirdLargest());
		array.output(array.getAverage());
		array.output(array.sumOfArray());
		System.out.println(drecksListe);
	}
}