package com.vikas.dsa.practice.arrays;

public class BinarySearch {

	public static int binarySearch(int[] sortedArr, int start, int end, int target) {
		int idx = -1;
		int mid = (start + end) / 2;
		int midElement = sortedArr[mid];

		if (start == end) { // This is the breaking condition
			if (sortedArr[start] == target)
				idx = start;
			else
				idx = -1;
		} else {
			if (midElement == target) { // It means the match is exactly at half
				idx = mid;
			}

			else if (midElement > target) { // It means the target is in first half. Call recursively
				idx = binarySearch(sortedArr, start, mid - 1, target);
			} else if (midElement < target) { // It means the target is in second half
				idx = binarySearch(sortedArr, mid + 1, end, target);
			}
		}
		return idx;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7 };
		int idx = binarySearch(arr, 0, arr.length - 1, 1);
		System.out.println("Index of the search element is: " + idx);

	}

}
