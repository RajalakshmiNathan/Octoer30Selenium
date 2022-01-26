package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		int[] arr= {1,2,3,4,7,6,8};
		int arrlength = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<arrlength;i++) 
		{
			if(arr[i]!=(i+1)) {
				System.out.println("Missing Element in Array:"+(i+1));
				break;
			}
//			else
//				System.out.println(arr[i]);
		}

	}

}
