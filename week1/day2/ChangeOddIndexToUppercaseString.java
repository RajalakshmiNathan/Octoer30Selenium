package week1.day2;

public class ChangeOddIndexToUppercaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		//char charArray[] = str.toCharArray();
		int strLength = str.length();
		for (int i = 0; i < strLength; i++) {
			if(i%2 != 0)
			{
		
			char temp =Character.toUpperCase(str.charAt(i));
			System.out.print(temp);
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
