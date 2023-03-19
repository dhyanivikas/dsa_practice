package com.vikas.dsa.practice.arrays;

public class FindMinMax {

	public static void findMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}

		System.out.println("Maximum element: " + max);
		System.out.println("Minimum element: " + min);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 8, 2, 9 };
		findMinMax(arr);

	}

}
