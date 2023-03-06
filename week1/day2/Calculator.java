package week1.day2;

public class Calculator {

	
	public int add(int a, int b, int c) {
		int sum = 0;
		sum = a+b+c;
		return sum;
	}
	
	public int mul(int x, int y) {
		int result = 0;
		result = x*y;
		return result;
		
	}
	
	public void sub() {
		int q = 10;
		int w = 4;
		System.out.println("sub :"+(q-w));
	}
	
}
