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
	
	public static int findMaxSubArray(int[] arr, int targetSum) {
	    int left = 0;
	    int right = 0;
	    int sum = 0;
	    int longestLength = 0;
	    boolean foundTarget = false;

	    while (right < arr.length) {
	        sum += arr[right];

	        while (left <= right && sum > targetSum) {
	            sum -= arr[left];
	            left++;
	        }

	        if (sum == targetSum) {
	            longestLength = Math.max(longestLength, right - left + 1);
	            foundTarget = true;
	        } else if (sum < targetSum) {
	            // if sum is less than targetSum, reset sum and move both pointers to the right
	            sum = 0;
	            left = right + 1;
	        }

	        right++;
	    }

	    return foundTarget ? longestLength : arr.length;
	}




	public static void main(String[] args) {
		int[] arr = { -3, -6, -1, -8, -2, -5  };
		//int alt2 = findMaxSubArrayAllNumbers(arr, 0);
		int alt2 = findMaxSubArray(arr, -9);

		System.out.println("Max subarray universal solution way: " + alt2);
	}

}
