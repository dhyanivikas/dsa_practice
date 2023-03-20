package com.vikas.dsa.practice.arrays;

public class SumMaxSubArray {

	public static int findMaxSubArrayAllNumbers(int[] arr, int targetSum) {
		int sum = 0;
		int longestLength = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				int curr = j;
				sum = 0;
				while (curr <= i) {
					sum += arr[curr];
					curr++;
					if (sum == targetSum) {
						longestLength = Math.max(longestLength, (curr - j));
					}
				}
			}

		}

		return longestLength;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { -3, -6, -1, -8, -2, -5  };
		int alt2 = findMaxSubArrayAllNumbers(arr, 0);
		

		System.out.println("Max subarray universal solution way: " + alt2);
	}

}
