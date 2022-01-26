package week3.day1;

public class Calculator {
	
	  public void add(int num1,int num2) {
		   System.out.println(num1+num2);
	   }
	   
	   public void add(int num1,int num2,int num3) {
		   System.out.println(num1+num2+num3);
	   }
	   
	   public void multiply(int num1,int num2) {
		   System.out.println(num1*num2);
	   }
	   
	   public void multiply(int num1,double num2) {
		   System.out.println(num1*num2);
	   }
	   
	   public void subtract(int num1,int num2) {
		   System.out.println(num1-num2);
	   }
	   
	   public void subtract(double num1,double num2) {
		   System.out.println(num1-num2);
	   }
	   public void divide(double num1,int num2) {
		   System.out.println(num1/num2);
	   }
	   
	   public void divide(int num1,int num2) {
		   System.out.println(num1/num2);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add(23, 44);
		calc.add(34,44,54);
		calc.multiply(21, 34.4444);
		calc.multiply(45, 54);
		calc.subtract(23.45556, 76.8888);
		calc.subtract(76.45555, 56.88888);
		calc.divide(45.66666, 2);
		calc.divide(65, 5);
	}

}
