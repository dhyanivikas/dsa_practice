package com.vikas.dsa.practice.arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GetSmallestMissingPositiveNumber {

	public static int findSmallestMissingPositiveNumber(int[] arr) {
		int ret = arr[0];
		Set<Integer> missing = new HashSet<Integer>();
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> diff = new HashSet<Integer>();
		for(int i: arr) {
			seen.add(i);
			if(missing.contains(i)) {
				missing.remove(i);
				missing.add(i+1);
			}
			else {
			missing.add(i+1);
			}
		}
		
		missing.removeAll(seen);
		int j = 0;
		for(int i : missing) {
			if(j == 0) {
			ret = i;
			}
			else {
				if (i < ret) {
					ret = i;
				}
			}
			j++;
		}
		
		return ret;
	}

	public static void main(String[] args) {
		int[] arr = { 4,1,2,6};
		int missing = findSmallestMissingPositiveNumber(arr);
		System.out.println("Smallest missing positive number is: "+missing);

	}

}
