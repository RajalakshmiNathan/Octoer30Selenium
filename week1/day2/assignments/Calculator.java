package week1.day2.assignments;

public class Calculator {
	
//	int num1=12;
//	int num2=6;
//	int num3=3;
	
	public int add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int sum;
		sum = num1+num2+num3;
		return sum;
	}
	
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		int diff;
		diff= num1-num2;
		return diff;
	}
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		double product;
		product = num1*num2;
		return product;
	}
	public float divide(float num1,float num2) {
		// TODO Auto-generated method stub
		float divisor;
		divisor = num1/num2;
		return divisor;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc= new Calculator();
		System.out.println("Addtion:"+ calc.add(10,8,2));
		System.out.println("Subtraction:"+ calc.sub(10,8));
		System.out.println("Multiplication:"+ calc.mul(10.4343454,8.32432));
		System.out.println("Division:"+ calc.divide(6,3));
	}

}
