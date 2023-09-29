package arrayTest;

public class RandomName {
	private int[] array;
	
	RandomName(int[] pArray)
	{
		this.array = pArray;
	}
	
	public int findThirdLargest() 
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
		return thirdLargest;
	}
	
	
	public void moveEverythingByOne()
	{
		
	}
}
