package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		//2 3 5 7 11 13 17 19 23 
		int num = 97;
		int remainder=0;
		
		for (int i = 2; i < num; i++) {
			remainder = num%i;
//			System.out.println(i+"-"+remainder);
			if (remainder==0) {
				break;
			}		
		}
		if (remainder!= 0) {
			System.out.println("Given number "+num+ " is a prime number");
		}
		else {
			System.out.println("Given number "+num+ " is not a prime number");
		}
			
		
	}

}
