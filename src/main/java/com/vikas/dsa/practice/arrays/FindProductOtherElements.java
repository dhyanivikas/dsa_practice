package com.vikas.dsa.practice.arrays;

public class FindProductOtherElements {

	public static int findOtherProduct(int totalProduct, int currElement) {

		return totalProduct / currElement;

	}

	public static int[] scanArray(int[] arr) {
		int totalNonZeroProduct = 1;
		int[] prodArr = new int[arr.length];
		// find if zeros are > 1
		int totalZeros = 0;
		for (int i : arr) {
			if (i == 0) {
				totalZeros++;
			}
			totalNonZeroProduct *= (i == 0 ? 1 : i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (totalZeros < 2) { // It means only 1 zero or none
				int otherProduct;
				if (totalZeros != 0) { // It means there is ONE zero element

					otherProduct = findOtherProduct(arr[i] == 0 ? totalNonZeroProduct : 0, arr[i] == 0 ? 1 : arr[i]);
				} else { // It means all elements as NON ZERO
					otherProduct = findOtherProduct(totalNonZeroProduct, arr[i]);
				}
				prodArr[i] = otherProduct;
			} else {
				prodArr[i] = 0;
			}
		}

		return prodArr;

	}

	public static void main(String[] args) {
		int[] ip = { 1, 2, 0, 3, 0 };
		int[] op = scanArray(ip);

		for (int i : op) {
			System.out.println("Product of other elements: " + i);
		}
	}

}
