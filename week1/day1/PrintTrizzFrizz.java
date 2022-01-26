package week1.day1;

public class PrintTrizzFrizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value= 15;
		 if (value%3 == 0 && value%5 == 0)		
			System.out.println("value is Trizz and fizz");
		else if(value%5==0)
			System.out.println("value is Fizz");
		else if(value%3 ==0)
			System.out.println("value is Trizz");
		else
			System.out.println("Value Not Divisible By 3 or 5");
			
	
	
		

	}

}
