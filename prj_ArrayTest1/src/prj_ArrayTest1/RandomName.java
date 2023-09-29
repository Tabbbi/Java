package prj_ArrayTest1;

import java.util.Arrays;

public class RandomName 
{
	private int[] array;
	public String output = "";
	
	RandomName(int[] pArray) 
	{
		this.array = pArray;
	}
	
	public void output(String pOutput) 
	{
		System.out.println(pOutput);
	}
	
	public String findThirdLargest() 
	{
		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		
		for (int i = 0; i < this.array.length; i++) 
		{
			if (this.array[i] > largest) 
			{
				secondLargest = largest;
				largest = this.array[i];
			}
			else if (this.array[i] > secondLargest) 
			{
				thirdLargest = secondLargest;
				secondLargest = this.array[i];
			} 
			else if (this.array[i] > thirdLargest) 
			{
				thirdLargest = this.array[i];
			}
		}
		output = "The third largest number is " + thirdLargest + ".";
		return output;
	}
	
	public String moveEverything() 
	{
		int tLast = this.array[this.array.length - 1];
		
		for (int i = this.array.length - 1; i > 0; i--) 
		{
			this.array[i] = this.array[i - 1];
		}
		
		this.array[0] = tLast;
		
		output = "This is the Array moved one to the right: " + Arrays.toString(this.array);
		return output;
	}
	
	public String negativeToZero() 
	{
		for (int i = 0; i < this.array.length; i++) 
		{
			if (this.array[i] < 0) 
			{
				this.array[i] = 0;
			}
		}
		
		output = "This is the Array without negative values: " + Arrays.toString(this.array);
		return output;
	}
	
	public String getAverage() 
	{
		float sum = 0;
		float average = 0;
		
		for (int i = 0; i < this.array.length; i++) 
		{
			sum = sum + this.array[i];
		}
		
		average = sum / (this.array.length);
		
		output = "The avereage value is: " + average + ".";
		return output;
	}
	
	public String sumOfArray()
	{
		float sum = 0;
		
		for (int i = 0; i < this.array.length; i++) 
		{
			sum = sum + this.array[i];
		}
		
		output = "The sum of all values is: " + sum + ".";
		return output;
	}
}