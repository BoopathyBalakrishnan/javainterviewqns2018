package mergesort;

public class MyMergeSort {
	
	int[] inputArr = { 6, 42, 2, 32, 15, 8, 23, 4 };
	int[] tempArr = new int[inputArr.length];
	
	public void doMerge(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle = lowerIndex +(higherIndex-lowerIndex)/2;
			doMerge(lowerIndex, middle);
			doMerge(middle+1,higherIndex);
		}
	}
	
	public void mergeHalfs(int lowerIndex, int middle,int higherIndex)
	{
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			tempArr[i] = inputArr[i];
		}
		
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		while(i<=middle && j<=higherIndex)
		{
			
		}
	}

}
