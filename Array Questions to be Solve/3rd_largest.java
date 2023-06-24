// Third largest element
// Difficulty Level : Basic
// Given an array of distinct elements. Find the third largest element in it.

// Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.

// Example 1:

// Input:
// N = 5
// A[] = {2,4,1,3,5}
// Output: 3
// Example 2:

// Input:
// N = 2
// A[] = {10,2}
// Output: -1
// Your Task:
// Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ A[i] ≤ 105

// Company Tags :
// Amazon Microsoft MakeMyTrip 

// Topic Tags :
// Arrays Data Structures 
//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    if(n < 3) return -1;
	    
	    int first = a[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
	    for(int i=1; i<n; i++){
	        if(a[i] > first){
	            third = second;
	            second = first;
	            first = a[i];
	        }
	        else if(a[i] > second){
	            third = second;
	            second = a[i];
	        }
	        else if(a[i] > third){
	            third = a[i];
	        }
	    }
	    return third;
    }
}