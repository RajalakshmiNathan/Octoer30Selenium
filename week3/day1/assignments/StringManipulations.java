package week3.day1.assignments;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		System.out.println("String replace 8 with 11:"+sentence.replace("8", "11"));
		String appendString = sentence+"#";
		System.out.println("String append with#"+appendString);
		//get characters from 5 to 14
		System.out.println("characters from 5 to 14:"+ sentence.substring(5, 14));
	}

}
