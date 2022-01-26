package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5;
		int fact= 1;
		for (int i = number; i > 0; i--) {
			fact = fact*i;
		} 
		
		System.out.println("Factorial of "+number+ " is "+fact);

	}

}
