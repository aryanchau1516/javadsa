package ARRAYS;
/*
 * Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
Time Complexity: O(N), as we are using a loop to traverse N times.
Auxiliary Space: O(1), as we are not using any extra space.
 */

import java.io.*;

class GFG 
{
	

static void printDuplicates(int arr[], int n)
{
	int i;
	int fl = 0;
    for (i = 0; i < n; i++) 
	{

		// Check if current element is
		// repeating or not. If it is
		// repeating then value will
		// be greater than or equal to n.
		if (arr[arr[i] % n] >= n) 
		{

			// Check if it is first
			// repetition or not. If it is
			// first repetition then value
			// at index arr[i] is less than
			// 2*n. Print arr[i] if it is
			// first repetition.
			if (arr[arr[i] % n] < 2 * n) 
			{
				System.out.print( arr[i] % n + " ");
				fl = 1;
			}
		}

		// Add n to index arr[i] to mark
		// presence of arr[i] or to
		// mark repetition of arr[i].
		arr[arr[i] % n] += n;
	}

	// If flag variable is not set
	// then no repeating element is
	// found. So print -1.
	if (!(fl > 0))
		System.out.println("-1");
}

// Driver Code
public static void main (String[] args) 
{
	int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
	int arr_size = arr.length;
	printDuplicates(arr, arr_size);
}
}

// This code is contributed by anuj_67.
