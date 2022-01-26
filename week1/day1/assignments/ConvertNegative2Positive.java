package week1.day1.assignments;

public class ConvertNegative2Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -40;
		if (number < 0) {
			number = number * -1;
			System.out.println("Input value is negative.Converted value:"+number);
		}
		else
			System.out.println("Input value is already a positive value");
	}

}
