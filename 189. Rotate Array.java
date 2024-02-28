class Solution
{
  public void rotate (int[]nums, int k)
  {
	int[] karr = new int[k];
	int index = 0;
	if (k > nums.length)
	  {
		while (k != 0)
		  {
			int n = nums.length - 1;
			int last = nums[nums.length - 1];
			for (int i = nums.length - 2; i >= 0; i--)
			  {
				nums[n] = nums[i];
				n--;
			  }
			nums[0] = last;
			k--;
		  }
	  }
	else
	  {
		for (int i = nums.length - k; i < nums.length; i++)
		  {
			karr[index] = nums[i];
			index++;
		  }
		int[] rarr = new int[nums.length - k];
		int index1 = 0;
		for (int i = 0; i < nums.length - k; i++)
		  {
			rarr[i] = nums[i];
		  }
		for (int i = 0; i < karr.length; i++)
		  {
			nums[index1] = karr[i];
			index1++;
		  }
		for (int i = 0; i < rarr.length; i++)
		  {
			nums[index1] = rarr[i];
			index1++;
		  }
	  }
  }
}
