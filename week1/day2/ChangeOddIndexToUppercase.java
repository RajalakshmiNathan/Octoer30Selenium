package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		char charArray[] = str.toCharArray();
		int strLength = str.length();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2 != 0)
			{
			char temp =Character.toUpperCase(charArray[i]);
			System.out.println("char converted to uppercase:"+temp);
			}
			else
			{
				System.out.println("character unaltered"+charArray[i]);
			}
		}
	}
}