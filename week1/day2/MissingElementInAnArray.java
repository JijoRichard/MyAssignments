package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};

		Arrays.sort(arr);
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			 if (i+1!=arr[i]) {
				System.out.println("Missing element in an array is :"+(i+1));
				break;
			}
			
		}
		
	}
}
