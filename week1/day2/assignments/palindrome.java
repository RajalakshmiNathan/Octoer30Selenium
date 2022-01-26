package week1.day2.assignments;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int strLength = str.length();
		String strrev = "";
		//char[] charArr = str.toCharArray();
		for (int i=strLength-1;i>=0;i--)
		{
			strrev = strrev + str.charAt(i);
		}
		System.out.println("Reversed String:"+strrev);
		if (str.equals(strrev))
			System.out.println("The given string is a palindrome");
	}

}
