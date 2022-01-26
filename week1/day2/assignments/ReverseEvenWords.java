package week1.day2.assignments;

public class ReverseEvenWords {

	public String StringManipulate(String temp)
	{
		
	char charArr[] = temp.toCharArray();
	//char charRev[];
	String reversedString = new String();
	for (int j=charArr.length-1;j>=0;j--)
	{
		reversedString = reversedString+ charArr[j];
	}
	return reversedString;
	}
	
	public static void main(String[] args) {
		
		ReverseEvenWords r = new ReverseEvenWords();
		// TODO Auto-generated method stub
		String input = "I am software engineer";
		//String output;
		String[] splitWords = input.split(" ");
		String strrev;
		int splitArrayLength = splitWords.length;
		System.out.println("Array length:"+splitArrayLength);
		for(int i=0 ; i<splitArrayLength; i++) {
			if((i+1)%2 == 0) {
				strrev = r.StringManipulate(splitWords[i]);
				System.out.print(" "+strrev);
				//System.out.print(" "+splitWords[i]);
			  }
			else
				System.out.print(" "+splitWords[i]);
			
			
			}
		}




}



