package week1.day2.assignments;

public class CharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int numCount =0;
		char temp = 0;
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length-2;i++)
		{
			numCount =1;
			//System.out.println("Iterating for character:"+charArr[i]);
			for(int j=i+1; j<charArr.length-1;j++)
			{
//			if(i == j)
//				continue;
			//System.out.println("comparing "+ charArr[i] +" "+charArr[j]);
			if (charArr[i] == charArr[j])
			{
				numCount = numCount+1;
				temp = charArr[i];
			}
			}
			
			if(numCount>1)
			{
				System.out.println("charcter in position :"+i+"has multiple occurances:"+ temp);
			}
		}
	
	}

}
