package week1.day2;


public class FindDuplicates {

	public static void main(String[] args) {
		//output: 2,5,7
		int[] nums = {2,5,7,7,5,9,2,3};
		
		for (int i = 0; i < nums.length; i++) {//num[0]=2
			for (int j = i+1; j < nums.length; j++) {//
				if (nums[i]==nums[j]) {
				
					System.out.println("Duplicate num is "+nums[i]);
				}
			}
			
		}
	}
}
