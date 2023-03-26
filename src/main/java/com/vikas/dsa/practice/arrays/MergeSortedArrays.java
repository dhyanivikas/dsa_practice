package com.vikas.dsa.practice.arrays;

public class MergeSortedArrays {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {

		int[] finalArr = new int[arr1.length + arr2.length];

		int counter1 = 0;
		int counter2 = 0;
		int i = 0;
		while (counter1 < arr1.length || counter2 < arr2.length) {
			if (counter1 == arr1.length) {
				// It means I have reached at the end of arr1 and NOT 2
				finalArr[i] = arr2[counter2];
				counter2++;

			} else if (counter2 == arr2.length) {
				// It means I have reached at the end of arr2 and NOT 1
				finalArr[i] = arr1[counter1];
				counter1++;

			} else {
				if (arr1[counter1] < arr2[counter2]) {
					finalArr[i] = arr1[counter1];
					counter1++;
				} else {
					finalArr[i] = arr2[counter2];
					counter2++;
				}

			}

			i++;
		}
		return finalArr;

	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 5,9,12,15,17};
		int[] arr2 = { 4, 6, 7, 8 ,16,19,36};

		int[] fin = mergeArrays(arr1, arr2);
		for (int i : fin) {
			System.out.println(i);
		}
	}

}
