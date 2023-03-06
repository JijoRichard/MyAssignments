package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Sum : "+calc.add(2, 3, 5));
		System.out.println("Mul : "+calc.mul(6, 4));
		calc.sub();
		int addNum = calc.add(8, 5, 0); // Ctrl+2 -> release, then press enter
		System.out.println(addNum);
	}
	
}
