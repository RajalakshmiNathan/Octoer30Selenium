package week1.day2.assignments;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd class of Automation$$";
		int letter =0, space = 0, num=0, specialChar = 0;
		char charArr[]  = test.toCharArray();
		for(int i=0; i<charArr.length;i++)
		{
			if(Character.isLetter(charArr[i]))
					{
					letter+=1;
					}
			else if(Character.isDigit(charArr[i]))
			{
				num +=1;
			}
			else if(charArr[i] == ' ')
			{
				space+=1;
			}
			else
			{
				specialChar +=1;
				
			}
			
		}
		
		System.out.println("Letter:"+ letter);
		System.out.println("Numbers:"+num);
		System.out.println("Space:"+space);
		System.out.println("specialCharacter:"+ specialChar);
	}

}
