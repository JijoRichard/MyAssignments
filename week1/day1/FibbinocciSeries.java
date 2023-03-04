package week1.day1;

import java.util.Iterator;

public class FibbinocciSeries {

	public static void main(String[] args) {
		
		int firstNum =0;
		int secNum =1;
		int sum =0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <=9; i++) {
			// 0 1 1 2 3 5 8 13 21 34 55 89 144 
//			System.out.println(sum);
			sum = firstNum+secNum;//5
			firstNum = secNum;//2
			secNum = sum;//3
			System.out.println(sum);
			
		}
		
	}
}
