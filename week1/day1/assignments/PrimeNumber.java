package week1.day1.assignments;

//import org.apache.poi.util.SystemOutLogger;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input = 21;
        int validateInput = Math.round(input/2);
        int count =0;
        for (int i=2;i<=validateInput;i++)
        {
        	if( input%i == 0)
        	{ 
 //       		System.out.println("i"+i);
        		count = count +1;
        	}
        }
        if (count == 0)
        	System.out.println("The given number is prime."+ input);
        else
        	System.out.println("The given number is not prime."+ input +"Count:"+count);
	}

}
