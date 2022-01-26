package week1.day2;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArray[] = {12,123,34,78,546,23,23};
		
		int arrLength = numArray.length;
		Arrays.sort(numArray);
		
		System.out.println("smallest number in array:"+numArray[0]);
		System.out.println("second smallest number in array:"+numArray[1]);
		
		System.out.println("Largest number in array:"+numArray[arrLength-1]);
		System.out.println("Second Largest number in array:"+numArray[arrLength-2]);
		
		System.out.println("printing elements of sorted array");
		for(int i = 0 ; i < arrLength; i++)
		{
			System.out.println("numArray["+i+"]:"+numArray[i]);
		}
	}

}
